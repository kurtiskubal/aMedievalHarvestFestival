/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package amedievalharvestfestival;


import byui.cit260.aMedievalHarvestFestival.model.Actors;
import byui.cit260.aMedievalHarvestFestival.model.BeverageItem;
import byui.cit260.aMedievalHarvestFestival.model.ClueItem;
import byui.cit260.aMedievalHarvestFestival.model.FoodItem;
import byui.cit260.aMedievalHarvestFestival.model.Game;
import byui.cit260.aMedievalHarvestFestival.model.GiftItem;
import byui.cit260.aMedievalHarvestFestival.model.InstanceLocation;
import byui.cit260.aMedievalHarvestFestival.model.InventoryItem;
import byui.cit260.aMedievalHarvestFestival.model.Location;
import byui.cit260.aMedievalHarvestFestival.model.Map;
import byui.cit260.aMedievalHarvestFestival.model.Player;
import byui.cit260.aMedievalHarvestFestival.model.PoolInstance;
import byui.cit260.aMedievalHarvestFestival.model.PuzzleLocation;
import byui.cit260.aMedievalHarvestFestival.model.RoomInstance;
import byui.cit260.aMedievalHarvestFestival.model.WeaponItem;
import byui.cit260.aMedievalHarvestFestival.model.YardInstance;
import byui.cit260.aMedievalHarvestFestival.view.StartProgramView;


/**
 * co-editor: Adam
 * @author Kurt
 */
public class AMedievalHarvestFestival {
    private static Game currentGame = null;
    private static Player player = null;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        StartProgramView startProgramView = new StartProgramView();
        startProgramView.startProgram();
        
        
      
    }
    
    
}
