<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>

<div class="container col-md-8 col-md-offset-3" style="overflow: auto">
    <h1>Login Form</h1>

    <form action="/index" method="post">
        <div class="login-form">
            <label>User Name:</label> <input  type="text" name="username" placeholder="Username"  required>
        </div>
        <div class="login-form">
            <label>Password:</label> <input  type="text" name="password" placeholder="Password"  required>
        </div>
        <button type="submit" >Submit</button>
    </form>

</div>
</body>
</html>