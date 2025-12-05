package models;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;

public class Product {
    private Integer productId;
    private String name;
    private Integer price;
    private Integer quantity;
    private User user;

   

    private ArrayList<Pic> pics;

    public static ArrayList<Product> collectAllProducts(User user){
        ArrayList<Product> products = new ArrayList<>();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abcdb?user=root&password=1234");

            String query = "select * from products where user_id=?";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1,user.getUserId());

            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                Product product = new Product();
                product.setProductId(rs.getInt("product_id"));
                product.setName(rs.getString("name"));
                product.setPrice(rs.getInt("price"));
                product.setQuantity(rs.getInt("quantity"));
                product.setUser(user);
                products.add(product);
            }
            con.close();
        }catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return products;
    }

    public void saveProduct(){
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abcdb?user=root&password=1234");

            String query = "insert into products (name,price,quantity,user_id) value (?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);

            ps.setString(1,name);
            ps.setInt(2,price);
            ps.setInt(3,quantity);
            ps.setInt(4,user.getUserId());

            if(ps.executeUpdate() == 1){
                ResultSet rs = ps.getGeneratedKeys();
                if(rs.next()){
                    productId = rs.getInt(1);
                }
            }
            con.close();
        }catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

     public ArrayList<Pic> getPics() {
        return pics;
    }

    public void setPics(ArrayList<Pic> pics) {
        this.pics = pics;
    }
}