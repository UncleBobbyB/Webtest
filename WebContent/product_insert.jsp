<%@ page language="java" import="java.util.*, Bean.pojo.Product" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="Bean.factory.DAOFactory" %>
<%request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>执行添加产品</title>
</head>
<body>
	<%Product product = new Product();
	product.setProduct_id(request.getParameter("product_id"));
	product.setProduct_name(request.getParameter("product_name"));
	product.setPrice(Double.parseDouble(request.getParameter("price")));
	product.setInfo(request.getParameter("info"));
	boolean flag = DAOFactory.getIEmpDAOInstance().addProduct(product);
	if (flag) {
	%>
  <h4>添加产品信息成功</h4>
  <%} else {%>
  <h4>添加产品信息失败</h4>
  <%}%>
</body>
</html>
