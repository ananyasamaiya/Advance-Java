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
    private String pic;
    private String verificationCode;
    private Status status;

    public static boolean verifyAccount(String email, String verificationCode){
        boolean flag = false;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abcdb?user=root&password=1234");

            String query = "update users set verification_code=?, status_id=? where email=? and verification_code=?";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, null);
            ps.setInt(2, Status.ACTIVE.getStatusId());
            ps.setString(3, email);
            ps.setString(4, verificationCode);

            int val = ps.executeUpdate();

            if(val == 1){
                flag = true;
            }


        }catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return flag;
    }

    public boolean saveUser() {
        boolean flag = false;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abcdb?user=root&password=1234");

            String query = "insert into users (name,email,password,pic,verification_code) value (?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, password);
            ps.setString(4, pic);
            ps.setString(5,verificationCode);
            int val = ps.executeUpdate();
            
            flag = val > 0 ? true : false;

            con.close();
        }catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return flag;
    }

    public void signinUser(){
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abcdb?user=root&password=1234");

            String query = "select * from users where email=? and password=?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, email);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                userId = rs.getInt("user_id");
                name = rs.getString("name");
                pic = rs.getString("pic");
            }
        }catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPic(){
        return pic;
    }
    public void setPic(String pic){
        this.pic = pic;
    }

    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    




}