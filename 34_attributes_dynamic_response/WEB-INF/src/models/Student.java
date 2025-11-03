package models;

public class Student{
    private String studentName;
    private String studentCollege;
    private Integer studentAge;
    private Float studentMarks;

    public Student(String studentName, String studentCollege, Integer studentAge, Float studentMarks){
        this.studentName = studentName;
        this.studentCollege = studentCollege;
        this.studentAge = studentAge;
        this.studentMarks = studentMarks;
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

}