/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.curiousworkmanship.control;

import byui.cit260.curiousWorkmanship.model.Player;
import trailofspace.TrailofSpace;
import trailofspace.TrailofSpace.CuriousWorkmanship;


/**
 *
 * @author Travis Harley
 */
public class ProgramControl {

//    public static Player createPlayer(String playersName) {
//    System.out.println("\n**** createPlayer function called ****");
//    return null;
//    }
    
    public static Player createPlayer(String name){
        
        if(name == null){
            return null;
        }
        
        Player player= new Player();
        player.setName(name);
        TrailofSpace.setPlayer(player); // save the player
            
        return player;
    }
    
    public static Player getInput(String playersInput) {

        if (playersInput == null) {
        return null;
        }

        Player player = new Player();
        player.setName(playersInput);
        TrailofSpace.setPlayer(player); // save the player

        return player;
    }

//    public static Player createPlayer(Player player) {
//    System.out.println("\n**** createPlayer function called ****");    
//        return null;
//    }

    
}
