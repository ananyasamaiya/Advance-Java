package controllers;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import java.io.*;
import java.util.List;

import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;

import models.User;

@WebServlet("/signup.do")
public class SignupServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        if(ServletFileUpload.isMultipartContent(request)) {
            ServletContext context = getServletContext();
            String uploadPath = context.getRealPath("/WEB-INF/uploads");
            
            DiskFileItemFactory dfif = new DiskFileItemFactory();

            ServletFileUpload sfu = new ServletFileUpload(dfif);

            try {
                List<FileItem> fileItems = sfu.parseRequest(request);
                FileItem tmp = null;

                User user = new User();

                for(FileItem fileItem : fileItems) {
                    if(fileItem.isFormField()) {
                        String fieldName = fileItem.getFieldName();
                        String value = fileItem.getString();

                        if(fieldName.equals("name")) {
                            user.setName(value);                            
                        } else if(fieldName.equals("email")) {
                            user.setEmail(value);
                        } else if(fieldName.equals("password")) {
                            user.setPassword(value);
                        } 
                    } else {                        
                        tmp = fileItem;                   
                    }
                } // for ends----

                user.setPic(user.getEmail() + File.separatorChar + tmp.getName());
                if(user.saveUser()) {
                    File folderPath = new File(uploadPath, user.getEmail());
                    folderPath.mkdir();
                    File productsFolder = new File(folderPath, "products");
                    productsFolder.mkdir();
                    File file = new File(folderPath, tmp.getName());
                    tmp.write(file);
                }                
            } catch(FileUploadException e) {
                e.printStackTrace();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }

        request.getRequestDispatcher("index.html").forward(request, response);
    }
}