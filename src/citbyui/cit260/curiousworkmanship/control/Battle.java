/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.curiousworkmanship.control;

/**
 *
 * @author Travis Harley
 */
public class Battle {
    
    
    public double calcBattleSequence(double playerHealth, double enemyHealth, double playerAttack, double enemyAttack){
        
           if(playerHealth < 0 || playerHealth > 20){
               return 99; //99 represents incorrect value
           }
           if(enemyHealth < 0 || enemyHealth > 20){
               return 99;
           }
           if(playerAttack < 1 || playerAttack > 5){
               return 99;
           }
           if(enemyAttack < 1 || enemyAttack > 5){
               return 99;
           }
        
            double battleEquation = (enemyHealth / playerAttack) - (playerHealth / enemyAttack);
           
            return battleEquation; 
    }
}
