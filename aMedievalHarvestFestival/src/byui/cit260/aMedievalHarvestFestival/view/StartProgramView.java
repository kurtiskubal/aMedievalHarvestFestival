package byui.cit260.aMedievalHarvestFestival.view;
import byui.cit260.aMedievalHarvestFestival.model.Player;
import java.util.Scanner;


/**
 *
 * @author Kurt
 */


public class StartProgramView {
 //begin
    //Display the banner screen
    this.displayBanner();
    //Get the players name
    String playersName = this.getPlayersName();
    if (playersName == null)
        return;
    //Create a new player
    Player player = ProgramControl.createPlayer(playersName);
    //Display a customized welcome message
    this.displayWelcomeMessage(player);
    //DISPLAY the main menu
    MainMenuView mainMenuView = new MainMenuView();
    mainMenuView.displayMenu();
    
//end
    
    public void displayBanner() {
        System.out.println("\n\n**************************************");

        System.out.println("*                                         *"
                       + "\n* This is the game of A Medieval Festival *"
                       + "\n* In this game you will act as Lord       *"
                       + "\n  Pharaoh who was invited to the Williams *"
                       + "\n  Harvest Festival. You will be playing   *"
                       + "\n  games, interacting with other guests,   *"
                       + "\n  and eating and drinking good food.      *");

        System.out.println("*                                         *"
                       + "\n* You will soon discover that the         *"
                       + "\n* Princess has gone missing. You will have*"
                       + "\n  to find evidence to find out what       *"
                       + "\n  where she is and how she went missing.  *"
                       + "\n  To find evidence you will have to       *"
                       + "\n  explore the many rooms and places inside*"
                       + "\n  and outside the castle and look for key *"
                       + "\n  items that would led you to the Princess*"
                       + "\n  and the cause of her disappearance.     *"
                       + "\n  You will also have to talk to other     *"
                       + "\n  guests to find clues. While searching   *"
                       + "\n  for clues, you will have to make sure   *"
                       + "\n  that Lord Pharaoh is kept fed and       *"
                       + "\n  quenched.*");

        System.out.println("*                                         *"
                       + "\n* May your adventure fare thee well!      *");

        System.out.println("\n\n**************************************");
    }
    
    public String getPlayersName() {
        boolean valid = false;
        String playersName = null;
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid) {
        
            System.out.println("Enter the player's name below:");
            playersName = keyboard.nextLine();
            playersName = playersName.trim();
            
            if (playersName.toUpperCase().equals("Q")){
                return null;
            }
            
            if(playersName.length() < 2){
             System.out.println("Invalid name - the name must be non blank "
                                + "and greater than one character in length");
            }
            else {
                valid = true;
            }
        }
        return playersName;
            
    }

    private static class ProgramControl {

        private static Player createPlayer(String playersName) {
            System.out.print("\n**** createPlayer function called ****"); 
            return null;
        }
    }
    public void displayWelcomeMessage(Player player) {
        System.out.println("\n\n==============================");
        System.out.println("\tWelcome to the game " + player.getName());
        System.out.println("\tHave a good time!");
        System.out.println("\n==============================");
        
    }

    private static class playersName {

        public playersName() {
        }
    }

    public class MainMenuView{
            public void displayMenu() {
            System.out.print("\n**** MainMenu displayMenu function called ****");
        }

        
        }
    }

