/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collegemanagementsystem;

/**
 *
 * @author Maggie
 */
public class Student {
    
    private int id;
    private String username;
    private String phone;
    private String grade;
    private String dateOfBirth;
    private String gender;
    
    public Student(){}
    
    public Student(String username, String grade)
    {
        this.username = username;
        this.grade = grade;
    }
    
    public Student(int id, String username, String phone, String grade, String dateOfBirth, String gender)
    {
        this.id = id;
        this.username = username;
        this.phone = phone;
        this.grade = grade;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }
    
    public int getId()
    {
        return id;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public String getUsername()
    {
        return username;
    }
    
    public void setUsername(String username)
    {
        this.username = username;
    }
    
    public String getPhone()
    {
        return phone;
    }
    
    public void setPhone(String phone)
    {
        this.phone = phone;
    }
    
    public String getGrade()
    {
        return grade;
    }
    
    public void setGrade(String grade)
    {
        this.grade = grade;
    }
    
    public String getDateOfBirth()
    {
        return dateOfBirth;
    }
    
    public void setDateOfBirth(String dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }
    
    public String getGender()
    {
        return gender;
    }
    
    public void setGender(String gender)
    {
        this.gender = gender;
    }
    
    @Override
    public String toString()
    {
        return "Student{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", phone='" + phone + '\'' +
                ", grade='" + grade + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
