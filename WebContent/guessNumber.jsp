<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%String path = request.getContextPath(); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>在线猜数字</title>
</head>
<%
	String flag = request.getParameter("flag");
String message = "";
if (flag != null && "larger".equals(flag)) {
	message = "太大了";
} else if (flag != null && "lesser".equals(flag)) {
	message = "太小了";
} else if (flag != null && "success".equals(flag)) {
	message = "猜对了";
}
%>
<body>
	<form action="<%=path %>/Guess" method="post">
	<span>请输入数字：</span>
	<input name="guessNumber" size="10">
	<span style="color: red"><%=message %></span>
	<input type="submit" value="提交">
	</form>
</body>
</html>