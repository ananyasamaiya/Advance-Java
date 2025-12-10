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
        }
        .danger{
            color: red;
            border-color: red;
            background-color: rgb(255, 176, 176);
        }
        .success{
            color: green;
            border-color: green;
            background-color: rgb(158, 255, 158);
        }
    </style>
</head>
<body>
    <a href="signup.jsp">Sign-Up</a>
    <a href="signin.jsp">Sign-In</a>

    <hr>

    <% Boolean flag = (Boolean)request.getAttribute("success"); %>

    <div class='message <%= flag?"success":"danger" %>'>
        <%= flag?"Verification Completed..":"Verification failed...."  %>
    </div>
</body>
</html>