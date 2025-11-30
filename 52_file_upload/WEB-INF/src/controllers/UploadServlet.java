package controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;

import java.io.IOException;
import java.io.File;
import java.util.List;
@WebServlet("/upload.do")
public class UploadServlet extends HttpServlet{
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        if(ServletFileUpload.isMultipartContent(request)){
            ServletContext context = getServletContext();
            String uploadPath = context.getRealPath("/WEB-INF/uploads");

            DiskFileItemFactory dfif = new DiskFileItemFactory();

            ServletFileUpload sfu = new ServletFileUpload(dfif);

            List<FileItem> fileItems = null;
            try{
                fileItems = sfu.parseRequest(request);
                
                for(FileItem fileItem : fileItems){
                    String fileName = fileItem.getName();
                    File file = new File(uploadPath, fileName);

                    fileItem.write(file);
                }
            }catch(FileUploadException e){
                e.printStackTrace();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        request.getRequestDispatcher("index.html").forward(request, response);
    } 
}