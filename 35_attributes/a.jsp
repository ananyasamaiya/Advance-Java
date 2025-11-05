<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>A Page </h1>
    <hr>

    <a href="b.jsp">B page</a>

    <hr>

    <h1><%= session.getAttribute("name") %></h1>
</body>
</html>