package controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/act.do")
public class ActionServlet extends HttpServlet{
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        response.setContentType("text/html");

        PrintWriter pw = response.getWriter();

        pw.write("<html>");
        pw.write("<head>");
        pw.write("<title>Servlet Response</title>");
        pw.write("</head>");
        pw.write("<body>");
        pw.write("<h1>My First Servlet Response...!!!</h1>");
        pw.write("</hr>");
        pw.write("<p>Hello world</p>");
        pw.write("</body>");
        pw.write("</html>");

        pw.close();
    }
}