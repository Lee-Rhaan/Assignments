/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chartproject;

import java.io.IOException;


public class ChartProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        char choice;
        
        do
        {
            System.out.println("Selection Menu:");
            System.out.println("         1. Mountain");
            System.out.println("         2. Share Market");
            System.out.println("Input '1' or '2' below: ");
            
            choice = (char) System.in.read();
        }
        while(choice < '1' || choice > '2');
        //This "Selection Menu" will execute everytime the user entered a number less than 1 or bigger than 2.
        //allowing the user to try again.
        
        System.out.println("\n");
        
        switch(choice)
        {
            case '1':
                
                Mountain mountainObject = new Mountain();
                mountainObject.giveSize();
                mountainObject.inputValues();
                mountainObject.highestAndLowest();
                mountainObject.determineIfTableExist();
                
                break;
            case '2':
                
                ShareMarket shareMarketObject = new ShareMarket();
                shareMarketObject.giveSize();
                shareMarketObject.inputValues();
                shareMarketObject.determineRiseAndFalls();
                
                break;
            default:
                break;
        }
    }
    
}
