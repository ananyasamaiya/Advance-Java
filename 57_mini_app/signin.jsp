<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <a href="index.html">Home</a>
    
    <% String errMsg = (String)request.getAttribute("err_msg"); %>

    <% if(errMsg != null) { %>
        <h2 style="color:red"><%= errMsg %></h2>
    <% } %>

    <form action="signin.do" method="post">
        <p>Email: <input type="email" name="email"></p>
        <p>Password: <input type="password" name="password"></p>
        
        <p><input type="submit" value="SignIn"></p>
    </form>
</body>
</html>