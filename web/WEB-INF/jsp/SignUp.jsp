<%-- 
    Document   : register
    Created on : Dec 15, 2017, 9:31:18 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign Up</title>
    </head>
    <body>
        <h1>Sign Up</h1>
         <form:form action="signup/save" modelAttribute="SignUpBean" method="POST" >
             <table>
                
            <tr><td><form:label path="namaLengkap">Nama Lengkap</form:label></td>
                <td><form:input path="namaLengkap"/><br/></td></tr>
            <tr><td><form:label path="username">Username</form:label></td>
                <td><form:input path="username"/><br/></td></tr>
            <tr><td><form:label path="password">Password</form:label></td>
                <td><form:password path="password"/><br/><td></tr>
            <tr><td><form:label path="email">Email</form:label></td>
                <td><form:input path="email"/><br/></td></tr>
            <tr><td><form:label path="phone">Phone</form:label></td>
                <td><form:input path="phone"/><br/></td></tr>
            <tr><td><form:label path="alamat">Alamat</form:label></td>
                <td><form:input path="alamat"/><br/></td></tr>
             </table>
            <p>
                <form:button name="submitButton" value="Submit">Submit</form:button>
            </p>
            <c:if test="${empty sessionScope.user}">


                    <p>
                        <a href="${pageContext.request.contextPath}/login">Please Login</a>
                    </p>
                </c:if>
        </form:form>
    </body>
</html>
