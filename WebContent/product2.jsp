<%@ page language="java" contentType="text/html; charset=UTF-8"
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
    <br>
      输入产品名称： <input type="" name="product_name" value=""><br>
      输入产品编号： <input type="" name="product_id" value=""><br>
      输入产品价格： <input type="" name="product_price" value=""><br>
      输入产品信息： <input type="" name="info" value=""><br>
      <input type="submit" name="" value="提交">
  </form>
  <jsp:setProperty property="*" name="product"/>
  <br/>产品名称是：
  <%=product.getProduct_name()%>
  <br/>产品编号是：
  <%=product.getProduct_id()%>
  <br/>产品价格是：
  <%=product.getPrice()%>
  <br/>产品名称是：
  <%=product.getInfo()%>
</body>
</html>
