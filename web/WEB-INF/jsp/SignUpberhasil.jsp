<%-- 
    Document   : SignUpberhasil
    Created on : Dec 18, 2017, 1:07:13 PM
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
        <h1>Sign Up Berhasil</h1>
        <h3>${data.namaLengkap} </h3> 
        <p>
            <a href="${pageContext.request.contextPath}/login">Please Login</a>
        </p>
    </body>
    </body>
</html>
