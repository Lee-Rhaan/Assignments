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
public class Subjects {
    
    public String subjectOne = "overview";
    public String subjectTwo = "introduction";
    public String subjectThree = "core subjects";
    public String subjectFour = "beginner subjects";
    public String subjectFive = "intermediate subjects";
    public String subjectSix = "advanced subjects";
    public String subjectSeven = "praxis";
    
    @Override
    public String toString()
    {
        return "Subjects{" +
                "subjectOne=" + subjectOne +
                ", subjectTwo='" + subjectTwo + '\'' +
                ", subjectThree='" + subjectThree + '\'' +
                ", subjectFour='" + subjectFour + '\'' +
                ", subjectFive='" + subjectFive + '\'' +
                ", subjectSix='" + subjectSix + '\'' +
                ", subjectSeven='" + subjectSeven + '\'' +
                '}';
    }
    
}
