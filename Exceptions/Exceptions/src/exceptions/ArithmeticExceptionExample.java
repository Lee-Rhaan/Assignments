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
public class ArithmeticExceptionExample {
    
    private int firstInput;
    
    public ArithmeticExceptionExample(int firstInput)
    {
        this.firstInput = firstInput;
    }
    
    public void calculate()
    {
        System.out.println("Enter a number to divide by below: ");
        Scanner sc = new Scanner(System.in);
        
        try
        {
        int secondInput = sc.nextInt();
        int total = firstInput / secondInput;
        System.out.println(total);
        sc.close();   //close your scanner to avoid memory leaks!
        }
        catch(ArithmeticException e)
        {
            System.out.println("You can't divide by zero");
        }
        
    }
}
