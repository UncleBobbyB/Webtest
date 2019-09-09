<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="user" class="Bean.User" scope="session"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆成功</title>
</head>
<body>
  <div class="" style="text-align: center;">
    <h4>
      欢迎您：
      <span style="color: red">
        <jsp:getProperty property="username" name="user"/>
      </span>
      用户
    </h4>
  </div>
</body>
</html>
