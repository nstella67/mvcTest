package net.control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginForm extends HttpServlet {
	//결과확인
	//http://localhost:9090/mvcTest/login.do
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//method=get 방식 요청
		//페이지 이동
		//1) 제어권 이동
		//		현재페이지와 이동한 페이지가 별개
		//resp.sendRedirect("control/loginForm.jsp");
		
		//2) 현재페이지에서 발생한 
		//		요청(req), 응답(resp)객체를 가지고 이동
		//		전진
		String view="control/loginForm.jsp";
		RequestDispatcher rd=req.getRequestDispatcher(view);
		rd.forward(req, resp);
		
	}//doGet() end

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//method=post 방식 요청
	}//doPost() end
	
	
}//class end
