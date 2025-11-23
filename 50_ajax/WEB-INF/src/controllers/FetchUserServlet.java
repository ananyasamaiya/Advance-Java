package controllers;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;

import models.User;
import com.google.gson.Gson;

@WebServlet("/fetch_user.do")
public class FetchUserServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        HttpSession session = request.getSession();

        User user = (User)session.getAttribute("user");

        String json = "false";
        if(user != null){
            json = new Gson().toJson(user);
        }

        response.getWriter().write(json);
    }
}
