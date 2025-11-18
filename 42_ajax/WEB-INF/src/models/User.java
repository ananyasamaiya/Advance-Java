package models;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class User{
    private Integer userId;
    private String name;
    private String email;
    private String password;

    public User(String name, String email, String password){
        this.name = name;
        this.email = email;
        this.password = password;
    }
    public void setUserId(Integer userId){
        this.userId = userId;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPassword(String password){
        this.password = password;
    }

    public Integer getUserID(){
        return userId;
    }

    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }

    public boolean saveUser(){
        boolean flag = false;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/infodb?user=root&password=1234");

            String query = "insert into users (name,email,password) value (?,?,?)";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, password);

            int val = ps.executeUpdate();

            flag = val>0?true:false;

            con.close();
            
        }catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return flag;
    }
}