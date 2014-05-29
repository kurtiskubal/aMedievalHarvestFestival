/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.aMedievalHarvestFestival.control;

import amedievalharvestfestival.AMedievalHarvestFestival;
import byui.cit260.aMedievalHarvestFestival.model.Player;

/**
 *
 * @author Kurt
 */
public class ProgramControl {

    public static Player createPlayer(String playersName) {
        
        Player player = new Player();
        player.setName(playersName);
      
        
        return player;
    }

  
    
}
