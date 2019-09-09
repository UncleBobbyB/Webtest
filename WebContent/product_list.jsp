<%@ page language="java" import="java.util.*, Bean.pojo.Product" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="Bean.factory.DAOFactory" %>
<%request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询产品列表</title>
</head>
<body>
  <%String product_name = request.getParameter("product_name");
  List<Product> list = DAOFactory.getIEmpDAOInstance().findAll(product_name);
  %>
  <form class="" action="product_list.jsp" method="post">
    请输入产品名称： <input type="" name="product_name" value="">
    <input type="submit" name="" value="提交">
  </form>
  <table border="1">
    <tr>
      <td>产品编号</td>
      <td>产品名称</td>
      <td>产品价格</td>
      <td>产品信息</td>
    </tr>
    <%for (int i = 0; i < list.size(); i++) {
    	Product p = list.get(i);
    	%>
    <tr>
    	<td><%=p.getProduct_id() %></td>
    	<td><%=p.getProduct_name() %></td>
    	<td><%=p.getPrice() %></td>
    	<td><%=p.getInfo() %></td>
    </tr>
    <%} %>
  </table>
</body>
</html>
