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
 * @author Kurt
 */
public class InstanceLocation implements Serializable {
    
    //class instance variables
    private String itemsStored;
    private String type;
    private String description;
    private double energyUsed;
    private double fluidsUsed;

    public InstanceLocation() {
    }
    
    public String getItemsStored() {
        return itemsStored;
    }

    public void setItemsStored(String itemsStored) {
        this.itemsStored = itemsStored;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getEnergyUsed() {
        return energyUsed;
    }

    public void setEnergyUsed(double energyUsed) {
        this.energyUsed = energyUsed;
    }

    public double getFluidsUsed() {
        return fluidsUsed;
    }

    public void setFluidsUsed(double fluidsUsed) {
        this.fluidsUsed = fluidsUsed;
    }

    @Override
    public String toString() {
        return "InstanceLocation{" + "visited=" + visited + ", itemsStored=" + itemsStored + ", type=" + type + ", description=" + description + ", energyUsed=" + energyUsed + ", fluidsUsed=" + fluidsUsed + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.visited);
        hash = 97 * hash + Objects.hashCode(this.itemsStored);
        hash = 97 * hash + Objects.hashCode(this.type);
        hash = 97 * hash + Objects.hashCode(this.description);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.energyUsed) ^ (Double.doubleToLongBits(this.energyUsed) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.fluidsUsed) ^ (Double.doubleToLongBits(this.fluidsUsed) >>> 32));
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
        final InstanceLocation other = (InstanceLocation) obj;
        if (!Objects.equals(this.visited, other.visited)) {
            return false;
        }
        if (!Objects.equals(this.itemsStored, other.itemsStored)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (Double.doubleToLongBits(this.energyUsed) != Double.doubleToLongBits(other.energyUsed)) {
            return false;
        }
        if (Double.doubleToLongBits(this.fluidsUsed) != Double.doubleToLongBits(other.fluidsUsed)) {
            return false;
        }
        return true;
    }
    
    
    
}
