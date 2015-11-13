/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trailofspace;


import byui.cit260.curiousWorkmanship.model.Player;
import citbyui.cit260.TrailofSpace.view.startProgramView;
import citbyui.cit260.curiousworkmanship.control.Game;
import java.io.Serializable;


/**
 *
 * @author Travis
 * 
 * private double armor;
    private double upgradeArmor;
 */
public class TrailofSpace {
    private static Player player;
    private static Game currentGame;

    /**
     * @param args
     */
    
    public static void main(String[] args) {
            // create StartProgramView and start the program
            startProgramView startProgramView = new startProgramView();
            startProgramView.startProgram();

    }

    public static class CuriousWorkmanship {
        private static Game currentGame;

        public CuriousWorkmanship() {
        }
    }

    public class CuriousWorkmanship implements Serializable{

        public static void setPlayer(Player player) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
        public CuriousWorkmanship(){
            private static final Game currentGame = null;
            private static final Player player = null;
            
            public static void main(String[] args){
                
                public static Game getCurrentGame(){
                    return currentGame;
                }
                public static void setCurrentGame(Game currentGame) {
                    CuriousWorkmanship.currentGame = currentGame;
                }
                public static Player getPlayer() {
                    return player;
                }
                public static void setPlayer(Player player) {
                    TrailofSpace.player = player;
                }
                
            }// public static void main 
        }
    } // public CuriousWorkmanhship   
}
