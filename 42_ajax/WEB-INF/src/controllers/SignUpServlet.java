package controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;
import models.User;

@WebServlet("/signup.do")
public class SignUpServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        String name = request.getParameter("uname");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        User user = new User(name,email,password);
        response.getWriter().print(user.saveUser());
    }
}