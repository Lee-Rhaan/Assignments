/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collegemanagementsystem;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class CollegeManagementSystem extends Registration{
    
    HashMap <String, String> students = new HashMap<>();
    HashMap <String, String> studentsOrdered = new HashMap<>();
    Student studentObject;
    ArrayList<Student> studentObjects = new ArrayList<>();
    Course course = new Course();
    
    public void addStudent(String username, String grade)
    {
        this.studentObject = new Student(username, grade);
        studentObject.setId(); //random id for every new student added
        studentObject.setEmailAddress();
        studentObject.setDateOfBirth(); //random date of birth generated
        
        studentObjects.add(studentObject); //stores all the student objects in one place
        
        this.students.put(studentObject.getUsername(), studentObject.getGrade());
        
        this.studentsOrdered.put(studentObject.getGrade(), studentObject.getUsername());
    }
    
    public void removeStudent(String name, String grade)
    {
       students.remove(name);
       studentsOrdered.remove(grade);
    }
    
    public void findStudentGrade(String username)
    {
        System.out.println(username + "'s grade: " + students.get(username));
    }
    
    public void sortByGrades()
    {
        Map<String, String> orderedByGrades = new TreeMap<>(studentsOrdered);
        System.out.println(orderedByGrades);
    }
    
    public void listAllStudents()
    {
        System.out.println(students);
    }
    
    public void getStudentInfo()
    {
        System.out.println("\n" + "Student Info:" + "\n");
        
        for(Student value : studentObjects)
        {
            Student values = value;
            System.out.println(values);
        }
        
    }
    
    public void getCourseInfo()
    {    
        System.out.println("\n" + "Course Info: " + "\n");
        System.out.println(super.toString());
    }
    
    public void printInfo()
    {
        
        System.out.println("\n" + "Printing info to textfile...");
        
        String filename = "collegeManagementSystem.txt";
        
        try 
        {
            PrintWriter outputStream = new PrintWriter(filename);
            outputStream.println(studentObjects); //stores in RAM first
            outputStream.close(); //flushes the data to the file
            System.out.println("Done!");
            
        } 
        catch (FileNotFoundException ex) 
        {
            ex.printStackTrace();
        }
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CollegeManagementSystem cmsObject = new CollegeManagementSystem();
        
        cmsObject.addStudent("John", "C");
        cmsObject.addStudent("Ben", "D");
        cmsObject.addStudent("Sam", "A");
        cmsObject.addStudent("King", "F");
        cmsObject.addStudent("Joe", "B");
        
        cmsObject.listAllStudents();
        
        cmsObject.removeStudent("Joe", "B");
        
        cmsObject.listAllStudents();
        
        cmsObject.findStudentGrade("Sam");
        
        cmsObject.sortByGrades();
        
        cmsObject.getStudentInfo();
        
        cmsObject.getCourseInfo();
        
        cmsObject.printInfo();
    }
    
}
