/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

/**
 *
 * 
 */
public enum ItemCategory {
    FIZZY_DRINK("fizzy drink"), FRUIT_DRINK("fruit drink"),
    STORAGE_TEMPERATURE("20 degrees celsius"),
    LIQUID("liquid"), POWDER("powder"), BAR("bar");
    
    ItemCategory(String category){
        this.category = category;
    }
    
    private String category;
    
    public String getCategory(){
        return category;
    }
}
