package controllers;
public class Student{
    private String name;
    private int age;
    private String email;
    private String college;

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setCollege(String college){
        this.college= college;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getEmail(){
        return email;
    }

    public String getCollege(){
        return college;
    }

    Student(String name,int age,String email,String college){
        this.name = name;
        this.age = age;
        this.email = email;
        this.college= college;
    }

    
}