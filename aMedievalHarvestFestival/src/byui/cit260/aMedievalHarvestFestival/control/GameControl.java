/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.aMedievalHarvestFestival.control;

import amedievalharvestfestival.AMedievalHarvestFestival;
import byui.cit260.aMedievalHarvestFestival.model.ClueItem;
import byui.cit260.aMedievalHarvestFestival.model.Constants;
import byui.cit260.aMedievalHarvestFestival.model.FoodItem;
import byui.cit260.aMedievalHarvestFestival.model.Game;
import byui.cit260.aMedievalHarvestFestival.model.InstanceLocation;
import byui.cit260.aMedievalHarvestFestival.model.InventoryItem;
import byui.cit260.aMedievalHarvestFestival.model.Location;
import byui.cit260.aMedievalHarvestFestival.model.Player;

/**
 *
 * @author Kurt
 */
public class GameControl {
    
    private static Game game;
    private final static int NUMBER_OF_INVENTORY_ITEMS = 10;
    private final static int EVIDENCE_ONE_ITEM = 0;
    private final static int EVIDENCE_TWO_ITEM = 1;
    private final static int EVIDENCE_THREE_ITEM = 2;
    private final static int EVIDENCE_FOUR_ITEM = 3;
    private final static int EVIDENCE_FIVE_ITEM = 4;
    private final static int APPLE = 5;
    private final static int BREAD = 6;
    public static Game getGame() {
        return game;
    }
    
    public static void startNewGame(Player player) {
        GameControl.game = new Game();
        
        AMedievalHarvestFestival.setCurrentGame(game);
        
        GameControl.createInventoryList();
        GameControl.createActorsList();
        GameControl.createMap();
        
        MapControl.moveActorsToLocation(0,3);
    }
    
    public static void startSavedGame(){
        System.out.println("\n*** Calling startSavedGame stub function ***");
    }
   
    
    private static void createInventoryList() {
        InventoryItem[] inventory = new InventoryItem[NUMBER_OF_INVENTORY_ITEMS];
        
        InventoryItem clueItem1 = new ClueItem();
        clueItem1.setInventoryType(1);
        clueItem1.setDescription("Lock of Hair");
        clueItem1.setItemQuanity(0);
        inventory[EVIDENCE_ONE_ITEM] = clueItem1;
        
        InventoryItem clueItem2 = new ClueItem();
        clueItem2.setInventoryType(1);
        clueItem2.setDescription("Secretive Note");
        clueItem2.setItemQuanity(0);
        inventory[EVIDENCE_TWO_ITEM] = clueItem2;
        
        InventoryItem clueItem3 = new ClueItem();
        clueItem3.setInventoryType(1);
        clueItem3.setDescription("Note From Conversation With Queen");
        clueItem3.setItemQuanity(0);
        inventory[EVIDENCE_THREE_ITEM] = clueItem3;
        
        InventoryItem clueItem4 = new ClueItem();
        clueItem4.setInventoryType(1);
        clueItem4.setDescription("Note from Conversation with Princess");
        clueItem4.setItemQuanity(0);
        inventory[EVIDENCE_FOUR_ITEM] = clueItem4;
        
        InventoryItem clueItem5 = new ClueItem();
        clueItem5.setInventoryType(1);
        clueItem5.setDescription("Found Ransom Note");
        clueItem5.setItemQuanity(0);
        inventory[EVIDENCE_FIVE_ITEM] = clueItem5;
        
        InventoryItem apple = new FoodItem();
        clueItem5.setInventoryType(2);
        clueItem5.setDescription("A delicious hand-picked apple.");
        clueItem5.setItemQuanity(0);
        inventory[APPLE] = apple;
        
        InventoryItem bread = new FoodItem();
        clueItem5.setInventoryType(2);
        clueItem5.setDescription("Fresh, delicious, homemade bread.");
        clueItem5.setItemQuanity(0);
        inventory[BREAD] = bread;
    }

    private static void createActorsList() {
        System.out.println("\n**** createActorsList stub function called ****");
    }

    private static void createMap() {
        Location[][] map = new Location[Constants.MAP_ROW_COUNT][Constants.MAP_COLUMN_COUNT];
        Location location = new Location();
        
        location.setRow(0);
        location.setColumn(0);
        InstanceLocation instance = new InstanceLocation();
        
    }
    
}
