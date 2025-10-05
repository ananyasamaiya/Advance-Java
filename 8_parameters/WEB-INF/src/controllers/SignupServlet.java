package controllers;
import javax.servlet.http.HttpServlet; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse; 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.io.IOException; 

@WebServlet("/signup.do")
public class SignupServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        String userName = request.getParameter("user_name");
        String userEmail = request.getParameter("user_email");
        String userPassword = request.getParameter("user_password");
        System.out.println(userName);
        System.out.println(userEmail);
        System.out.println(userPassword);
    }
}