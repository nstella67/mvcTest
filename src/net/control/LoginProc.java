package net.control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginProc extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		process(req, resp);
	}//doGet() end
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		process(req, resp);
	}//doPost() end
	
	protected void process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			req.setCharacterEncoding("UTF-8");	//???
			String uid=req.getParameter("uid").trim();
			String upw=req.getParameter("upw").trim();
			
			//session객체 선언
			HttpSession session=req.getSession();
			
			//applicatopn객체 선언
			ServletContext application=req.getServletContext();
			
			if(uid.equals("soldesk") && upw.equals("1234")) {
				//로그인 성공
				req.setAttribute("msg", "로그인성공!!");
				req.setAttribute("img", "<img src='control/해달.gif'>");
				
				req.setAttribute("r_uid", uid);
				req.setAttribute("r_upw", upw);
				
				session.setAttribute("s_uid", uid);
				session.setAttribute("s_upw", upw);
				
				application.setAttribute("a_uid", uid);
				application.setAttribute("a_upw", upw);
				
			}else {
				//로그인 실패
				req.setAttribute("msg", "로그인실패!!");
				req.setAttribute("img", "<img src='control/tenor.gif'>");
				
				req.setAttribute("r_uid", "geust");
				req.setAttribute("r_upw", "geust");
				
				session.setAttribute("s_uid", "geust");
				session.setAttribute("s_upw", "geust");
				
				application.setAttribute("a_uid", "geust");
				application.setAttribute("a_upw", "geust");
			}//if end
			
			//뷰페이지 이동
			String view="control/loginResult.jsp";
			RequestDispatcher rd=req.getRequestDispatcher(view);
			rd.forward(req, resp);
			
		}catch(Exception e) {
			System.out.println("요청실패 : "+e);
		}//try end
	}//process() end
	
}//class end
