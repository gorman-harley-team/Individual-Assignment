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
public class HelpMenuView {
    
    public String getInput(){
        
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String selection = null;
        
        // while a valid name has not been retrieved
        while(!valid){
            
            //get the value entered from the keyboard
            selection = keyboard.nextLine();
            selection = selection.trim();
            
            if(selection.length() < 1){ //blank value entered
                System.out.println("\n*** Invalid selection *** Try again");
                continue;
            }
            
            break;
        }
        
        return selection; 
    }
    
        public class HelpMenu{

            public void doAction(char choice){
                switch (choice){
                    case 'G': // The goal of the game
                        this.GameGoal();
                        break;
                    case 'M':// How to move
                        this.GameKeys();
                        break;
                    case 'I': // The purpose of game items
                        this.ItemPurpose();
                        break;
                    default:
                        System.out.println("\n*** Invalid Selection *** Try again");
                        break;
                }
            
            }

        private void GameGoal() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void GameKeys() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void ItemPurpose() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
        }
    
    
}
