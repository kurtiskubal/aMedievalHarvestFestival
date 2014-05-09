/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package amedievalharvestfestival;

import byui.cit260.aMedievalHarvestFestival.model.Actors;
import byui.cit260.aMedievalHarvestFestival.model.InstanceLocation;
import byui.cit260.aMedievalHarvestFestival.model.Location;
import byui.cit260.aMedievalHarvestFestival.model.Map;
import byui.cit260.aMedievalHarvestFestival.model.PoolInstance;
import byui.cit260.aMedievalHarvestFestival.model.PuzzleLocation;
import byui.cit260.aMedievalHarvestFestival.model.RoomInstance;
import byui.cit260.aMedievalHarvestFestival.model.YardInstance;

/**
 *
 * @author Kurt
 */
public class AMedievalHarvestFestival {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
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
