package models;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;

public class Pic {
    private Integer picId;
    private Product product;
    private String path;

    public static ArrayList<Pic> collectAllPics(Product product){
        ArrayList<Pic> pics = new ArrayList<>();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abcdb?user=root&password=1234");

            String query = "select * from pics where product_id=?";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1,product.getProductId());

            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                Pic pic = new Pic();
                pic.setPicId(rs.getInt("pic_id"));
                pic.setProduct(product);
                pic.setPath(rs.getString("path"));
                pics.add(pic);
            }

            con.close();
        }catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return pics;
    }

    public static void savePics(ArrayList<Pic> pics){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abcdb?user=root&password=1234");

            String query = "insert into pics(product_id,path) value (?,?)";

            PreparedStatement ps = con.prepareStatement(query);

            for(Pic pic : pics){
                ps.setInt(1, pic.getProduct().getProductId());
                ps.setString(2, pic.getPath());

                ps.executeUpdate();
            }


            con.close();
        }catch(SQLException | ClassNotFoundException e){
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