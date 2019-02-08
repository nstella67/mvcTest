package net.control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Welcome extends HttpServlet {
	// 결과확인
	// http://localhost:9090/mvcTest/wel.do
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//<form method=get> 방식으로 요청했을 때
		try {
			// 문자열 응답 → AJAX
			//resp.setContentType("text/plain; charset=UTF-8");
			
			// HTML 문서구조로 응답
			resp.setContentType("text/html; charset=UTF-8");
			PrintWriter out=resp.getWriter();
			out.println("<!DOCTYPE html>");
			out.println("<html lang='ko'>");
			out.println("	<head>");
			out.println("		<meta charset='UTF-8'>");
			out.println("		<title>환영합니다</title>");
			out.println("	</head>");
			out.println("	<body>");
			out.println("		<strong>대한민국</strong>");
			out.println("		<hr>");
			out.println("		<span style='color:red'>오필승코리아</span>");
			out.println("		<hr>");
			out.println("		<table border='1'>");
			out.println("		<tr>");
			out.println("			<th>이름</th>");
			out.println("			<td>무궁화</td>");
			out.println("		</tr>");
			out.println("		</table>");
			out.println("	</body>");
			out.println("</html>");
			out.close();	//자원반납
			
		}catch(Exception e) {
			System.out.println("요청실패 : "+e);
		}//try end
	}//doGet() end

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//<form method=post> 방식으로 요청했을 때
	}//do post

}//class end
