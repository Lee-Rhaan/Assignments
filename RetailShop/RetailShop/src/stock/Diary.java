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
public class Diary {
    
    private String name;
    private String size;
    private double price;
    private LocalDate expiryDate;
    private String storageTemperature;
    
    public Diary(){}
    
    public Diary(String name, String size, double price, LocalDate expiryDate, String storageTemperature){
        this.name = name;
        this.size = size;
        this.price = price;
        this.expiryDate = expiryDate;
        this.storageTemperature = storageTemperature;
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
    
    public String getStorageTemperature(){
        return storageTemperature;
    }
    
    public void setStorageTemperature(String temperature){
        this.storageTemperature = temperature;
    }
    
    @Override
    public int hashCode()
    {
        return Objects.hash(name, size, price, expiryDate, storageTemperature);
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

        Diary diary = (Diary) object;
        return Objects.equals(name, diary.name) &&
                Objects.equals(size, diary.size) &&
                Objects.equals(price, diary.price) &&
                Objects.equals(expiryDate, diary.expiryDate) &&
                Objects.equals(storageTemperature, diary.storageTemperature);
    }
    
    @Override
    public String toString(){
        return "Diary{" +
                "name=" + name +
                ", size='" + size + '\'' +
                ", price='" + price + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                ", storageTemperature='" + storageTemperature + '\'' +
                '}';
    }
    
}
