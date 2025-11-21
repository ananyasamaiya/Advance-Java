package models;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;

public class Product{
    private Integer productId;
    private String name;
    private Integer price;
    private Integer quantity;
    private String description;
    private User user;

    public Product(String name, Integer price, Integer quantity, String description, User user){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
        this.user = user;
    }
    public Product(Integer productId,String name, Integer price, Integer quantity, String description){
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }
    
    public Integer getProductId() {
        return productId;
    }
    public void setProductId(Integer productId) {
        this.productId = productId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    public boolean saveProduct(){
        boolean flag = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/infodb?user=root&password=1234");

            String query = "insert into products (name,quantity,price,description,user_id) value(?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, name);
            ps.setInt(2, quantity);
            ps.setInt(3, price);
            ps.setString(4, description);
            ps.setInt(5, user.getUserId());

            Integer val = ps.executeUpdate();

            if(val == 1) flag = true;
        }catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return flag;
    }

    public static ArrayList<Product> fetchAllProducts(Integer userId){
        ArrayList<Product> products = new ArrayList<>();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/infodb?user=root&password=1234");

            String query = "select * from products where user_id=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, userId);
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
              Integer p_product_id = rs.getInt("product_id");
              String p_name = rs.getString("name");
              Integer p_quantity = rs.getInt("quantity");
              Integer p_price = rs.getInt("price");
              String p_description = rs.getString("description");

              Product product = new Product(p_product_id,p_name,p_price,p_quantity,p_description);

              products.add(product);

              
            }

            con.close();
        }catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return products;
    }

}