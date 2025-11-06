<%@ page import="java.util.ArrayList,models.Student"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css">
</head>
<body>
    <h1>ALL Students Records</h1>

    <hr>

    <%
      ArrayList<Student> students = (ArrayList)request.getAttribute("records");

    %>

    <div class="container">
        <div class="row justify-content-center">
            <div class="col-8 pt-5 border border-primary rounded bg-primary-subtle">
                <table class="table table-primary">
                    <tr>
                        <th>Id</th>
                        <th>Name</th>
                        <th>Age</th>
                        <th>College</th>
                        <th>Marks</th>
                    </tr>
                    <% for(Student student : students) { %>
                        <tr>
                            <td><%= student.getStudentId() %></td>
                            <td><%= student.getStudentName() %></td>
                            <td><%= student.getStudentAge() %></td>
                            <td><%= student.getStudentCollege() %></td>
                            <td><%= student.getStudentMarks() %></td>
                        </tr>
                    <% } %>
                </table>
            </div>
        </div>
    </div>

    
</body>
</html>