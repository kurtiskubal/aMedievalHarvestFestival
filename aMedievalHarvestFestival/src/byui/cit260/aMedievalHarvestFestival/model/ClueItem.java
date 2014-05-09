/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.aMedievalHarvestFestival.model;

/**
 *
 * @author Adam
 */
public class ClueItem extends InventoryItem{
    
    
    // Class instance variables
    
    private String keyInformation;
    private Integer evidenceRemaining;

    public ClueItem() {
    }

    public String getKeyInformation() {
        return keyInformation;
    }

    public void setKeyInformation(String keyInformation) {
        this.keyInformation = keyInformation;
    }

    public Integer getEvidenceRemaining() {
        return evidenceRemaining;
    }

    public void setEvidenceRemaining(Integer evidenceRemaining) {
        this.evidenceRemaining = evidenceRemaining;
    }
    
    
    
}
