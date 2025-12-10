<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        .message{
            font-family: verdana;
            font-size: 20px;
            border-width: 1px;
            border-style: solid;
            padding: 8px 12px;
            border-radius: 8px;
            margin: 20px auto;
            box-shadow: 10px 10px 10px gray;
            color: red;
            border-color: red;
            background-color: rgb(255, 176, 176);
        }
        
    </style>
</head>
<body>
    <a href="index.html">Home</a>

    <% Boolean flag = (Boolean)request.getAttribute("success"); %>

    <% if(flag != null){ %>
        <div class='message danger %>'>
        <%= flag?"Verification Completed..":"Verification failed...."  %>
        </div>
    <% } %>

    <form action="signup.do" method="post" enctype="multipart/form-data">
        <p>User Name: <input type="text" name="name"></p>
        <p>Email: <input type="email" name="email" ></p>
        <p>Password: <input type="password" name="password"></p>
        <p>Pic: <input type="file" name="pic"></p>

        <input type="submit" value="SignUp">
    </form>
</body>
</html>