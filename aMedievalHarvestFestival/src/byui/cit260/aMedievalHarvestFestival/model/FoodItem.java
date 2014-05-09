/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.aMedievalHarvestFestival.model;

/**
 * @version Adam
 * @author edit: Kurt
 */
public class FoodItem extends InventoryItem {
     

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

    
}
