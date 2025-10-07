package controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import java.io.IOException;

public class ActionServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
        StringBuffer url = request.getRequestURL();
        String uri = request.getRequestURI();
        String servletPath = request.getServletPath();
        String method = request.getMethod();
        String query = request.getQueryString();


        System.out.println("URL: " + url);
        System.out.println("URI: " + uri);
        System.out.println("Servlet Path: " + servletPath);
        System.out.println("Method: " + method);
        System.out.println("Query: " + query);
    }
}