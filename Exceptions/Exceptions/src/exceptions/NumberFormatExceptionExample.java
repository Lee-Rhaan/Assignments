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
public class NumberFormatExceptionExample {
    
    public void calculate()
    {
        System.out.println("Enter a number below");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.next();
        sc.close();
    
        try
        {
            int num = Integer.parseInt(userInput);
            System.out.println(3 + num);
        }
        catch(NumberFormatException e)
        {
            System.out.println("You've entered an incorrect number format!");
        }
    
    }
}
