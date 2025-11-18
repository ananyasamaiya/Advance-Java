package controllers;

import javax.servlet.http.HttpSession; 
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;
import models.User;

@WebServlet("/signin.do")
public class SignInServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        HttpSession session = request.getSession();
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        User user = new User(email, password);
        
        boolean flag = user.signinUser();
        if(flag)
            session.setAttribute("user", user);

        response.getWriter().print(flag);
    }
}