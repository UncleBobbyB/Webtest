<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("UTF-8"); %>
<jsp:useBean id="product" class="Bean.Product" scope="page"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>通过表单参数设置Bean属性值</title>
</head>
<body>
  <form class="" action="" method="post">
    <br/>
    输入产品名称： <input type="" name="product_name1" value=""><br/>
    输入产品编号： <input type="" name="product_id1" value=""><br/>
    输入产品价格： <input type="" name="price1" value=""><br/>
    输入产品信息： <input type="" name="info1" value=""><br/>
    <input type="submit" name="" value="提交">
  </form>
  <jsp:setProperty name="product" property="product_name" param="product_name1"/><br/>
  <%=product.getProduct_name()%>
  <jsp:setProperty name="product" property="product_id" param="product_id1"/><br/>
  <%=product.getProduct_id()%>
  <jsp:setProperty name="product" property="price" param="price1"/><br/>
  <%=product.getPrice()%>
  <jsp:setProperty name="product" property="info" param="info1"/><br/>
  <%=product.getInfo()%>

</body>
</html>
