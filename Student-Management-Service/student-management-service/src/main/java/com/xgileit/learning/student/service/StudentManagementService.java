package com.xgileit.learning.student.service;

import com.xgileit.learning.student.model.Student;

import java.util.Map;

/**
 * This interface contains all the abstract methods i'm going to give implementations
 * to in the Service class (StudentManagementServiceImpl)
 */
public interface StudentManagementService {
    Map<Integer, Student> listAllStudents();

    String addStudent(Student student);

    String updateStudent(Student student);

    Student findStudentByStudentNumber(int studentNumber);

    String deleteStudentByStudentNumber(int studentNumber);
}
