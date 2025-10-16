package controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("/redirect.do")
public class RedirectServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
        System.out.println("Hello Redirect");

        
        // response.sendRedirect("https://rgpv.ac.in/");
        response.sendRedirect("http://localhost:8080/19_pdf_response/");
    }
}