/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collegemanagementsystem;

import java.util.Random;

/**
 *
 * @author Maggie
 */
public class Course extends Subjects {
    
    private int courseId;
    private String courseName;
    private int courseDuration;
    
    public Course(){}
    
    public Course(String courseName)
    {
        this.courseName = courseName;
    }
    
    public int getCourseId()
    {
        return courseId;
    }
    
    public int setCourseId()
    {
        Random random = new Random();
        
        return this.courseId = random.nextInt(15);
    }
    
    public String getCourseName()
    {
        return courseName;
    }
    
    public String setCourseName()
    {
        String[] courses = {"Software Developer", "Sales", "Engineer", "Business development",
                            "Social Worker", "Psychology", "Chef", "Management", "Teacher"};
        
        Random random = new Random();
        int randomCourse = random.nextInt(courses.length);
        
        return this.courseName = courses[randomCourse];
    }
    
    public int getCourseDuration()
    {
        return courseDuration;
    }
    
    public int setCourseDuration()
    {
        Random random = new Random();
        
        return this.courseDuration = random.nextInt(3)+ 1;
    }
    
    @Override
    public String toString()
    {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", courseDuration='" + courseDuration + '\'' +
                '}';
    }
}
