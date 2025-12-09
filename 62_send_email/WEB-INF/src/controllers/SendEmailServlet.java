package controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;

import utils.EmailSender;
import utils.EmailTemplates;


@WebServlet("/send_email.do")
public class SendEmailServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String email = request.getParameter("email");

        EmailSender.sendEmail(email,"Another Email Sending text",EmailTemplates.getWelcomeMail());

        
        request.getRequestDispatcher("index.html").forward(request,response);
    }
}

