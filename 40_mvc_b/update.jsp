<%@ page import="models.Student" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Update Student</h1>

    <hr>

    <% Student s = (Student)request.getAttribute("student"); %>
    <form action="edit.do" method="post">
        <input type="hidden" name="student_id" value="<%= s.getStudentId() %>">
        <input type="text" name="name" placeholder="Enter your Name" value="<%= s.getStudentName() %>"><br><br>
        <input type="number" name="age" placeholder="Enter your Age" value="<%= s.getStudentAge() %>"><br><br>
        <input type="text" name="college" placeholder="Enter your College" value="<%= s.getStudentCollege() %>"><br><br>
        <input type="text" name="marks" placeholder="Enter your Marks" value="<%= s.getStudentMarks() %>"><br><br>
        
        <input type="submit" value="Update">
    </form>
    <a href="show.do">Show Records</a>
</body>
</html>