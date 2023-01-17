<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="dto.Kadaidto" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>下記の内容で登録します。よろしいですか？</p>
	<%
		Kadaidto account = (Kadaidto)session.getAttribute("input_data");
	%>
	名前：<%=account.getName() %><br>
	年齢：<%=account.getAge() %><br>
	性別：<%=account.getSeibetu() %><br>
	電話番号：<%=account.getNumber() %><br>
	メール：<%=account.getEmail() %><br>
	パスワード：********<br>
	<a href="KadaiRegisterExecuteServlet">OK</a><br>
	<a href="kadaiFormServlet">戻る</a>
</body>
</html>