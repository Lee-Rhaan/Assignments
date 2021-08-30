package com.xgileit.learning.student.model;

public class Student {
    private Integer studentNumber;
    private String firstName;
    private String secondName;
    private String address;

    public Student(){}

    /**
     * I did not initialize the studentNumber in this constructor, because i'm going to generate
     * a random studentNumber for each Student Object being created.
     * @param firstName
     * @param secondName
     * @param address
     */
    public Student(String firstName, String secondName, String address)
    {
        this.firstName = firstName;
        this.secondName = secondName;
        this.address = address;
    }

    public Integer getStudentNumber()
    {
        return studentNumber;
    }

    public void setStudentNumber(Integer studentNumber)
    {
        this.studentNumber = studentNumber;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getSecondName()
    {
        return secondName;
    }

    public void setSecondName(String secondName)
    {
        this.secondName = secondName;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    /**
     * Example Output: Student {studentNumber= '2', firstName= 'Lee', secondName= 'Bee', address= 'SA'}
     * It's just to make the contents of the Student object more readable.
     * @return
     */
    @Override
    public String toString()
    {
        return "Student {" +
                "studentNumber='" + studentNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
