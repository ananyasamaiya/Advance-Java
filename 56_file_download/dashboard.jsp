<%@ page import="models.User" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <% User user = (User)session.getAttribute("user"); %>
    <h1>Hello  <%= user.getName()  %></h1>

    <img src="pic_download.do" height="100">
</body>
</html>