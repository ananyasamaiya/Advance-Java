package controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;

import models.Student;

@WebServlet("/del.do")
public class DeleteServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
        Integer student_id = Integer.parseInt(request.getParameter("student_id"));

        Student.deleteStudent(student_id); 

        request.getRequestDispatcher("show.do").forward(request,response);
    }
}