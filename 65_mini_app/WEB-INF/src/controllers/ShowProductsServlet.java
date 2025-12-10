package controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;
import java.util.ArrayList;

import models.User;
import models.Product;
import models.Pic;

@WebServlet("/show_products.do")
public class ShowProductsServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");

        if (user != null) {
            ArrayList<Product> products = Product.collectAllProducts(user);
            for (Product product : products) {
                ArrayList<Pic> pics = Pic.collectAllPics(product);
                product.setPics(pics);
            }

            request.setAttribute("products", products);
        }

        request.getRequestDispatcher("show_products.jsp").forward(request, response);

    }
}