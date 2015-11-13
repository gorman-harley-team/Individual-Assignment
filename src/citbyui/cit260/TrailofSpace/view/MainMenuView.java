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

    private void doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public class mainMenu{
    
        public void doAction(char choice){
            switch (choice){
                case 'S': // Start new game
                    this.newGame();
                    break;
                case 'L':// Load Game
                    this.loadGame();
                    break;
                case 'H': // Help, how to play the game
                    this.help();
                    break;
                case 'E': // Exit the game
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
    
    private final String menu = "\n"
            +"\n------------------------"
            +"\n| Main Menu"
            +"\n------------------------"
            +"\nS - Start new game"
            +"\nL - Load game"
            +"\nH - Help, how to play the game"
            +"\nE - Exit the game"
            +"\n------------------------";
            
    
    public void display() {
        String value;
        
        do{
            System.out.println(this.menu);
            value = this.getInput();
            this.doAction(value);
        }
        while (!value.equals("Q"));
    }
    
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
    
}
