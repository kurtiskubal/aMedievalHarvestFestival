/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.aMedievalHarvestFestival.control;

/**
 *
 * @author Kurt
 */
public class MapControl {
    public double calcSqFootageOfRoom(double roomWidth, double roomLength){

        if (roomWidth < 0 || roomLength < 0){
            return -1;
        }
        if (roomLength > 50 || roomWidth > 100) { 
            return -2;
        }
        double squareFootage = roomWidth * roomLength;

        return squareFootage;
    }
}