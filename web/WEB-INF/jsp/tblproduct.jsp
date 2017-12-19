<%-- 
    Document   : tblproduct
    Created on : Dec 18, 2017, 2:28:30 PM
    Author     : user
--%>

<%-- 
    Document   : customerdetail
    Created on : Dec 13, 2017, 3:12:12 PM
    Author     : user
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Product</h1><br/>
        <c:forEach var="c" items="${tblproduct}">
            <p>
                <a href="${c.id}"> ${c.productNama}</a> 
                
            </p>
        </c:forEach>
    </body>
</html>

