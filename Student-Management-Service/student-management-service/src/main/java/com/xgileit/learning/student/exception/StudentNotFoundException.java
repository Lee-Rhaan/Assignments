package com.xgileit.learning.student.exception;

public class StudentNotFoundException extends RuntimeException{

    /**
     * This constructor will take the message provided when a new instance of this exception is created,
     * and display it to the user.
     * @param message
     */
    public StudentNotFoundException(String message)
    {
        super(message);
    }
}
