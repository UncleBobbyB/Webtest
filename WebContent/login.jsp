<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="user" class="Bean.User" scope="session" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户登录</title>
</head>
<body>
  <p>用户登录</p>
  <form class="" action="check.jsp" method="post">
    <table border="1" width="250px;">
      <tr>
        <td width="75px;">用户名</td>
        <td><input type="" name="username" value="<jsp:getProperty name="user" property="username"/>">
        <span style="color:red"><%=user.getErrors("username")%> </span>
        <br/>
      </td>
      </tr>
      <tr>
        <td widt="75px;">密&nbsp;&nbsp;码</td>
        <td>
          <input type="password" name="passwd" value=""<jsp:getProperty name="user" property="passwd"/>">
          <span style="color:red"><%=user.getErrors("passwd")%></span>
          <br/>
        </td>
      </tr>
      <tr>
        <td colspan="2">
          <input type="submit" name="" value="提交">&nbsp;&nbsp;
          <input type="reset" name="" value="重置">
        </td>
      </tr>
    </table>
  </form>
</body>
</html>
