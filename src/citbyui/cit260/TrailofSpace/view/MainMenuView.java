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
public class MainMenuView {

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
    
    public class mainMenu{
    
        public void doAction(char choice){
            switch (choice){
                case 'S': // view map
                    this.newGame();
                    break;
                case 'L':// view list of items in inventory
                    this.loadGame();
                    break;
                case 'H': // view ship status
                    this.help();
                    break;
                default:
                    System.out.println("\n*** Invalid Selection *** Try again");
                    break;
            }
        }

        private void newGame() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void loadGame() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void help() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    
    }
    
    void displayMenu() {
        System.out.println("Displaying the menu");
    }
    
}
