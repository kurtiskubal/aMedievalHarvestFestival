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
public class WeaponItem implements Serializable {
     public static void main(String[] args){
        WeaponItem weaponItemOne = new WeaponItem();
        
        weaponItemOne.setPower(10.7);
        weaponItemOne.setDurability(49.21);
        String weaponItemInfo = weaponItemOne.toString();
        System.out.println(weaponItemInfo);
    }

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

    @Override
    public String toString() {
        return "WeaponItem{" + "power=" + power + ", durability=" + durability + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.power);
        hash = 67 * hash + Objects.hashCode(this.durability);
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
        final WeaponItem other = (WeaponItem) obj;
        if (!Objects.equals(this.power, other.power)) {
            return false;
        }
        if (!Objects.equals(this.durability, other.durability)) {
            return false;
        }
        return true;
    }
    
    
}
