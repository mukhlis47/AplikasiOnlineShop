<%-- 
    Document   : customerdetail
    Created on : Dec 13, 2017, 3:12:12 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>${product.productNama}</h1>
        <p>
            Harga: ${product.harga} IDR
            Stok: ${product.stok} pcs
        </p>
        <a href="${pageContext.request.contextPath}/order/add/${c.id}">Add to cart</a>
    </body>
</html>
