package controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;

import models.Student;

@WebServlet("/save.do")
public class SaveServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
        request.getRequestDispatcher("save.jsp").forward(request,response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
        String name = request.getParameter("name");
        Integer age = Integer.parseInt(request.getParameter("age"));
        String college = request.getParameter("college");
        Float marks = Float.parseFloat(request.getParameter("marks"));

        Student student = new Student(name,age,college,marks);
        student.saveStudent();

        request.getRequestDispatcher("save.jsp").forward(request,response);
    }
}