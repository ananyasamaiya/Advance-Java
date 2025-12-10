package controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;
  
import java.io.IOException;

import models.User;
import models.Status;
@WebServlet("/signin.do")
public class SigninServlet extends HttpServlet{
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        String nextPage = "signin.jsp";
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);

        user.signinUser();
        if(user.getUserId() != null){
            int stId = user.getStatus().getStatusId();
            if(stId == Status.ACTIVE.getStatusId()){
            session.setAttribute("user",user);
            nextPage = "dashboard.jsp";
            }else{
                request.setAttribute("err_msg","Login failed... Your Acount is " + (stId==1?"Inactive":stId==3?"Blocked":"Closed"));
            }
        }else{
            request.setAttribute("err_msg", "Login failed... Either email or password is incorrect");
        }

        request.getRequestDispatcher(nextPage).forward(request,response);
    }
} 