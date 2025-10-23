<%@ page import="java.util.ArrayList" %>
<!-- directive  -->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Index Page</h1>

    <hr>

    <% ArrayList<String> names = new ArrayList<>(); %>
    
    <% names.add("golu"); %>
    <% 
        names.add("mohan"); 
        names.add("sohan");
        names.add("rohan");
        names.add("tohan");
    %>

    <h1>All Records</h1>
    <%--
    <%
      for(String name : names){
            out.write("<h1>" + name + "</h1>");
      }  
    %>
    --%>

    <% for(String name : names){ %>
        <h1>~<%= name %></h1>
    <% } %>
</body>
</html>