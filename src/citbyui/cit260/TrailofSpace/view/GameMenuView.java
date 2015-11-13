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
public class GameMenuView {
    
    private void doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public class GameMenu {
    
    public void doAction(char choice){
        switch (choice){
            case 'V': // view map
                this.MapStatus();
                break;
            case 'I':// view list of items in inventory
                this.InventoryItem();
                break;
            case 'S': // view ship status
                this.ShipStatus();
                break;
            case 'P': // view player stats
                this.PlayerStatus();
                break;
            case 'M': // move to new location
                this.LocationStatus();
                break;
            case 'X': // exit ship
                this.ShipControl();
                break;
            case 'E': // reenter ship
                this.ShipControl();
                break;
            case 'U': // upgrade ship
                this.ShipStatus();
                break;
            case 'H': //help
                this.help();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
    }

    private void MapStatus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void InventoryItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void ShipStatus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void PlayerStatus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void LocationStatus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void ShipControl() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void help() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }   
}

        
private final String GameMenu = "\n"
            +"\n------------------------"
            +"\n| Game Menu"
            +"\n------------------------"
            +"\nV - View map"
            +"\nI - View list of items in inventory"
            +"\nS - View ship status"
            +"\nP - View player stats"
            +"\nM - Move to new location"
            +"\nX - Exit Ship"
            +"\nE - Re-enter ship"
            +"\nU - Upgrade ship"
            +"\nH - Help"
            +"\nQ - Exit the game"
            +"\n------------------------";
            
    
    public void display() {
        String value;
        
        do{
            System.out.println(this.GameMenu);
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
