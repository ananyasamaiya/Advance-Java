<%@ page import="java.util.ArrayList,models.Student"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>ALL Students Records</h1>

    <hr>

    <%
      ArrayList<Student> students = (ArrayList)session.getAttribute("records");

    %>

    <table border="1" align="center" width="50%">
        <tr>
            <th>Name</th>
            <th>College</th>
            <th>Age</th>
            <th>Marks</th>
        </tr>
        <% for(Student student : students) { %>
            <tr>
                <td><%= student.getStudentName() %></td>
                <td><%= student.getStudentCollege() %></td>
                <td><%= student.getStudentAge() %></td>
                <td><%= student.getStudentMarks() %></td>
            </tr>
        <% } %>
    </table>

</body>
</html>