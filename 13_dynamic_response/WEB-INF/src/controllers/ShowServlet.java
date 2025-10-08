package controllers;

import javax.servlet.http.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.io.*;

@WebServlet("/show.do")
public class ShowServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
        String[] names = {"Mohan","Sohan","Rohan","Ganesh","Dinesh","Ram","Pooran"};

        response.setContentType("text/html");

        PrintWriter pw = response.getWriter();

        pw.write("<html>");
        pw.write("<head>");
        pw.write("<title>Servlet Response</title>");
        pw.write("</head>");
        pw.write("<body>");
        pw.write("<h1>Records Demo</h1>");
        pw.write("<hr>");
        for(String next : names)
            pw.write("<h2>" + next + "</h2>");
        pw.write("</body>");
        pw.write("</html>");

        pw.close();
    }
}