/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package amedievalharvestfestival;

import byui.cit260.aMedievalHarvestFestival.model.BeverageItem;
import byui.cit260.aMedievalHarvestFestival.model.ClueItem;
import byui.cit260.aMedievalHarvestFestival.model.FoodItem;
import byui.cit260.aMedievalHarvestFestival.model.Game;
import byui.cit260.aMedievalHarvestFestival.model.GiftItem;
import byui.cit260.aMedievalHarvestFestival.model.InventoryItem;
import byui.cit260.aMedievalHarvestFestival.model.Player;
import byui.cit260.aMedievalHarvestFestival.model.WeaponItem;

/**
 *
 * @author Kurt
 */
public class AMedievalHarvestFestival {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Game gameOne = new Game();
        
        gameOne.setTotalTime(7.90);
        
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
        
        Player playerOne = new Player();
    
        playerOne.setName("Lou Gerig");
        playerOne.setBestTime(20.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        InventoryItem inventoryItemOne = new InventoryItem();
        
        inventoryItemOne.setInventoryType("'FoodItem'");
        inventoryItemOne.setItemQuanity(2);
        inventoryItemOne.setDescription("'Bright red honeycrisp apple from the hills of Fjiord.'");
        
        String inventoryItemInfo = inventoryItemOne.toString();
        System.out.println(inventoryItemInfo);
        
        WeaponItem weaponItemOne = new WeaponItem();
        
        weaponItemOne.setPower(10.7);
        weaponItemOne.setDurability(49.21);
        String weaponItemInfo = weaponItemOne.toString();
        System.out.println(weaponItemInfo);
        
        GiftItem giftItemOne = new GiftItem();
        
        giftItemOne.setJoyGiving(30.0);
        
        String giftItemInfo = giftItemOne.toString();
        System.out.println(giftItemInfo);
        
        FoodItem foodItemOne = new FoodItem();
        
        foodItemOne.setFillingFactor(5.6);
        
        String foodItemInfo = foodItemOne.toString();
        System.out.println(foodItemInfo);
        
        BeverageItem beverageItemOne = new BeverageItem();
        
        beverageItemOne.setQuenchFactor(50.0);
        
        String beverageItemInfo = beverageItemOne.toString();
        System.out.println(beverageItemInfo);
        
        ClueItem testClueOne = new ClueItem();
        
        testClueOne.setKeyInformation("'this clue is only a test'");
        testClueOne.setItemQuanity(1);
        testClueOne.setInventoryType("'Clue Item'");
        
        String testClueOneInfo = testClueOne.toString();
        System.out.println(testClueOneInfo);
        
    }
    
}
