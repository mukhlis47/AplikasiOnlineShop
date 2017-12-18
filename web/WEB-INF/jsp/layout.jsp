<%-- 
    Document   : layout
    Created on : Dec 14, 2017, 2:27:57 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <title>JSP Page</title>
    </head>
    <body>
        <title>Bootstrap Example</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
<body>

    <nav class="navbar navbar-default">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href="#">Kutak-Kutik Online Shop</a>
            </div>
            <ul class="nav navbar-nav">
                <li class="active"><a href="${pageContext.request.contextPath}/signup">SignUp</a></li>
                <li><a href="${pageContext.request.contextPath}/login">Login</a></li>
                <li><a href="#">Page 2</a></li>
                <li><a href="#">Page 3</a></li>
            </ul>
        </div>
    </nav>

    <div class="container">
        <h3>Basic Navbar Example</h3>
        <p>A navigation bar is a navigation header that is placed at the top of the page.</p>
    </div>




    <h1>Kutak-Kutik Online Shop</h1>
    <h2>${msg}</h2>
    <a href="signup"><h3>Silahkan Registrasi</h3></a>
    <a href="login"><h3>Silahkan Login</h3></a>
    <a href="product"><h3>Lihat Produk</h3></a>
</body>
</html>
