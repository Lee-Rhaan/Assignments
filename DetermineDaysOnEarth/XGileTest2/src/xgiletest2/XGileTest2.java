/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xgiletest2;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Maggie
 */
public class XGileTest2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter your date of birth below:");
        System.out.println("We are going to determine how many days you've spent on earth");
        
        System.out.println("Date of birth example: day: 4 | month: 11 | year: 1997");
        System.out.println("\n");
        
        int day, month, year;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year of birth below: ");
        year = sc.nextInt();
        
        System.out.println("Enter Month of birth below: ");
        month = sc.nextInt();
        
        System.out.println("Enter Day of birth below: ");
        day = sc.nextInt();
        
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int yearDifference = currentYear - year;
        int leapYear = yearDifference / 4;
        double yearsToDays = yearDifference * 52.143 * 7 + leapYear;
        
        switch(month)
        {
            case 1:
                int janAmountOfDays = 31;
                int janSum = janAmountOfDays - day + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31;
                
                double janTotal = janSum + yearsToDays;
                System.out.println("You've spent " + janTotal + " amount of days on earth so far.");
                break;
            case 2:
                int febAmountOfDays = 28;
                int febSum = febAmountOfDays - day + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31;
                
                double febTotal = febSum + yearsToDays;
                System.out.println("You've spent " + febTotal + " amount of days on earth so far.");
                break;
            case 3:
                int marchAmountOfDays = 31;
                int marchSum = marchAmountOfDays - day + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31;
                
                double marchTotal = marchSum + yearsToDays;
                System.out.println("You've spent " + marchTotal + " amount of days on earth so far.");
                break;
            case 4:
                int aprilAmountOfDays = 30;
                int aprilSum = aprilAmountOfDays - day + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31;
                
                double aprilTotal = aprilSum + yearsToDays;
                System.out.println("You've spent " + aprilTotal + " amount of days on earth so far.");
                break;
            case 5:
                int mayAmountOfDays = 31;
                int maySum = mayAmountOfDays - day + 30 + 31 + 31 + 30 + 31 + 30 + 31;
                
                double mayTotal = maySum + yearsToDays;
                System.out.println("You've spent " + mayTotal + " amount of days on earth so far.");
                break;
            case 6:
                int juneAmountOfDays = 30;
                int juneSum = juneAmountOfDays - day + 31 + 31 + 30 + 31 + 30 + 31;
                
                double juneTotal = juneSum + yearsToDays;
                System.out.println("You've spent " + juneTotal + " amount of days on earth so far.");
                break;
            case 7:
                int julyAmountOfDays = 31;
                int julySum = julyAmountOfDays - day + 31 + 30 + 31 + 30 + 31;
                
                double julyTotal = julySum + yearsToDays;
                System.out.println("You've spent " + julyTotal + " amount of days on earth so far.");
                break;
            case 8:
                int augAmountOfDays = 31;
                int augSum = augAmountOfDays - day + 30 + 31 + 30 + 31;
                
                double augTotal = augSum + yearsToDays;
                System.out.println("You've spent " + augTotal + " amount of days on earth so far.");
                break;
            case 9:
                int sepAmountOfDays = 30;
                int sepSum = sepAmountOfDays - day + 31 + 30 + 31;
                
                double sepTotal = sepSum + yearsToDays;
                System.out.println("You've spent " + sepTotal + " amount of days on earth so far.");
                break;
            case 10:
                int octAmountOfDays = 31;
                int octSum = octAmountOfDays - day + 30 + 31;
                
                double octTotal = octSum + yearsToDays;
                System.out.println("You've spent " + octTotal + " amount of days on earth so far.");
                break;
            case 11:
                int novAmountOfDays = 30;
                int novSum = novAmountOfDays - day + 31;
                
                double novTotal = novSum + yearsToDays;
                System.out.println("You've spent " + novTotal + " amount of days on earth so far.");
                break;
            case 12:
                int decAmountOfDays = 31;
                int decSum = decAmountOfDays - day;
                
                double decTotal = decSum + yearsToDays;
                System.out.println("You've spent " + decTotal + " amount of days on earth so far.");
                break;
            default:
                System.out.println("Enter correct Month format!");
                break;
        }
        
    }
    
}
