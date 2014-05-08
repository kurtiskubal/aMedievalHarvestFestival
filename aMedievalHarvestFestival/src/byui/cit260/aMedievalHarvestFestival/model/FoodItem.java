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
public class FoodItem implements Serializable {
     public static void main(String[] args){
        FoodItem foodItemOne = new FoodItem();
        
        foodItemOne.setFillingFactor(5.6);
        
        String foodItemInfo = foodItemOne.toString();
        System.out.println(foodItemInfo);
    }

    //class instance variables
    private Double fillingFactor;

    public FoodItem() {
    }
    
    public Double getFillingFactor() {
        return fillingFactor;
    }

    public void setFillingFactor(Double fillingFactor) {
        this.fillingFactor = fillingFactor;
    }

    @Override
    public String toString() {
        return "FoodItem{" + "fillingFactor=" + fillingFactor + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.fillingFactor);
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
        final FoodItem other = (FoodItem) obj;
        if (!Objects.equals(this.fillingFactor, other.fillingFactor)) {
            return false;
        }
        return true;
    }
    
    
}
