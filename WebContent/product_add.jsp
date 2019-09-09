<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加产品信息</title>
</head>
<body>
  <form class="" action="product_insert.jsp" method="post">
    产品编号： <input type="" name="product_id" value=""> <br/>
    产品名称： <input type="" name="product_name" value=""> <br/>
    产品价格： <input type="" name="price" value=""> <br/>
    产品信息： <textarea name="info" rows="" cols=""></textarea><br/>
    <input type="submit" name="" value="添加">&nbsp;&nbsp;
    <input type="reset" name="" value="重置">
  </form>
</body>
</html>
