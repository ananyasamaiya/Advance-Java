package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class Pic {
    private Integer picId;
    private Product product;
    private String path;

    public static void savePics(ArrayList<Pic> pics) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abcdb?user=root&password=1234");

            String query = "insert into pics (product_id,path) value (?,?)";

            PreparedStatement ps = con.prepareStatement(query);

            for(Pic pic : pics) {
                ps.setInt(1, pic.getProduct().getProductId());
                ps.setString(2, pic.getPath());
                ps.executeUpdate();
            }

            con.close();
        } catch(SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    public Integer getPicId() {
        return picId;
    }
    public void setPicId(Integer picId) {
        this.picId = picId;
    }
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    public String getPath() {
        return path;
    }
    public void setPath(String path) {
        this.path = path;
    }    
}
