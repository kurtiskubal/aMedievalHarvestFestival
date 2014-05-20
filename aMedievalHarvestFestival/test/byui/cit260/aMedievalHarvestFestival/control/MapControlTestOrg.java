/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.aMedievalHarvestFestival.control;

import byui.cit260.aMedievalHarvestFestival.control.*;
import byui.cit260.aMedievalHarvestFestival.control.MapControl;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kurt
 */
public class MapControlTestOrg {
    
    public MapControlTestOrg() {
    }

    /**
     * Test of calcSqFootageOfRoom method, of class MapControl.
     */
    @Test
    public void testCalcSqFootageOfRoom() {
        System.out.println("calcSqFootageOfRoom");
        double roomWidth = 10.0;
        double roomLength = 5.0;
        MapControl instance = new MapControl();
        double expResult = 50.0;
        double result = instance.calcSqFootageOfRoom(roomWidth, roomLength);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       
    
    
    /**
     * Test 2
     */
    
        System.out.println("calcSqFootageOfRoom Test 2");
        roomWidth = 10.0;
        roomLength = -1.0;
        
        expResult = -1.0;
        
        result = instance.calcSqFootageOfRoom(roomWidth, roomLength);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
         
        /**
     * Test 3
     */
    
        System.out.println("calcSqFootageOfRoom Test 2");
        roomWidth = -1.0;
        roomLength = 5.0;
        
        expResult = -1.0;
        
        result = instance.calcSqFootageOfRoom(roomWidth, roomLength);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
         
        /**
     * Test 4
     */
    
        System.out.println("calcSqFootageOfRoom Test 2");
        roomWidth = 120.0;
        roomLength = 50.0;
        
        expResult = -2.0;
        
        result = instance.calcSqFootageOfRoom(roomWidth, roomLength);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
         
        /**
     * Test 5
     */
    
        System.out.println("calcSqFootageOfRoom Test 2");
        roomWidth = 10.0;
        roomLength = 0.0;
        
        expResult = 0.0;
        
        result = instance.calcSqFootageOfRoom(roomWidth, roomLength);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
         
        /**
     * Test 6
     */
    
        System.out.println("calcSqFootageOfRoom Test 2");
        roomWidth = 0.0;
        roomLength = 32.0;
        
        expResult = 0.0;
        
        result = instance.calcSqFootageOfRoom(roomWidth, roomLength);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
         
        /**
     * Test 7
     */
    
        System.out.println("calcSqFootageOfRoom Test 2");
        roomWidth = 100.0;
        roomLength = 50.0;
        
        expResult = 5000.0;
        
        result = instance.calcSqFootageOfRoom(roomWidth, roomLength);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
         
    }
}
