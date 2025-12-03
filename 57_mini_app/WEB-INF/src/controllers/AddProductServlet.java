package controllers;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.servlet.ServletFileUpload;

import models.Product;
import models.User;
import models.Pic;

import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;

@WebServlet("/add_product.do")
public class AddProductServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("add_product.jsp").forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();
        
        User user = (User)session.getAttribute("user");

        ServletContext context = getServletContext();

        if(user != null) {
            if(ServletFileUpload.isMultipartContent(request)) {
                try {
                    List<FileItem> fileItems = new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);
                
                    Product product = new Product();
                    ArrayList<FileItem> productPics = new ArrayList<>(); 
                    for(FileItem fileItem : fileItems) {
                        if(fileItem.isFormField()) {
                            String fieldName = fileItem.getFieldName();
                            String value = fileItem.getString();

                            if(fieldName.equals("name")) {
                                product.setName(value);
                            }else if(fieldName.equals("price")) {
                                product.setPrice(Integer.parseInt(value));
                            } else if(fieldName.equals("quantity")) {
                                product.setQuantity(Integer.parseInt(value));
                            }
                        } else {
                            productPics.add(fileItem);
                        }
                    }

                    product.setUser(user);

                    product.saveProduct();

                    if(product.getProductId() != null) {
                        String productPath = context.getRealPath("/WEB-INF/uploads/"+user.getEmail()+"/products");
                        File productFolder = new File(productPath, product.getProductId().toString()); 
                        productFolder.mkdir();

                        ArrayList<Pic> pics = new ArrayList<>();
                        for(FileItem fileItem : productPics) {
                            String picName = fileItem.getName(); 
                            Pic pic = new Pic();
                            pic.setProduct(product);
                            pic.setPath(user.getEmail()+"/products/"+product.getProductId()+"/"+picName);
                            pics.add(pic);                            
                            File filePath = new File(productFolder, picName);
                            fileItem.write(filePath);
                        }

                        Pic.savePics(pics);
                    }
                } catch(FileUploadException e) {
                    e.printStackTrace();
                } catch(Exception e) {
                    e.printStackTrace();
                }
            }        
        }
        
        request.getRequestDispatcher("add_product.jsp").forward(request, response);
    }
}