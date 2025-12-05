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
public class PicDownloadServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        response.setContentType("image/*");
        ServletContext context = getServletContext();

        String what = request.getParameter("what");
        String uploadPath = null;

        if(what.equals("user_pic")){
            User user = (User) session.getAttribute("user");
            uploadPath = "/WEB-INF/uploads/" + user.getPic();
        }else if(what.equals("product_pic")){
            String path = request.getParameter("path");
            uploadPath =  "/WEB-INF/uploads/" + path;
        }



        InputStream is = context.getResourceAsStream(uploadPath);

        OutputStream os = response.getOutputStream();

        byte[] arr = new byte[256];

        int count;
        while ((count = is.read(arr)) != -1) {
            os.write(arr);
        }

        os.flush();
        os.close();
    }
}