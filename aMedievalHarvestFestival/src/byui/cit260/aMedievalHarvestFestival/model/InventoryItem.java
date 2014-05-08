/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.aMedievalHarvestFestival.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author edit: Kurt
 */
public class InventoryItem implements Serializable {
    public static void main(String[] args){
        InventoryItem inventoryItemOne = new InventoryItem();
        
        inventoryItemOne.setInventoryType("'FoodItem'");
        inventoryItemOne.setItemQuanity(2);
        inventoryItemOne.setDescription("'Bright red honeycrisp apple from the hills of Fjiord.'");
        
        String inventoryItemInfo = inventoryItemOne.toString();
        System.out.println(inventoryItemInfo);
    }


    //class instance variables
    private String inventoryType;
    private Integer itemQuanity;
    private String description;

    public InventoryItem() {
    }
    
    public String getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType;
    }

    public Integer getItemQuanity() {
        return itemQuanity;
    }

    public void setItemQuanity(Integer itemQuanity) {
        this.itemQuanity = itemQuanity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "InventoryItem{" + "inventoryType=" + inventoryType + ", itemQuanity=" + itemQuanity + ", description=" + description + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.inventoryType);
        hash = 47 * hash + Objects.hashCode(this.itemQuanity);
        hash = 47 * hash + Objects.hashCode(this.description);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final InventoryItem other = (InventoryItem) obj;
        if (!Objects.equals(this.inventoryType, other.inventoryType)) {
            return false;
        }
        if (!Objects.equals(this.itemQuanity, other.itemQuanity)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }
    
    
}