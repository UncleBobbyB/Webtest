<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="user" class="Bean.User" scope="session"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>验证用户</title>
</head>
<body>
  <jsp:setProperty property="*" name="user"/>
  <%
    if (user.isValide()) {
  %>
  <jsp:forward page="success.jsp"/>
  <%
    } else {
  %>
  <jsp:forward page="login.jsp"/>
  <%}%>
</body>
</html>
