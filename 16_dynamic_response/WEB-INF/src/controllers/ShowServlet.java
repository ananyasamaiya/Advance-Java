package controllers;

import javax.servlet.http.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.io.*;

@WebServlet("/show.do")
public class ShowServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
        Student[]  student= {
            new Student("Mohan",18,"m@gmail.com,","JEC"),
            new Student("Sohan",20,"s@gmail.com","Global"),
            new Student("Rohan",12,"r@gmail.com","JEC")
        };

        response.setContentType("text/html");

        PrintWriter pw = response.getWriter();

        pw.write("<html>");
        pw.write("<head>");
        pw.write("<title>Servlet Response</title>");
        pw.write("</head>");
        pw.write("<body>");
        pw.write("<h1>Records Demo</h1>");
        pw.write("<hr>");
        pw.write("<table border = '1' align='center'>");
        pw.write("<tr>");
        pw.write("<th>Names</th>");
        pw.write("<th>Age</th>");
        pw.write("<th>Email</th>");
        pw.write("<th>College</th>");
        pw.write("</tr>");
        for(Student next : student){
            pw.write("<tr>");
            pw.write("<td><p>" + next.getName() + "</p></td>");
            pw.write("<td><p>" + next.getAge() + "</p></td>");
            pw.write("<td><p>" + next.getEmail() + "</p></td>");
            pw.write("<td><p>" + next.getCollege() + "</p></td>");
            pw.write("</tr>");
        }
        pw.write("</table>");
        pw.write("</body>");
        pw.write("</html>");

        pw.close();
    }
}