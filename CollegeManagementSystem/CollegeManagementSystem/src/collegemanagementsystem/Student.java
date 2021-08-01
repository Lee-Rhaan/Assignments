/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collegemanagementsystem;

import java.util.Date;
import java.util.Random;
/**
 *
 * @author Maggie
 */
public class Student {
    
    private int id;
    private String username;
    private String phone;
    private String grade;
    private Date dateOfBirth;
    private String gender;
    private String emailAddress;
    private Course course = new Course();
    private Registration register = new Registration();
    private Subjects subjects = new Subjects();
    
    public Student(){}
    
    public Student(String username, String grade)
    {
        this.username = username;
        this.grade = grade;
        
        register.setCourseId();
        register.setCourseName();
        register.setCourseDuration();
    }
    
    public Student(String username, String phone, String grade, String gender)
    {
        this.username = username;
        this.phone = phone;
        this.grade = grade;
        this.gender = gender;
    }
    
    public int getId()
    {
        return id;
    }
    
    public void setId()
    {
        Random random = new Random();
        
        this.id = random.nextInt(300);
        register.studentId = id;
    }
    
    public String getUsername()
    {
        return username;
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
    
    public Date getDateOfBirth()
    {
        return dateOfBirth;
    }
    
    public void setDateOfBirth()
    {
        Random random = new Random();
        Date date;
        long birth;
        
        //gets and Epoch value roughly between 1940 and 2003
        //-946771200000L = January 1, 1940
        //add up to 63 years to it (using modulus on the next long)
        birth = -946771200000L + (Math.abs(random.nextLong()) % (63L * 365 * 24 * 60 * 60 * 1000));
        
        this.dateOfBirth = new Date(birth);
    }
    
    public String getGender()
    {
        return gender;
    }
    
    public String getEmailAddress()
    {
        return emailAddress;
    }
    
    public void setEmailAddress()
    {
        this.emailAddress = username + "@gmail.com";
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
                ", emailAddress='" + emailAddress + '\'' +
                ", register='" + register + '\'' +
                ", subjects='" + subjects + '\'' +
                '}';
    }
}
