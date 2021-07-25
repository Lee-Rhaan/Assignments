/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.util.Scanner;

/**
 *
 * @author Maggie
 */
public class ArrayIndexOutOfBoundsExceptionExample {
    
    public void getIndexInArray()
    {
        System.out.println("Enter a value below to get the index position in array");
        
        int[] arrayExample = {3, 9, 5};
        
        Scanner sc = new Scanner(System.in);
        
        try
        {
        int userInput = sc.nextInt();
        System.out.println(arrayExample[userInput]);
        sc.close();
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("You've exceeded the array size with the entered value");
        }
    }
}
