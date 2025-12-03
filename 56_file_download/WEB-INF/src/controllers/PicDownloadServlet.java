package controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import models.User;
@WebServlet("/pic_download.do")
public class PicDownloadServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        response.setContentType("image/*");

        User user = (User)session.getAttribute("user");

        ServletContext context = getServletContext();

        InputStream is = context.getResourceAsStream("/WEB-INF/uploads/" + user.getPic());


        OutputStream os = response.getOutputStream();

        byte[] arr = new byte[256];

        int count = 0;
        while((count = is.read(arr)) != -1){
            os.write(arr);
        }

        os.flush();
        os.close();
    }
}