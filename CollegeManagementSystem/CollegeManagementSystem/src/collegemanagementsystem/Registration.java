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
public class Registration {
    
    public int studentId;
    private int courseId;
    private String courseName;
    private int courseDuration;
    
    Course course = new Course();
    
    public Registration(){}
    
    public Registration(int studentId, int courseId, String courseName)
    {
        this.studentId = studentId;
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseDuration = course.getCourseDuration();
    }
    
    public void setCourseId()
    {
        courseId = course.setCourseId();
    }
    
    public void setCourseName()
    {
        courseName = course.setCourseName();
    }
    
    public void setCourseDuration()
    {
        this.courseDuration = course.setCourseDuration();
    }
    
    @Override
    public String toString()
    {
        return "Registered{" +
                "studentId=" + studentId +
                ", courseId=" + courseId + '\'' +
                ", courseName='" + courseName + '\'' +
                ", courseDuration='" + courseDuration + '\'' +
                '}';
    }
}
