package controllers;
import javax.servlet.http.HttpServlet; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse; 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.io.IOException; 

@WebServlet("/act.do")
public class ActionServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        String a = request.getHeader("host");
        String b = request.getHeader("user-agent");
        String c = request.getHeader("accept");
        String d = request.getHeader("accept-language");
        String e = request.getHeader("accept-encoding");
        String f = request.getHeader("accept-charset");
        String g = request.getHeader("keep-alive");
        String h = request.getHeader("connection");

        System.out.println("Host: " + a);
        System.out.println("User-Agent: " + b);
        System.out.println("Accept: " + c);
        System.out.println("Accept-Language: " + d);
        System.out.println("Accept-Encoding: " + e);
        System.out.println("Accept-Charset: " + f);
        System.out.println("Keep-alive: " + g);
        System.out.println("Connection: " + h);
    }
}