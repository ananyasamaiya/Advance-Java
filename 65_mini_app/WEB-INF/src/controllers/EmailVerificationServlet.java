package controllers;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;

import models.User;

@WebServlet("/verify_acc.do")
public class EmailVerificationServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String verificationCode = request.getParameter("verification_code");

        boolean flag = User.verifyAccount(email,verificationCode);

        request.setAttribute("success",flag);

        request.getRequestDispatcher("verification_success.jsp").forward(request,response);

    }
}