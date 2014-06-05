/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.aMedievalHarvestFestival.control;

import amedievalharvestfestival.AMedievalHarvestFestival;
import byui.cit260.aMedievalHarvestFestival.model.Actors;
import byui.cit260.aMedievalHarvestFestival.model.BeverageItem;
import byui.cit260.aMedievalHarvestFestival.model.ClueItem;
import byui.cit260.aMedievalHarvestFestival.model.Constants;
import byui.cit260.aMedievalHarvestFestival.model.FoodItem;
import byui.cit260.aMedievalHarvestFestival.model.Game;
import byui.cit260.aMedievalHarvestFestival.model.GiftItem;
import byui.cit260.aMedievalHarvestFestival.model.InstanceLocation;
import byui.cit260.aMedievalHarvestFestival.model.InventoryItem;
import byui.cit260.aMedievalHarvestFestival.model.Location;
import byui.cit260.aMedievalHarvestFestival.model.Player;
import byui.cit260.aMedievalHarvestFestival.model.WeaponItem;

/**
 *
 * @author Kurt
 */
public class GameControl {
    
    private static Game game;
   
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
        InventoryItem[] inventory = new InventoryItem[Constants.NUMBER_OF_INVENTORY_ITEMS];
        
        InventoryItem clueItem1 = new ClueItem();
        clueItem1.setInventoryType(1);
        clueItem1.setDescription("Lock of Hair");
        clueItem1.setItemQuanity(0);
        inventory[Constants.EVIDENCE_ONE_ITEM] = clueItem1;
        
        InventoryItem clueItem2 = new ClueItem();
        clueItem2.setInventoryType(1);
        clueItem2.setDescription("Secretive Note");
        clueItem2.setItemQuanity(0);
        inventory[Constants.EVIDENCE_TWO_ITEM] = clueItem2;
        
        InventoryItem clueItem3 = new ClueItem();
        clueItem3.setInventoryType(1);
        clueItem3.setDescription("Note From Conversation With Queen");
        clueItem3.setItemQuanity(0);
        inventory[Constants.EVIDENCE_THREE_ITEM] = clueItem3;
        
        InventoryItem clueItem4 = new ClueItem();
        clueItem4.setInventoryType(1);
        clueItem4.setDescription("Note from Conversation with Princess");
        clueItem4.setItemQuanity(0);
        inventory[Constants.EVIDENCE_FOUR_ITEM] = clueItem4;
        
        InventoryItem clueItem5 = new ClueItem();
        clueItem5.setInventoryType(1);
        clueItem5.setDescription("Found Ransom Note");
        clueItem5.setItemQuanity(0);
        inventory[Constants.EVIDENCE_FIVE_ITEM] = clueItem5;
        
        InventoryItem apple = new FoodItem();
        apple.setInventoryType(2);
        apple.setDescription("A delicious hand-picked apple.");
        apple.setItemQuanity(0);
        inventory[Constants.APPLE] = apple;
        
        InventoryItem bread = new FoodItem();
        bread.setInventoryType(2);
        bread.setDescription("Fresh, delicious, homemade bread.");
        bread.setItemQuanity(0);
        inventory[Constants.BREAD] = bread;
        
        InventoryItem corn = new FoodItem();
        corn.setInventoryType(2);
        corn.setDescription("Freshly husked corn from the William's fields.");
        corn.setItemQuanity(0);
        inventory[Constants.CORN] = corn;
        
        InventoryItem beans = new FoodItem();
        beans.setInventoryType(2);
        beans.setDescription("Delicious black beans.");
        beans.setItemQuanity(0);
        inventory[Constants.BEANS] = beans;
        
        InventoryItem peas = new FoodItem();
        peas.setInventoryType(2);
        peas.setDescription("Freshly harvested peas with churned butter.");
        peas.setItemQuanity(0);
        inventory[Constants.PEAS] = peas;
        
        InventoryItem ale = new BeverageItem();
        ale.setInventoryType(3);
        ale.setDescription("A dark-colored alcoholic liquid, smells funny.");
        ale.setItemQuanity(0);
        inventory[Constants.ALE] = ale;
        
        InventoryItem mead = new BeverageItem();
        mead.setInventoryType(3);
        mead.setDescription("An alcoholic liquid with the taste of honey and water.");
        mead.setItemQuanity(0);
        inventory[Constants.MEAD] = mead;
        
        InventoryItem water = new BeverageItem();
        water.setInventoryType(3);
        water.setDescription("H20, or as it is now called, clear beer.");
        water.setItemQuanity(0);
        inventory[Constants.WATER] = water;
        
        InventoryItem cider = new BeverageItem();
        cider.setInventoryType(3);
        cider.setDescription("Old apple juice.");
        cider.setItemQuanity(0);
        inventory[Constants.CIDER] = cider;
        
        InventoryItem wine = new BeverageItem();
        wine.setInventoryType(3);
        wine.setDescription("Old grape juice.");
        wine.setItemQuanity(0);
        inventory[Constants.WINE] = wine;
        
        InventoryItem dagger = new WeaponItem();
        dagger.setInventoryType(4);
        dagger.setDescription("A deadly, sharp, short blade. Looks like it can be hidden easily");
        dagger.setItemQuanity(0);
        inventory[Constants.DAGGER] = dagger;
        
        InventoryItem sword = new WeaponItem();
        sword.setInventoryType(3);
        sword.setDescription("A long, edged weapon.");
        sword.setItemQuanity(0);
        inventory[Constants.SWORD] = sword;
    
        InventoryItem genericGift = new GiftItem();
        genericGift.setInventoryType(4);
        genericGift.setDescription("A plain, old gift.");
        genericGift.setItemQuanity(0);
        inventory[Constants.GENERIC_GIFT] = genericGift;
        
        InventoryItem gift = new GiftItem();
        gift.setInventoryType(4);
        gift.setDescription("A pretty nice gift.");
        gift.setItemQuanity(0);
        inventory[Constants.GIFT] = gift;
        
        InventoryItem awesomeGift = new GiftItem();
        awesomeGift.setInventoryType(4);
        awesomeGift.setDescription("An awesome gift.");
        awesomeGift.setItemQuanity(0);
        inventory[Constants.AWESOME_GIFT] = awesomeGift;
    }

    private static void createActorsList() {
        
        Actors[] actors = new Actors[Constants.NUMBER_OF_ACTORS];
        
        Actors ladyViolet = new Actors();
        ladyViolet.setName("Lady Violet");
        ladyViolet.setDialogue("dialogue");
        ladyViolet.setHappiness(0);
        ladyViolet.setHealth(100);
        actors[Constants.VIOLET] = ladyViolet;
        
        Actors dFred = new Actors();
        dFred.setName("Duke Frederick");
        dFred.setDialogue("dialogue");
        dFred.setHappiness(0);
        dFred.setHealth(100);
        actors[Constants.FREDERICK] = dFred;
        
        Actors dHarold = new Actors();
        dHarold.setName("Duke Harold");
        dHarold.setDialogue("dialogue");
        dHarold.setHappiness(0);
        dHarold.setHealth(100);
        actors[Constants.HAROLD] = dHarold;
        
        Actors dLuis = new Actors();
        dLuis.setName("Duke Luis");
        dLuis.setDialogue("dialogue");
        dLuis.setHappiness(0);
        dLuis.setHealth(100);
        actors[Constants.LUIS] = dLuis;
        
        Actors lCanaway = new Actors();
        lCanaway.setName("Lord Canaway");
        lCanaway.setDialogue("dialogue");
        lCanaway.setHappiness(0);
        lCanaway.setHealth(100);
        actors[Constants.CANAWAY] = lCanaway;
        
        Actors pWilliam = new Actors();
        pWilliam.setName("Princess William");
        pWilliam.setDialogue("dialogue");
        pWilliam.setHappiness(0);
        pWilliam.setHealth(100);
        actors[Constants.PRINCESS_WILLIAM] = pWilliam;
        
        Actors qWilliam = new Actors();
        qWilliam.setName("Queen William");
        qWilliam.setDialogue("dialogue");
        qWilliam.setHappiness(0);
        qWilliam.setHealth(100);
        actors[Constants.QUEEN_WILLIAM] = qWilliam;
        
        Actors kWilliam = new Actors();
        kWilliam.setName("King William");
        kWilliam.setDialogue("dialogue");
        kWilliam.setHappiness(0);
        kWilliam.setHealth(100);
        actors[Constants.KING_WILLIAM] = kWilliam;
        
        Actors servantC = new Actors();
        servantC.setName("Servant Charles");
        servantC.setDialogue("dialogue");
        servantC.setHappiness(0);
        servantC.setHealth(100);
        actors[Constants.SERVANT_CHARLES] = servantC;
        
        Actors servantD = new Actors();
        servantD.setName("Servant David");
        servantD.setDialogue("dialogue");
        servantD.setHappiness(0);
        servantD.setHealth(100);
        actors[Constants.SERVANT_DAVID] = servantD;
        
        Actors servantL = new Actors();
        servantL.setName("Servant Larry");
        servantL.setDialogue("dialogue");
        servantL.setHappiness(0);
        servantL.setHealth(100);
        actors[Constants.SERVANT_LARRY] = servantL;
        
    }

    private static void createMap() {
        Location[][] map = new Location[Constants.MAP_ROW_COUNT][Constants.MAP_COLUMN_COUNT];
        Location location = new Location();
        
        location.setRow(0);
        location.setColumn(0);
        InstanceLocation instance = new InstanceLocation();
        
    }
    
}
