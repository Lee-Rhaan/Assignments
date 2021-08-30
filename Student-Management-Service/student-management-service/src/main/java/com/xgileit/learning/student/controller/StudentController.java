package com.xgileit.learning.student.controller;

import com.xgileit.learning.student.model.Student;
import com.xgileit.learning.student.service.impl.StudentManagementServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * The @RestController annotation is used to create Restful web services. It takes care of mapping
 * request data to the defined request handler method.
 *It's a special type of annotation (It consists of a @ResponseBody & @Controller annotation)
 * It eliminates the need to annotate every request handling method in this controller class with
 * a @ResponseBody annotation.
 *
 * The @ResponseBody annotation enables automatic serialization of the return object into the
 * HttpResponse (Serialization is when you convert an object into a stream of bytes).
 *
 * The @Controller annotation included in this @RestController annotation specifies that this class
 * is a controller class.
 * The @Controller annotation also indicates that this class is a component. So Spring Component Scanning
 * will automatically detect this class as a component, and create an instance of this class as a Bean
 * in Springs Application Context.
 *
 * The @RequestMapping annotation determines what type of requests this class handles. So in this case
 * if you want access to this class -> you need to access it through the base request("/api/v1/student")
 */
@RestController
@RequestMapping(value="/api/v1/student")
public class StudentController {

    StudentManagementServiceImpl studentManagementServiceImpl = new StudentManagementServiceImpl();

    /**
     * How to access this method: "/api/v1/student/all"
     * This method GETS a list of all the student objects stored in the hashmap.
     * @return
     */
    @GetMapping("/all")
    public Map<Integer, Student> getListOfAllStudents()
    {
        return studentManagementServiceImpl.listAllStudents();
    }

    /**
     * How to access this method: "/api/v1/student/add"
     *
     * The @RequestBody annotation maps the HttpRequest body to a transfer/domain object. Enabling
     * the automatic deserialization of the HttpRequest body onto a java object.
     *
     * The java object (transfer object) in this case is the Student Object.
     * Deserialization is when you convert a stream of bytes into an object. This is how the
     * ResponseBody and RequestBody interact with each other.
     * This is how the JSON gets converted into a Java type.
     *
     * This method will return a "String" response ("Student Added"), if the request were successful.
     * @param student
     * @return
     */
    @PostMapping("/add")
    public String addStudent(@RequestBody Student student)
    {
        String response = studentManagementServiceImpl.addStudent(student);
        return response;
    }

    /**
     * How to access this method: "/api/v1/student/update"
     *
     * This method will replace the old student object with this newly updated student object
     * if the student object exists in the hashmap.
     *
     * This method will return a "String" response ("Student Updated"), if the request were successful.
     * @param student
     * @return
     */
    @PutMapping("/update")
    public String updateStudent(@RequestBody Student student)
    {
        String response = studentManagementServiceImpl.updateStudent(student);
        return response;
    }

    /**
     * How to access this method: "/api/v1/student/find/the studentNumber"
     * The "{studentNumber}" is a place holder, indicating that it's not the actual value,
     * the actual value will be added during runtime.
     *
     * The @PathVariable annotation indicates that the argument this method receives -> is bound to
     * the URI Template Variable, which in this case is "{studentNumber}".
     *
     * This method will check if the studentNumber exists as a key in the hashmap. If it does, it'll
     * return the student object.
     * @param studentNumber
     * @return
     */
    @GetMapping("/find/{studentNumber}")
    public Student findStudentByStudentNumber(@PathVariable("studentNumber") Integer studentNumber)
    {
        return studentManagementServiceImpl.findStudentByStudentNumber(studentNumber);
    }

    /**
     * How to access this method: "/api/v1/student/delete/ the studentNumber"
     * The "{studentNumber}" is a place holder, indicating that it's not the actual value,
     * the actual value will be added during runtime.
     *
     * The @PathVariable annotation indicates that the argument this method receives -> is bound to
     * the URI Template Variable, which in this case is "{studentNumber}".
     *
     * This method will use the argument it receives (studentNumber), to check if the student object
     * exists in the hashmap.
     * If it does, the student object gets removed from the hashmap, and then this method will return
     * a "String" response ("Student Deleted") if the request were successful.
     * @param studentNumber
     * @return
     */
    @DeleteMapping("/delete/{studentNumber}")
    public String deleteStudentByStudentNumber(@PathVariable("studentNumber") Integer studentNumber)
    {
        String response = studentManagementServiceImpl.deleteStudentByStudentNumber(studentNumber);
        return response;
    }

}
