package controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("/show.do")
public class ShowServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
        //request handling...
        System.out.println("Hello Show Page Walon");

        
        //response generation(page creation)
        RequestDispatcher view = request.getRequestDispatcher("aa/next.html");
        view.forward(request,response);
    }
}