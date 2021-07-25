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
public class StringIndexOutOfBoundsExample {
    
    public void getCharPosInString()
    {
        String exampleSentence = "You are funny";
        
        System.out.println("Sentence: " + exampleSentence);
        System.out.println("Enter a number below to get a character at the specified position in above example: ");
        
        Scanner sc = new Scanner(System.in);
        
        try
        {
        int userInput = sc.nextInt();
        char charValue = exampleSentence.charAt(userInput);
        System.out.println(charValue);
        sc.close();
        }
        catch(StringIndexOutOfBoundsException e)
        {
            System.out.println("Your character position did not match the available number of characters");
        }
    }
}
