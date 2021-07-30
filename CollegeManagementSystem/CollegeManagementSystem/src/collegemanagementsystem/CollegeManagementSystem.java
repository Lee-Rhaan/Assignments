/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collegemanagementsystem;

import java.util.*;

public class CollegeManagementSystem extends Student{
    
    HashMap <String, String> students = new HashMap<>();
    HashMap <String, String> studentsOrdered = new HashMap<>();
    Student studentObject;
    
    public void addStudent(String username, String grade)
    {
        this.studentObject = new Student(username, grade);
        
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
        
    }
    
}
