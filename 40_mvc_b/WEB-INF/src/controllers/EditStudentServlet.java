package controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;

import models.Student;

@WebServlet("/edit.do")
public class EditStudentServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
        Integer student_id = Integer.parseInt(request.getParameter("student_id"));

        Student s = new Student();
        s.setStudentId(student_id);
        s.fetchStudentInfo();

        request.setAttribute("student", s);

        request.getRequestDispatcher("update.jsp").forward(request,response);

    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        Integer student_id = Integer.parseInt(request.getParameter("student_id"));
        String name = request.getParameter("name");
        Integer age = Integer.parseInt(request.getParameter("age"));
        String college = request.getParameter("college");
        Float marks = Float.parseFloat(request.getParameter("marks"));

        Student s = new Student(name,age,college,marks);
        s.setStudentId(student_id);

        s.updateStudent();

        request.getRequestDispatcher("show.do").forward(request,response);
    }
}