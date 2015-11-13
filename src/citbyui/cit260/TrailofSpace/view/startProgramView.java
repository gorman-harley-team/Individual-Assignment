/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.TrailofSpace.view;

import byui.cit260.curiousWorkmanship.model.Player;
import citbyui.cit260.curiousworkmanship.control.ProgramControl;
import java.util.Scanner;

/**
 *
 * @author Travis Harley
 */
public class startProgramView {
     
    public void startProgram(){
        
        //display the banner screen
        this.displayBanner();
        
        //prompt the player to enter their name Retreieve the name of the player
        String playersName = this.getPlayersName();
               
        //create and asave the player object
        Player player = ProgramControl.createPlayer(playersName);
        
        //display a personalized welcome message
        this.displayWelcomeMessage(player);
        
        //display the main menu
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.displayMenu();
    }

    private void displayBanner() {
        System.out.println("\n\n************************************");
        
        System.out.println("*                                       *"
                + "In the deep distances of outer space, evil reigns"
                + "the galaxy. One hero will rise and protect sector"
                + "6 from the rather of Randy, The Space Emporer."
                + "Fly to the ends of the universe and save your loved"
                + "ones. And your favorite burritto space restaurant.");
        
        System.out.println("*                                       "
                + "You will need to solve ancient math problems in order"
                + "to gain more gear to help you in your adventure."
                + "As you continue your jounrey, you will gain more power"
                + "and ship upgrades to help you chase down Randy. Don't"
                + "let the Space Empoere out smart you with the anciemt"
                + "math traps!*");
        
        System.out.println("*                                       "
                + "\n Good luck. Remember, where ever you go...."
                + "\n there you are.*");
        
        System.out.println("\n\n************************************");
    
    }

    public String getPlayersName() {
        boolean valid = false; // indicates if the name has been retrieved
            String playersName = null;
            Scanner keyboard = new Scanner(System.in); // keyboard input stream
            
            while(!valid){ // while a valid name has not been tretreieve
                
                //prompt for the players name
                System.out.println("Enter the players name below:");
                
                //get teh name from the keyboard and trim off the blanks
                playersName = keyboard.nextLine();
                playersName = playersName.trim();
                
                // if the name is invalid (less than 2 characters in lenght)
                if(playersName.length() < 2){
                    System.out.println("Invalid name - the name must not be blank");
                    continue; // and repeat again
                }
                break; // out of the (exit) the repetition
            }
            
            return playersName;
    }

    public void displayWelcomeMessage(Player player) {
            System.out.println("\n\n==================================");
            System.out.println("\tWelcome to the game " + player.getName());
            System.out.println("\tWe hope you have a lot of fun!");
            System.out.println("\n\n==================================");
    }
}
