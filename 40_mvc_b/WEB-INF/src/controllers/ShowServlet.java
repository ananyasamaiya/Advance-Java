package controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;

import models.Student;

import java.util.ArrayList;

@WebServlet("/show.do")
public class ShowServlet extends HttpServlet{
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
        doGet(request,response);
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
        ArrayList<Student> list = Student.fetchData();

        request.setAttribute("records",list);

        request.getRequestDispatcher("show.jsp").forward(request,response);
    }
}