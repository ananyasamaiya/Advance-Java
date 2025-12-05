<%@ page import="models.*,java.util.ArrayList" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <% User user = (User)session.getAttribute("user"); %>
    <h1>Hello <%= user.getName() %></h1>
    <img src="pic_download.do?what=user_pic" height="60">

    <hr>

    <a href="dashboard.jsp">Dasboard</a> &nbsp;&nbsp;&nbsp;&nbsp;
    <a href="show_products.do">Show Products</a>

    <hr>

    <% ArrayList<Product> products = (ArrayList)request.getAttribute("products"); %>

    <table border="1" width="95%" align="center">
        <thead>
            <tr>
                <th>Pics</th>
                <th>Name</th>
                <th>Price</th>
                <th>Quantity</th>
            </tr>
        </thead>
        <tbody>
            <% for(Product product : products) { %>
                <% ArrayList<Pic> pics = product.getPics(); %>
                <tr>
                    <td>
                        <% for(Pic pic : pics) { %>
                            <img height="100" src="pic_download.do?what=product_pic&path=<%= pic.getPath() %>">
                        <% } %>
                    </td>
                    <td><%= product.getName() %></td>
                    <td><%= product.getPrice() %></td>
                    <td><%= product.getQuantity() %></td>
                </tr>
            <% } %>
        </tbody>
    </table>
</body>
</html>