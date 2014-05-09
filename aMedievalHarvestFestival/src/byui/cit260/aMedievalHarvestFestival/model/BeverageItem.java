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
public class BeverageItem extends InventoryItem {
    

    //class instance variables
    private Double quenchFactor;

    public BeverageItem() {
    }
    
    public Double getQuenchFactor() {
        return quenchFactor;
    }

    public void setQuenchFactor(Double quenchFactor) {
        this.quenchFactor = quenchFactor;
    }

    
}
