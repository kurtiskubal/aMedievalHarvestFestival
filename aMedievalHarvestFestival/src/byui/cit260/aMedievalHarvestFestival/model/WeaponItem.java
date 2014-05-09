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
public class WeaponItem extends InventoryItem {

    //class instance variables
    private Double power;
    private Double durability;

    public WeaponItem() {
    }
    
    public Double getPower() {
        return power;
    }

    public void setPower(Double power) {
        this.power = power;
    }

    public Double getDurability() {
        return durability;
    }

    public void setDurability(Double durability) {
        this.durability = durability;
    }

   
}
