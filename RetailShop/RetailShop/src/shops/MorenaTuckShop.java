/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shops;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import stock.Detergent;
import stock.Diary;
import stock.Drink;
import stock.Item;

/**
 *
 * 
 */
public class MorenaTuckShop {
    
    List<Object> soldItems = new ArrayList<>();
    Item newItem;
    List<Item> items = new ArrayList<>();
    double totalSales;
    Map<String, String> itemNames = new HashMap<>();
    
    public MorenaTuckShop(){}
    
    public void updateStock(Drink stock){
        
        newItem = new Item();
        newItem.setClassName(stock.getClass().getSimpleName());
        newItem.setItemName(stock.getName());
        newItem.setSize(stock.getSize());
        newItem.setTotal(1);
        newItem.setPrice(stock.getPrice());
        
        for(Item item : items){
            if(item.equals(newItem)){
                if(item.getItemName().equals(newItem.getItemName())){
                item.setTotal(item.getTotal() + 1);
                return;
                }
            }
            
        }
        
        items.add(newItem);
    }
    
    public void updateStock(Diary stock){
        
        newItem = new Item();
        newItem.setClassName(stock.getClass().getSimpleName());
        newItem.setItemName(stock.getName());
        newItem.setSize(stock.getSize());
        newItem.setTotal(1);
        newItem.setPrice(stock.getPrice());
        
        for(Item item : items){
            if(item.equals(newItem)){
                if(item.getItemName().equals(newItem.getItemName())){
                item.setTotal(item.getTotal() + 1);
                return;
                }
            }
            
        }
        
        items.add(newItem);
    }
    
    public void updateStock(Detergent stock){
        
        newItem = new Item();
        newItem.setClassName(stock.getClass().getSimpleName());
        newItem.setItemName(stock.getName());
        newItem.setSize(stock.getSize());
        newItem.setTotal(1);
        newItem.setPrice(stock.getPrice());
        
        for(Item item : items){
            if(item.equals(newItem)){
                if(item.getItemName().equals(newItem.getItemName())){
                item.setTotal(item.getTotal() + 1);
                return;
                }
            }
            
        }
        
        items.add(newItem);
    }
    
    public void displayAvailableStock(){
        System.out.println("\nAvailable Stock: ");
        for(Object item : items){
        System.out.println(item);
        }
    }
    
    public void sellItem(String itemName, String size){
        for(Item item : items){
                if(item.getItemName().equals(itemName)){
                    if(item.getSize().equals(size)){
                        item.setTotal(item.getTotal() - 1);
                        soldItems.add(item);
                        totalSales = totalSales + item.getPrice();
                        System.out.println("\n" + item.getItemName() + " sold for: R" + item.getPrice());
                    }
                }
                itemNames.put(item.getItemName(), item.getClassName());
        }
        
        if(!itemNames.containsKey(itemName)){
            System.out.println("\nno stock");
        }
    }
    
    public void showSoldStock(){
        System.out.println("\nSold Stock: ");
        for(Object soldItem : soldItems){
            System.out.println(soldItem);
        }
    }
    
    public void calculateTotalSales(){
        System.out.println("\nTotal Sales: ");
        System.out.println(totalSales);
    }
    
}
