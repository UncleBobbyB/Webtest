<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>会员注册页面</title>
</head>
<body>
  <div class="" style="text-align: center;">注册会员信息 <br>
    <form class="" action="<%=request.getContextPath()%>/register.html" method="post">
      <table border="1">
        <tr>
          <td>登录名：</td>
          <td> <input type="" name="username"> <td>
        </tr>
        <tr>
          <td>密码：</td>
          <td> <input type="password" name="passwd" value=""> </td>
        </tr>
        <tr>
          <td>密码确认：</td>
          <td> <input type="password" name="confirmPasswd" value=""> </td>
        </tr>
        <tr>
          <td>邮箱地址：</td>
          <td> <input type="" name="email" value=""> </td>
        </tr>
        <tr align="center">
          <td colspan="2"> <input type="submit" name="" value="提交"> </td>
        </tr>
      </table>
    </form>
  </div>
</body>
</html>
