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
public abstract class View implements ViewInterface {
    
    Scanner keyboard = new Scanner(System.in);
    protected String displayMessage; 
    
    public View(String message){
        this.displayMessage = message;
    }
    
    @Override
    public void display(){
        String value = "";
        boolean done = false; 
        
        do{
            System.out.println(this.displayMessage); // print message
            value = this.getInput(); // get the users selection
            done = this.doAction(value); // do action based on selection
        }
        while (!done);
    }
    
    @Override
    public String getInput(){
        
        boolean valid = false;
        String selection = null;
        
        // while a valid name has not been retrieved
        while(!valid){
            
            //get the value entered from the keyboard
            selection = keyboard.nextLine();
            selection = selection.trim();
            
            if(selection.length() < 1){ //blank value entered
                System.out.println("You must enter a value");
                continue;
            }
            
            break;
        }
        
        return selection; 
    }
}
