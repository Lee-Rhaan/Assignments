package com.xgileit.learning.student.service.impl;

import com.xgileit.learning.student.exception.StudentNotFoundException;
import com.xgileit.learning.student.model.Student;
import com.xgileit.learning.student.service.StudentManagementService;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * The "@Service" annotation indicates that this is a service class(deals with Business Logic).
 * It does not have a specific function that it provides
 * to this class (except that it indicates that this class is a component).
 * You can replace the @Service annotation with any one of the other stereotype annotations and
 * this class would still function the same way as it did when you had the @Service annotation.
 *
 * The @Service annotation also indicates that this class is a component. So Spring Component Scanning
 * will automatically detect this class as a component, and create an instance of this class as a Bean
 * in Springs Application Context.
 */
@Service
public class StudentManagementServiceImpl implements StudentManagementService{

    /**
     * I made this hashmap global - because I don't want to overwrite the current
     * stored student/'s everytime I add a new student object.
     */
    private Map<Integer, Student> students = new HashMap<>();

    /**
     * This method returns all the current student objects stored in the hashmap.
     * @return
     */
    @Override
    public Map<Integer, Student> listAllStudents()
    {
        return students;
    }

    /**
     * This method takes a student object as an argument -> then creates a random number and sets it
     * as the student's studentNumber (unique identifier for the student object).
     *
     * It then checks if that studentNumber already exist in the hashmap -> if it does, then the student
     * object gets a newly generated studentNumber.
     *
     * If the student object's studentNumber don't exist in the hashmap -> then the student object gets
     * added to the hashmap.
     *
     * The reason i'm checking if the studentNumber of a Student object already exists in the hashmap,
     * is because the hashmap can't store duplicate keys (i'm using their studentNumbers as the keys).
     * If I were to add a student object with a duplicate key -> then it would overwrite and replace the
     * duplicated version.
     * @param student
     * @return
     */
    @Override
    public String addStudent(Student student)
    {
        Random random = new Random();
        int randomNumber = random.nextInt();
        student.setStudentNumber(randomNumber);

        if(students.containsKey(student.getStudentNumber()))
        {
            randomNumber = random.nextInt();
            student.setStudentNumber(randomNumber);
        }

        students.put(student.getStudentNumber(), student);
        return "Student Added";
    }

    /**
     * This method takes a student object as an argument. It then checks if that student object
     * exists in the hashmap.
     * If it does, it will replace the old version with the newly updated student object.
     * @param student
     * @return
     */
    @Override
    public String updateStudent(Student student)
    {
        if(students.containsKey(student.getStudentNumber()))
        {
            students.replace(student.getStudentNumber(), student);
        }
        else
        {
            throw new StudentNotFoundException("Student with studentNumber: " + student.getStudentNumber() +
                                               " not found");
        }

        return "Student Updated";
    }

    /**
     * If the studentNumber exists as a key in the hashmap -> then this method will return the
     * student object with the specified studentNumber.
     * @param studentNumber
     * @return
     */
    @Override
    public Student findStudentByStudentNumber(int studentNumber)
    {
        if(students.containsKey(studentNumber) == false)
        {
            throw new StudentNotFoundException("Student with studentNumber: " + studentNumber +
                    " not found");
        }

        return students.get(studentNumber);
    }

    /**
     * If the studentNumber exists as a key in the hashmap -> then the student object gets removed
     * from the hashmap.
     * @param studentNumber
     * @return
     */
    @Override
    public String deleteStudentByStudentNumber(int studentNumber)
    {
        if(students.containsKey(studentNumber) == false)
        {
            throw new StudentNotFoundException("Student with studentNumber: " + studentNumber +
                    " not found");
        }

        students.remove(studentNumber);
        return "Student Deleted";
    }
}
