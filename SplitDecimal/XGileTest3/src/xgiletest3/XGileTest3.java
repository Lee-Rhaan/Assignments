/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xgiletest3;

import java.util.Scanner;

/**
 *
 * @author Maggie
 */
public class XGileTest3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter decimal number below:");
        Scanner sc = new Scanner(System.in);
        double value = sc.nextDouble();
        
        String[] splitNumber = String.valueOf(value).split("\\.");
        int[] convertToInt = new int[2];
        
        System.out.println(convertToInt[0] = Integer.parseInt(splitNumber[0]));
        System.out.println(convertToInt[1] = Integer.parseInt(splitNumber[1]));
        
        if(convertToInt[0] == convertToInt[1])
        {
            System.out.println("identical");
        }
        
    }
    
}
