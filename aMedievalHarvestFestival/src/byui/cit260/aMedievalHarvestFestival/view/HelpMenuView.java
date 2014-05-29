/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.aMedievalHarvestFestival.view;


import java.util.Scanner;

/**
 *
 * @author Kurt
 */
public class HelpMenuView {

    private static final String MENU = "\n"
            + "\n----------------------------------------------"
            + "\n| How to Play                                |"
            + "\nG - How do I beat the game?"
            + "\nM - How do I move throughout the game?"
            + "\nT - How do I talk to other characters in the game?"
            + "\nF - How do I feed my character and estimate how "
            + "\nhungry and thirsty he is?"
            + "\nE - How do I look into my inventory?"
            + "\nI - How do I get items and how do I use them?"
            + "\nL - How do I determine my location in the game?"
            + "\nS - How do I save my progress?"
            + "\nQ - Leave the How to Play menu"
            + "\n----------------------------------------------";

    void displayMenu() {
        
        char selection = ' ';
        do {
            
            System.out.println(MENU);
            
            String input = this.getInput();
            selection = input.charAt(0);
            
            this.doAction(selection);
        } while (selection != 'Q');
        
        
    }

    public String getInput() {
        boolean valid = false;
        String helpInput = null;
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid) {
            
            helpInput = keyboard.nextLine();
            helpInput = helpInput.trim();
            
            if (helpInput.length() != 1) {
                System.out.println("Invalid selection - the selection must be non blank" +
                                   " and only one character in length.");
            }
            
            else {
                valid = true;
            }
        }
        
        return helpInput.toUpperCase();
    }

    public void doAction(char selection) {
        switch (selection) {
            case 'G':
                System.out.println("G was selected");
                break;
            case 'M':
                System.out.println("M was selected");
                break;
            case 'T':
                System.out.println("T was selected");
                break;
            case 'F':
                System.out.println("F was selected");
                break;
            case 'E':
                System.out.println("E was selected");
                break;
            case 'I':
                System.out.println("I was selected");
                break;
            case 'L':
                System.out.println("L was selected");
                break;
            case 'S':
                System.out.println("S was selected");
                break;
            case 'Q':
                return;
            default:
                System.out.print("\n*** Invalid selction *** Try Again");
                break;
        }
    }
}
