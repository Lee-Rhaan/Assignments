/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopclass;

/**
 *
 * @author Maggie
 */
public class OOPClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Classroom classroomObject = new Classroom(20, 5);
         classroomObject.teachStudents();
         classroomObject.teachersEmployedAt();
    }
    
}
