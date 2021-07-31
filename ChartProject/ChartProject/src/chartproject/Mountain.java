/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chartproject;

import java.util.*;


public class Mountain {
    
    int[] mountainValues;
    Scanner scanner = new Scanner(System.in);
    int size;
    
    public void giveSize()
    {
        System.out.println("Enter size of List: ");
        size = scanner.nextInt();
        
        mountainValues = new int[size];
    }
    
    public void inputValues()
    {
        System.out.println("Enter values below:");
        int input;
        
        //The "size" variable still contains the size of the array the user entered.
        //So it allows me to iterate the "user's input" to the precise amount of storage available in the array.
        for(int i = 0; i < size; i++)
        {
            input = scanner.nextInt();
            mountainValues[i] = input;
        }
        
        System.out.print("Values: ");
        System.out.println(Arrays.toString(mountainValues));
    }
    
    public void highestAndLowest()
    {
        Arrays.sort(mountainValues);
        
        System.out.println("Highest Peak: " + mountainValues[size-1]);
        System.out.println("Lowest Valley: " + mountainValues[0]);
        
        int difference = mountainValues[size-1] - mountainValues[0];
        System.out.println("Difference between Peak & Low: " + difference);
    }
    
    public void determineIfTableExist()
    {
        int table = 0;
        
        for(int i = 1; i < mountainValues.length; i++)
        {
            
            //Comparing each element to the previous element as i'm traversing the array.
            if(mountainValues[i] == mountainValues[i - 1])
            {
                //if two elements are equal (increment)
                table = table + 1; 
            }
        }
        
        if(table > 0)
        {
            System.out.println("Table Exist: TRUE");
        }
        else
        {
            System.out.println("Table Exist: FALSE");
        }
        
    }
    
}
