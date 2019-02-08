<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html lang="ko">
	<head>
		<meta charset="UTF-8">
		<title>jstl/jstlTest3.jsp</title>
	</head>
	
	<body>
		<h3>* JSTL 함수 *</h3>
		<c:set var="txt" value="   white space  "></c:set>
		글자갯수 : ${fn:length(txt) }<br>		<!-- 16 -->
		<hr>
		<c:set var="txt" value="${fn:trim(txt) }"></c:set>
		글자갯수 : ${fn:length(txt) }<br>		<!-- 11 -->
		<hr>
		
		<c:set var="txt" value="Hi My name is waldo"></c:set>
		${fn:substring(txt, 3, 9) }				<!-- My nam -->
		<hr>
		${fn:substringAfter(txt, "Hi") }			<!-- My name is waldo -->
		<hr>
		${fn:substringBefore(txt, "waldo") }	<!-- Hi My name is -->
		<hr>
		
		${fn:startsWith("hello world!", "ld!") }<br>	<!-- false -->
		${fn:endsWith("hello world!", "ld!") }<br>		<!-- true -->
		${fn:indexOf("abcdefg", "f") }<br>				<!-- 5 -->
		${fn:replace("hi hello", "hello", "hi") }<br>	<!-- hi hi -->
		<hr>
		
		
		<!-- 엔터를 <br>로 바꾸기 -->
<%
		//1) JSP
		String content="";
		content.replace("\n", "<br>");
		
		//2) EL+JSTL
		pageContext.setAttribute("cn", "\n");
%>
		<c:set var="content" value="Hi 
		My name is
		waldo">
		</c:set>
		${fn:replace(content, cn, "<br>") }
		<hr>
		<!-- string에서 XML, HTML의 < > & ' "문자들을 각각 &lt; &gt; &amp; &#039; &#034;로 바꿔준 뒤 문자열을 리턴한다 -->
		<c:out value="${fn:escapeXml('< > &') }"/>
		
	</body>
</html>