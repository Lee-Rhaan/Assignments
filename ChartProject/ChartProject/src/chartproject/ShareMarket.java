/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chartproject;

import java.util.Arrays;
import java.util.Scanner;


public class ShareMarket {
    
    int[] shareMarketValues;
    Scanner scanner = new Scanner(System.in);
    int size;
    
    public void giveSize()
    {
        System.out.println("Enter size of List: ");
        size = scanner.nextInt();
        
        shareMarketValues = new int[size];
    }
    
    public void inputValues()
    {
        System.out.println("Enter values below:");
        int input;
        
        for(int i = 0; i < size; i++)
        {
            input = scanner.nextInt();
            shareMarketValues[i] = input;
        }
        
        System.out.print("Values: ");
        System.out.println(Arrays.toString(shareMarketValues));
    }
    
    public void determineRiseAndFalls()
    {
        int rise = 0;
        int fall = 0 ;
        
        for(int i = 1; i < shareMarketValues.length; i++)
        {
            
            //Comparing each element to the previous element as i'm traversing the array.
            if(shareMarketValues[i] > shareMarketValues[i - 1])
            {
                //if the condition is met -> "rise" gets incremented
                rise = rise + 1;
            }
            else if(shareMarketValues[i] < shareMarketValues[i - 1])
            {
                fall = fall + 1;
            }
            
        }
        
        System.out.println("Number of Rises: " + rise);
        System.out.println("Number of Falls: " + fall);
    }
    
}
