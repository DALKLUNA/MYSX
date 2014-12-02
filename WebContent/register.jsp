<%--
  Created by IntelliJ IDEA.
  User: tjibingnan
  Date: 2014/11/14
  Time: 10:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>用户登录</title>

    <!-- Bootstrap core CSS -->
    <link href="./css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="./css/register.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="./js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="./js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="http://cdn.bootcss.com/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<div class="container">

    <form class="form-login" role="form" name="registerForm" method="post" action="RegisterServlet">
        <h2 class="form-login-heading">麻衣神相&nbsp;&nbsp;&nbsp;注册</h2>
        <input type="username" class="form-control" placeholder="Username" required autofocus id="re_username" name="re_username">
        <input type="password" class="form-control" placeholder="Password" required type="password" id="re_pwd" name="re_pwd">
        <input type="password" class="form-control" placeholder="Password Confirm" required id="re_pwd_c" name="re_pwd_c">

        <button class="btn btn-lg btn-primary btn-block" type="submit">Register</button>
        <button class="btn btn-success btn-block" onclick="location='index.jsp'">Login</button>
        <h3>${requestScope.message}</h3>
    </form>

</div> <!-- /container -->

<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script src="./js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>