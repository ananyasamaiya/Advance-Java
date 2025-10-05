package controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("/pro.do")
public class ProcessServlet extends HttpServlet{
    public void doPost(HttpServletRequest request,HttpServletResponse resopnse) throws ServletException,IOException{
        System.out.println("Hello Duniya Walon....");
    } 
}