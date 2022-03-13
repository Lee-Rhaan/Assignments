/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retailshop;

import java.time.LocalDate;
import shops.MorenaTuckShop;
import stock.Detergent;
import stock.Diary;
import stock.Drink;
import utilities.ItemCategory;

/**
 *
 * 
 */
public class RetailShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instantiating shop object
        MorenaTuckShop shop = new MorenaTuckShop();
        
        //instantiating drink object
        Drink coke = new Drink("Coke", "2", 20.99, LocalDate.ofYearDay(2022, 10), ItemCategory.FIZZY_DRINK.getCategory());
        Drink oros = new Drink("Oros", "1.5", 14.99, LocalDate.ofYearDay(2022, 10), ItemCategory.FRUIT_DRINK.getCategory());
        
        //instantiating detergent object
        Detergent sunlight = new Detergent("Sunlight", "250", 7.99, LocalDate.ofYearDay(2022, 10), ItemCategory.BAR.getCategory());
        Detergent omo = new Detergent("OMO", "1", 21.99, LocalDate.ofYearDay(2023, 12), ItemCategory.POWDER.getCategory());
        
        //instantiating diary object
        Diary milk = new Diary("Milk", "1.5", 17.99, LocalDate.ofYearDay(2022, 10), ItemCategory.STORAGE_TEMPERATURE.getCategory());
        Diary babyMilk = new Diary("Baby Milk", "3", 67.99, LocalDate.ofYearDay(2023, 11), ItemCategory.STORAGE_TEMPERATURE.getCategory());
        
        //adding drinks
        shop.updateStock(coke);
        shop.updateStock(oros);
        shop.updateStock(coke);
        
        //adding detergents
        shop.updateStock(sunlight);
        shop.updateStock(sunlight);
        shop.updateStock(omo);
        
        //adding diary
        shop.updateStock(milk);
        shop.updateStock(milk);
        shop.updateStock(babyMilk);
        
        //List of all available items in stock
        shop.displayAvailableStock();
        
        //selling items and adding them to the sold stock list
        shop.sellItem(coke.getName(), coke.getSize());
        shop.sellItem(sunlight.getName(), sunlight.getSize());
        shop.sellItem("beer", "1");//should display "no stock" message
        
        //Showing sold stock
        shop.showSoldStock();
        
        //List of all available items in stock
        shop.displayAvailableStock();
        
        //calculating total sales
        shop.calculateTotalSales();
    }
    
}
