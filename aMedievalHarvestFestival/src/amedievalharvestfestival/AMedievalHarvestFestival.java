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

import byui.cit260.aMedievalHarvestFestival.model.Actors;
import byui.cit260.aMedievalHarvestFestival.model.InstanceLocation;
import byui.cit260.aMedievalHarvestFestival.model.Location;
import byui.cit260.aMedievalHarvestFestival.model.Map;
import byui.cit260.aMedievalHarvestFestival.model.PoolInstance;
import byui.cit260.aMedievalHarvestFestival.model.PuzzleLocation;
import byui.cit260.aMedievalHarvestFestival.model.RoomInstance;
import byui.cit260.aMedievalHarvestFestival.model.YardInstance;


/**
 * co-editor: Adam
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
        

        
        /********************************************
        *Please read. Be sure to import the classes
        *into this to be able to call the classes and
        *their functions. I have already imported
        *the classes to the class instances I added.
        *-Kurtis Kubal
        *********************************************/
        
        Actors actorOne = new Actors();
        
        actorOne.setName("Gary Olmison");
        actorOne.setDialogue("'What can I do for you?'");
        actorOne.setHappiness(0);
        actorOne.setHealth(150);
    
        String actorInfo = actorOne.toString();
        System.out.println(actorInfo);
        
        Map mapOrigin = new Map();
        
        mapOrigin.setRowCount(56);
        mapOrigin.setColumnCount(123);
        
        String mapInfo = mapOrigin.toString();
        System.out.println(mapInfo);
        
        Location locationOne = new Location();
        
        locationOne.setCoordinates(29);
        
        String locationInfo = locationOne.toString();
        System.out.println(locationInfo);
        
        InstanceLocation instanceLocationOne = new InstanceLocation();
       
       instanceLocationOne.setVisited("'You have been here before.'");
       instanceLocationOne.setDescription("'You look around and find that you are in the Royal library.'");
       instanceLocationOne.setType("'Room'");
       instanceLocationOne.setItemsStored("'There is a: 00 Sword, 01 Book on the Study of Corn, 02 Inkwell'");
       instanceLocationOne.setEnergyUsed(5);
       instanceLocationOne.setFluidsUsed(10);
       
       String instanceLocationInfo = instanceLocationOne.toString();
        System.out.println(instanceLocationInfo);
    
       PuzzleLocation puzzleLocationOne = new PuzzleLocation();
        
        puzzleLocationOne.setQuestion("'What is the square root of 4?'");
        puzzleLocationOne.setAnswer(2.0);
        
        String puzzleLocationInfo = puzzleLocationOne.toString();
        System.out.println(puzzleLocationInfo);
        
        RoomInstance roomInstanceOne = new RoomInstance();
        
        roomInstanceOne.setRoomHeight(20.0);
        roomInstanceOne.setRoomWidth(30.0);
        roomInstanceOne.setRoomLength(10.0);
        roomInstanceOne.setSqFootageRoom(300.0);
        
        String roomInstanceInfo = roomInstanceOne.toString();
        System.out.println(roomInstanceInfo);
        
        PoolInstance poolInstanceOne = new PoolInstance();
        
        poolInstanceOne.setPoolDepth(10.0);
        poolInstanceOne.setPoolLength(50.0);
        poolInstanceOne.setPoolWidth(20.0);
        
        String poolInstanceInfo = poolInstanceOne.toString();
        System.out.println(poolInstanceInfo);
        
        YardInstance yardInstanceOne = new YardInstance();
        
        yardInstanceOne.setSqFootageYard(100.0);
        yardInstanceOne.setGrassLength(0.25);
        
        String yardInstanceInfo = yardInstanceOne.toString();
        System.out.println(yardInstanceInfo);

    }
    
}
