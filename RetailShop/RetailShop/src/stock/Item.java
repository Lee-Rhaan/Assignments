/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stock;

import java.util.Objects;

/**
 *
 * 
 */
public class Item {
    
    private String className;
    private String itemName;
    private String size;
    private int total;
    private double price;
    
    public String getClassName(){
        return className;
    }
    
    public void setClassName(String name){
        this.className = name;
    }
    
    public String getItemName(){
        return itemName;
    }
    
    public void setItemName(String name){
        this.itemName = name;
    }
    
    public String getSize(){
        return size;
    }
    
    public void setSize(String size){
        this.size = size;
    }
    
    public int getTotal(){
        return total;
    }
    
    public void setTotal(int total){
        this.total = total;
    }
    
    public double getPrice(){
        return price;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
      @Override
    public int hashCode()
    {
        return Objects.hash(className, itemName, size, total);
    }

    @Override
    public boolean equals(Object object)
    {
        if(this == object)
            return true;
        if(object == null)
            return false;
        if(getClass() != object.getClass())
            return false;

        Item item = (Item) object;
        return Objects.equals(className, item.className) &&
                Objects.equals(itemName, item.itemName) &&
                Objects.equals(size, item.size) &&
                Objects.equals(total, item.total);
    }
    
    @Override
    public String toString(){
        return "Item{" +
                "className=" + className +
                ", itemName='" + itemName + '\'' +
                ", size='" + size + '\'' +
                ", total='" + total + '\'' +
                '}';
    }
    
}
