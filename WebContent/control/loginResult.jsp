<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
	<head>
		<meta charset="UTF-8">
		<title>loginResult.jsp</title>
	</head>
	
	<body>
		<h3>* 로그인 결과 *</h3>
		1) JSP <br>
		아이디 : <%=request.getAttribute("r_uid") %><br>
		비번 : <%=request.getAttribute("r_upw") %><br>
		
		아이디 : <%=session.getAttribute("s_uid") %><br>
		비번 : <%=session.getAttribute("s_upw") %><br>
		
		아이디 : <%=application.getAttribute("a_uid") %><br>
		비번 : <%=application.getAttribute("a_upw") %><br>
		
		<hr>
		
		2) EL (표현언어) <br>
		아이디 : ${requestScope.r_uid }<br>
		비번 : ${requestScope.r_upw }<br>
		
		아이디 : ${sessionScope.s_uid }<br>
		비번 : ${sessionScope.s_upw }<br>
		
		아이디 : ${applicationScope.a_uid }<br>
		비번 : ${applicationScope.a_upw }<br>
		<hr>
		
		아이디 : ${r_uid }<br>
		비번 : ${r_upw }<br>
		
		아이디 : ${s_uid }<br>
		비번 : ${s_upw }<br>
		
		아이디 : ${a_uid }<br>
		비번 : ${a_upw }<br>
		<hr>
		${msg }
		<br>
		${img }
	</body>
</html>