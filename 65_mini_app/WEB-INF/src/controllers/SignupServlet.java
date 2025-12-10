package controllers;

import java.io.IOException;
import java.io.File;
import java.util.List;
 
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import models.User;
import utils.Util;
import utils.EmailSender;
import utils.EmailTemplates;
@WebServlet("/signup.do")
public class SignupServlet extends HttpServlet{
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nextPage = "signup.jsp";
        boolean flag = false;
        if(ServletFileUpload.isMultipartContent(request)){
            ServletContext context = getServletContext();
            String UploadPath = context.getRealPath("/WEB-INF/uploads");

            DiskFileItemFactory dfif = new DiskFileItemFactory();
            ServletFileUpload sfu = new ServletFileUpload(dfif);
            
            List<FileItem> fileItems = null;
            try{
                fileItems = sfu.parseRequest(request);
                FileItem tmp = null;
                User user = new User();
                for(FileItem fileItem : fileItems){
                    if(fileItem.isFormField()){
                        String fieldName = fileItem.getFieldName();
                        String value = fileItem.getString();
                        if(fieldName.equals("name")){
                            user.setName(value);
                        }else if(fieldName.equals("email")){
                            user.setEmail(value);
                        }else if(fieldName.equals("password")){
                            user.setPassword(value);
                        }
                    }else{

                        tmp = fileItem;
                        // File file = new File(UploadPath,fileName);
                        // fileItem.write(file);
                    }
                }
                user.setPic(user.getEmail() + File.separatorChar + tmp.getName());

                String verificationCode = Util.generatedVerificationCode();
                user.setVerificationCode(verificationCode);
                
                boolean result = user.saveUser();

                if(result){
                    // --- create user folder -----
                    File folder = new File(UploadPath, user.getEmail());
                    folder.mkdir();

                    // --- create products folder -----
                    File productsFolder = new File(folder, "products");
                    productsFolder.mkdir();

                // ------------- Save User Pic ----------
                    File file = new File(folder,tmp.getName());
                    tmp.write(file);


                    // -------- Send Verification Mail ----------- 
                    EmailSender.sendEmail(user.getEmail(),"Email Verification...",EmailTemplates.getWelcomeMail(user.getName(),user.getEmail(),user.getVerificationCode()));

                    nextPage = "signup_success.html";

                    flag = true;
                
                }
                
            }catch(FileUploadException e){
                e.printStackTrace();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        request.setAttribute("success",flag);
        request.getRequestDispatcher(nextPage).forward(request,response);
    }
}