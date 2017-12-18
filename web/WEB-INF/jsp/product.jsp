<%-- 
    Document   : product
    Created on : Dec 15, 2017, 10:15:26 AM
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
        <h1>Hello World!</h1>
         <form:form action="login/check" modelAttribute="loginBean" method="POST" >
                        <table>
                            <tr><td><form:label path="namaproduk">Nama Produk</form:label></td>
                                <td><form:input path="namaproduk"/></td></tr>
                            <tr><td><form:label path="hargaproduk">Harga Produk</form:label></td>
                                <td><form:password path="hargaproduk" /></td></tr>
                            <tr><td></td><td><form:button name="submitButton" value="Submit">Submit</form:button></td></tr>            
                            </table>            
                    </form:form>
    </body>
</html>
