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
public class BattleMenuView {

    private void doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
           public class BattleMenu{
            
            public void doAction(char choice){
                switch (choice){
                    case 'A': // Attack
                        this.GameGoal();
                        break;
                    case 'D':// Defend
                        this.GameKeys();
                        break;
                    case 'P': // Predict outcome
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
    
           
           private final String BattleMenu = "\n"
            +"\n------------------------"
            +"\n| Battle Menu"
            +"\n------------------------"
            +"\nA - Attack"
            +"\nD - Defend"
            +"\nP - Predict outcome"
            +"\nQ - Exit the game"
            +"\n------------------------";
            
    
    public void display() {
        String value;
        
        do{
            System.out.println(this.BattleMenu);
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
