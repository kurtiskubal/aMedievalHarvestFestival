/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.aMedievalHarvestFestival.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kurt
 */
public class MapControlTest {
    
    public MapControlTest() {
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
        fail("The test case is a prototype.");
    }
    
}
