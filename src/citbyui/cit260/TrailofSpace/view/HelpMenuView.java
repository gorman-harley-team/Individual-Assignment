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

    private void doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
        
        private final String HelpMenu = "\n"
            +"\n------------------------"
            +"\n| Help Menu"
            +"\n------------------------"
            +"\nG - View map"
            +"\nM - View list of items in inventory"
            +"\nI - View ship status"
            +"\nQ - Exit the game"
            +"\n------------------------";
            
    
    public void display() {
        String value;
        
        do{
            System.out.println(this.HelpMenu);
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
