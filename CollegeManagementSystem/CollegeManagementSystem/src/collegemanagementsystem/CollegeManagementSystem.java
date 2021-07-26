/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collegemanagementsystem;

import java.util.*;
/*
   I've used the ArrayList to store/add new students -> because it's easy + then i'd not have to
   worry about the "size" anymore. The ArrayList is dynamic -> which means that if it's full, a bigger
   ArrayList gets created and the contents in the previous ArrayList gets copied over to the new one.
 */

/*
   The HashMap allowed me to structure my student objects by a key + value 
   (key = username/grade, value = grade/username) depending on the situation.
*/

public class CollegeManagementSystem {

    Student studentObject1 = new Student(1, "John", "C");
    Student studentObject2 = new Student(2, "King", "F");
    Student studentObject3 = new Student(3, "Ben", "D");
    Student studentObject4 = new Student(4, "Sam", "A");
    Student studentObject5 = new Student(5, "Joe", "B");
    
    ArrayList<Student> addStudents = new ArrayList<>();
    
    HashMap <String, String> studentNameAndGrade = new HashMap<>();
    
    HashMap <String, String> orderedStudentsbyGrade = new HashMap<>();
    
    public void addNewStudents()
    {
        
        addStudents.add(studentObject1);
        addStudents.add(studentObject2);
        addStudents.add(studentObject3);
        addStudents.add(studentObject4);
        addStudents.add(studentObject5);
        
        System.out.println(addStudents);
    }
    
    public void removeStudent(int indexPosition)
    {
        addStudents.remove(indexPosition);
    }
    
    public void findStudentGrade(String username)
    {
        studentNameAndGrade.put(studentObject1.getUsername(), studentObject1.getGrade());
        studentNameAndGrade.put(studentObject2.getUsername(), studentObject2.getGrade());
        studentNameAndGrade.put(studentObject3.getUsername(), studentObject3.getGrade());
        studentNameAndGrade.put(studentObject4.getUsername(), studentObject4.getGrade());
        studentNameAndGrade.put(studentObject5.getUsername(), studentObject5.getGrade());
        
        System.out.println(studentNameAndGrade.get(username));
    }
    
    public void sortByGrades()
    {
        orderedStudentsbyGrade.put(studentObject1.getGrade(), studentObject1.getUsername());
        orderedStudentsbyGrade.put(studentObject2.getGrade(), studentObject2.getUsername());
        orderedStudentsbyGrade.put(studentObject3.getGrade(), studentObject3.getUsername());
        orderedStudentsbyGrade.put(studentObject4.getGrade(), studentObject4.getUsername());
        orderedStudentsbyGrade.put(studentObject5.getGrade(), studentObject5.getUsername());
        
        Map<String, String> orderedByGrades = new TreeMap<>(orderedStudentsbyGrade);
        System.out.println(orderedByGrades);
    }
    
    public void listAllStudents()
    {
        System.out.println(addStudents);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CollegeManagementSystem cms = new CollegeManagementSystem();
        cms.addNewStudents();
        cms.removeStudent(2);
        cms.findStudentGrade("John");
        cms.sortByGrades();
        cms.listAllStudents();
        
    }
    
}
