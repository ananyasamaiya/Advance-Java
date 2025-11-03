package controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;
import java.util.ArrayList;

import models.Student;


@WebServlet("/save.do")
public class SaveServlet extends HttpServlet{
    ArrayList<Student> students = new ArrayList<>();
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
        HttpSession session = request.getSession();
        String studentName = request.getParameter("student_name");
        String studentCollege = request.getParameter("student_college");
        Integer studentAge = Integer.parseInt(request.getParameter("student_age"));
        Float studentMarks = Float.parseFloat(request.getParameter("student_marks"));

        Student student = new Student(studentName, studentCollege, studentAge, studentMarks);
        students.add(student);

        session.setAttribute("records", students);

        request.getRequestDispatcher("index.jsp").forward(request, response);
        
    }
}