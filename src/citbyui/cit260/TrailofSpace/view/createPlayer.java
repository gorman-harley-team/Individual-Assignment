/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.TrailofSpace.view;

import java.util.Scanner;

/**
 *
 * @author Travis Harley
 */
public class createPlayer {
    
    public String getPlayersName(){
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
}
