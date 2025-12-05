package controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.File;

import models.User;
@WebServlet("/save.do")
public class SaveUserServlet extends HttpServlet{
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);

        user.saveUser();

        if(user.getUserId() != null){
            String uploadPath = getServletContext().getRealPath("/WEB-INF/uploads");
            File file = new File(uploadPath, user.getUserId().toString());
        
            file.mkdir();
        }

        request.getRequestDispatcher("index.html").forward(request,response);
    }
}