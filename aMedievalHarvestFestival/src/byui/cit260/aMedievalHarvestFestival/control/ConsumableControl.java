/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.aMedievalHarvestFestival.control;

/**
 *
 * @author zev
 */
public class ConsumableControl {
    public Integer calcFillingFoodItem(Integer foodType, Integer weight){
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
}
