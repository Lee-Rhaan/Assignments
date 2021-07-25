/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopclass;

//This is the Child class.
/*
  Here you see Inheritance taking place -> child class implementing Parent interface.

  Polymorphism is taking place here as well (Constructor Overloading).
  On some occassions of the year there are students that's not from this school,
  but are joining the classroom as part of a program (temporaryStudents).

  Here you see Encapsulation taking place as well. All this information are grouped and protected
  under this class.
*/
public class Classroom implements SchoolBuilding{
    
    private int students;
    private int temporaryStudents;
    
    public Classroom(int students)
    {
        this.students = students;
    }
    
    public Classroom(int students, int temporaryStudents)
    {
        this.students = students;
        this.temporaryStudents = temporaryStudents;
    }
    
    public void teachStudents()
    {
        
        if(temporaryStudents > 0)
        {
            System.out.println("There are " + students + " students, and " + temporaryStudents + " temporary students being taught at this moment");
        }
        else
        {
            System.out.println("There are " + students + " students being taught at this moment");
        }
    }
    
    public void teachersEmployedAt()
    {
        System.out.println("Every teacher employed at this school is in charge of their own classroom");
    }
}
