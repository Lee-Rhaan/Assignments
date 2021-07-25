/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author Maggie
 */
public class NullpointerExceptionExample {
    
    public void checkCharacter(int input)
    {
        
    try
    {
        String value = null;
        System.out.println(value.charAt(input));
    }
    catch(NullPointerException e)
    {
        System.out.println("The string you're trying to pull a character from is Null");
    }
    
    }
}
