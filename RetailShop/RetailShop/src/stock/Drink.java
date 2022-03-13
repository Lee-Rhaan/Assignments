/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stock;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * 
 */
public class Drink {
    
    private String name;
    private String size;
    private double price;
    private LocalDate expiryDate;
    private String type;
    
    public Drink(){}
    
    public Drink(String name, String size, double price, LocalDate expiryDate, String type){
        this.name = name;
        this.size = size;
        this.price = price;
        this.expiryDate = expiryDate;
        this.type = type;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getSize(){
        return size;
    }
    
    public void setSize(String size){
        this.size = size;
    }
    
    public double getPrice(){
        return price;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    public LocalDate getExpiryDate(){
        return expiryDate;
    }
    
    public void setExpiryDate(LocalDate expiryDate){
        this.expiryDate = expiryDate;
    }
    
    public String getType(){
        return type;
    }
    
    public void setType(String type){
        this.type = type;
    }
    
     @Override
    public int hashCode()
    {
        return Objects.hash(name, size, price, expiryDate, type);
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

        Drink drink = (Drink) object;
        return Objects.equals(name, drink.name) &&
                Objects.equals(size, drink.size) &&
                Objects.equals(price, drink.price) &&
                Objects.equals(expiryDate, drink.expiryDate) &&
                Objects.equals(type, drink.type);
    }
    
    @Override
    public String toString(){
        return "Drink{" +
                "name=" + name +
                ", size='" + size + '\'' +
                ", price='" + price + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
    
}
