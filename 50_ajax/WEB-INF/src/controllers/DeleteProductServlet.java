package controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;
import models.User;
import models.Product;

@WebServlet("/del_product.do")
public class DeleteProductServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        
        HttpSession session = request.getSession();

        User user = (User) session.getAttribute("user");

        if(user != null){
            Integer productId = Integer.parseInt(request.getParameter("product_id"));
            
            response.getWriter().print(Product.deleteProduct(productId,user.getUserId()));
        }else{
            response.getWriter().write("expired");
        }
        
    }
}