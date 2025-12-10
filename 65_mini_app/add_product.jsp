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

    <img src="pic_download.do?what=user_pic" height="60">

    <hr>

    <a href="dashboard.jsp">DashBoard</a> &nbsp;&nbsp;&nbsp;&nbsp;
    <a href="show_products.do">Show Products</a>

    <hr>

    <form action="add_product.do" method="post" enctype="multipart/form-data">
        <p>Product Name: <input type="text" name="name" required></p>
        <p>Product Price: <input type="number" name="price" required></p>
        <p>Product Quantity: <input type="number" name="quantity" required></p>
        <p>Product Pic: <input type="file" name="pic" multiple required></p>

        <p><input type="submit" value="Add Product"></p>
    </form>
</body>
</html>