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
public class BeverageItem implements Serializable {
     public static void main(String[] args){
        BeverageItem beverageItemOne = new BeverageItem();
        
        beverageItemOne.setQuenchFactor(50.0);
        
        String beverageItemInfo = beverageItemOne.toString();
        System.out.println(beverageItemInfo);
    }

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

    @Override
    public String toString() {
        return "BeverageItem{" + "quenchFactor=" + quenchFactor + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.quenchFactor);
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
        final BeverageItem other = (BeverageItem) obj;
        if (!Objects.equals(this.quenchFactor, other.quenchFactor)) {
            return false;
        }
        return true;
    }
    
    
}
