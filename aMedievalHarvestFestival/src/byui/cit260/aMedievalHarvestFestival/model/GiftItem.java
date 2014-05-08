/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.aMedievalHarvestFestival.model;

import java.io.Serializable;

/**
 *
 * @author Edit: Kurt
 */
public class GiftItem implements Serializable{
    public static void main(String[] args){
        GiftItem giftItemOne = new GiftItem();
        
        giftItemOne.setJoyGiving(30.0);
        
        String giftItemInfo = giftItemOne.toString();
        System.out.println(giftItemInfo);
    }

    //class instance variables
    private double joyGiving;

    public GiftItem() {
    }
    
    public double getJoyGiving() {
        return joyGiving;
    }

    public void setJoyGiving(double joyGiving) {
        this.joyGiving = joyGiving;
    }

    @Override
    public String toString() {
        return "GiftItem{" + "joyGiving=" + joyGiving + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.joyGiving) ^ (Double.doubleToLongBits(this.joyGiving) >>> 32));
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
        final GiftItem other = (GiftItem) obj;
        if (Double.doubleToLongBits(this.joyGiving) != Double.doubleToLongBits(other.joyGiving)) {
            return false;
        }
        return true;
    }
    
    
    
}
