/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xgiletest1;

import java.util.Scanner;

/**
 *
 * @author Maggie
 */
public class XGileTest1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter your name below:");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String reversedName = "";
        
        int length = name.length();
        
        for(int i = length - 1; i >= 0; i--)
        {
            reversedName = reversedName + name.charAt(i);
        }
        
        System.out.println(reversedName);
    }
    
}
