package controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;

import models.Student;

@WebServlet("/update.do")
public class UpdateServlet extends HttpServlet{
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
        Integer id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        Integer age = Integer.parseInt(request.getParameter("age"));
        String college = request.getParameter("college");
        Float marks = Float.parseFloat(request.getParameter("marks"));

        Student student = new Student(name,age,college,marks);
        student.setStudentId(id);

        student.updateStudent();

        response.sendRedirect("show.do");
    }
}