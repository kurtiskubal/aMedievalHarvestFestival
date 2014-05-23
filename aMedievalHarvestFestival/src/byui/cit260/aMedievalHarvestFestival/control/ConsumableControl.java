/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.aMedievalHarvestFestival.control;

/**
 *
 * @author Adam Decker
 */
public class ConsumableControl {
    public Integer calcFillingFoodItem(Integer foodType, Integer weight){
        if(foodType == null || weight == null)return null;
        if(foodType < 1)return -1;
        if(weight < 1)return -2;
        if (foodType > 5)return -3;
        if(weight > 10)return -4;
        else {
            Integer fillingFactor;
            fillingFactor = foodType * weight;
            return fillingFactor;
        }
    }
    public Integer calcQuenchBeverageItem(Integer beverageType, Integer volume){
        if(beverageType == null || volume == null)return null;
        if(beverageType < 1)return -1;
        if(volume < 1)return -2;
        if (beverageType > 5)return -3;
        if(volume > 10)return -4;
        else {
            Integer quenchFactor;
            quenchFactor = beverageType * volume;
            return quenchFactor;
        }
    }
}
