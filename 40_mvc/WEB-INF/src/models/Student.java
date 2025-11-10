package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
public class Student{
    private Integer studentId;
    private String studentName;
    private String studentCollege;
    private Integer studentAge;
    private Float studentMarks;

    public Student(String studentName, Integer studentAge, String studentCollege, Float studentMarks){
        this.studentName = studentName;
        this.studentCollege = studentCollege;
        this.studentAge = studentAge;
        this.studentMarks = studentMarks;
    }
    
    public void setStudentId(Integer studentId){
        this.studentId = studentId;
    }

    public Integer getStudentId(){
        return studentId;
    }

    public void setStudentName(String studentName){
        this.studentName = studentName;
    }

    public String getStudentName(){
        return studentName;
    }

    public void setStudentCollege(String studentCollege){
        this.studentCollege = studentCollege;
    }

    public String getStudentCollege(){
        return studentCollege;
    }

    public void setStudentAge(Integer studentAge){
        this.studentAge = studentAge;
    }

    public Integer getStudentAge(){
        return studentAge;
    }
    public void setStudentMarks(Float studentMarks){
        this.studentMarks = studentMarks;
    }

    public Float getStudentMarks(){
        return studentMarks;
    }

    public void saveStudent(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb?user=root&password=1234");
            String query = "insert into students (name,age,college,marks) value (?,?,?,?);";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1,studentName);
            ps.setInt(2,studentAge);
            ps.setString(3,studentCollege);
            ps.setFloat(4,studentMarks);

            ps.executeUpdate();
            con.close();
        }catch(SQLException e){
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
    public static ArrayList<Student> fetchData(){
        ArrayList<Student> list= new ArrayList<>();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb?user=root&password=1234");
            String query = "select * from students;";
            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                Integer id = rs.getInt("student_id");
                String name = rs.getString("name");
                Integer age = rs.getInt("age");
                String college = rs.getString("college");
                Float marks = rs.getFloat("marks");

                Student s = new Student(name,age,college,marks);
                s.setStudentId(id);
                list.add(s);
            }
            con.close();
        }catch(SQLException e){
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        return list;
    }
    public static void deleteStudent(Integer student_id){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb?user=root&password=1234");
            String query = "delete from students where student_id = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1,student_id);
            ps.executeUpdate();
            con.close();

        }catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }

    public void updateStudent(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb?user=root&password=1234");
            String query = "update students set name=?,age=?,college=?,marks=? where student_id=?;";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1,studentName);
            ps.setInt(2,studentAge);
            ps.setString(3,studentCollege);
            ps.setFloat(4,studentMarks);
            ps.setInt(5,studentId);

            ps.executeUpdate();
            con.close();
        }catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }   
}