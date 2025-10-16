package controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("/next.do")
public class NextPageServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
        //request handling...
        System.out.println("Hello Next Page Walon");

        
        //response generation(page creation)
        RequestDispatcher view = request.getRequestDispatcher("show.do");
        view.forward(request,response);
    }
}