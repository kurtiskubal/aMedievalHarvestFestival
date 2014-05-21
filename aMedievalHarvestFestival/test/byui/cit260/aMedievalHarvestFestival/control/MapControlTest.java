/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.aMedievalHarvestFestival.control;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author zev
 */
public class MapControlTest {
    
    public MapControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcSqFootageOfRoom method, of class MapControl.
     */
    @Test
    public void testCalcSqFootageOfRoom() {
        System.out.println("calcSqFootageOfRoom test 1");
        double roomWidth = 10.0;
        double roomLength = 5.0;
        MapControl instance = new MapControl();
        double expResult = 50.0;
        double result = instance.calcSqFootageOfRoom(roomWidth, roomLength);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("calcSqFootageOfRoom test 2");
        roomWidth = 10.0;
        roomLength = -1.0;
        expResult = -1.0;
        result = instance.calcSqFootageOfRoom(roomWidth, roomLength);
        assertEquals(expResult, result, 0.0);
    
        System.out.println("calcSqFootageOfRoom test 3");
        roomWidth = -1.0;
        roomLength = 5.0;
        expResult = -1.0;
        result = instance.calcSqFootageOfRoom(roomWidth, roomLength);
        assertEquals(expResult, result, 0.0);
    
        System.out.println("calcSqFootageOfRoom test 4");
        roomWidth = 120.0;
        roomLength = 50.0;
        expResult = -2.0;
        result = instance.calcSqFootageOfRoom(roomWidth, roomLength);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("calcSqFootageOfRoom test 5");
        roomWidth = 10.0;
        roomLength = 0.0;
        expResult = 0.0;
        result = instance.calcSqFootageOfRoom(roomWidth, roomLength);
        assertEquals(expResult, result, 0.0);
    
        System.out.println("calcSqFootageOfRoom test 6");
        roomWidth = 0.0;
        roomLength = 32.0;
        expResult = 0.0;
        result = instance.calcSqFootageOfRoom(roomWidth, roomLength);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("calcSqFootageOfRoom test 7");
        roomWidth = 100.0;
        roomLength = 50.0;
        expResult = 5000.0;
        result = instance.calcSqFootageOfRoom(roomWidth, roomLength);
        assertEquals(expResult, result, 0.0);
    
    }
    
    
    
}
