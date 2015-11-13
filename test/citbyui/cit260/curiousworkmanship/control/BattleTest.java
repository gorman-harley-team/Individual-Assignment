/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.curiousworkmanship.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Travis Harley
 */
public class BattleTest {
    
    public BattleTest() {
    }

    /**
     * Test of calcBattleSequence method, of class Battle.
     */
    @Test
    public void testCalcBattleSequence() {
        System.out.println("Test Case 1");
        double playerHealth = 20;
        double enemyHealth = 10;
        double playerAttack = 5;
        double enemyAttack = 5;
        Battle instance = new Battle();
        double expResult;
        expResult = -2;
        double result = instance.calcBattleSequence(playerHealth, enemyHealth, playerAttack, enemyAttack);
        assertEquals(expResult, result, -2);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    
    
    
    }
    /******
     * 
     * Test Case 2
     * 
     */
    @Test
    public void test2CalcBattleSequence(){
        System.out.println("Test Case 2");
        double playerHealth = 15;
        double enemyHealth = 12;
        double playerAttack = 2;
        double enemyAttack = 1;
        Battle instance = new Battle();
        double expResult;
        expResult = -9;
        double result = instance.calcBattleSequence(playerHealth, enemyHealth, playerAttack, enemyAttack);
        assertEquals(expResult, result, -9);
    }
    
    /******
     * 
     * Test Case 3
     * 
     */
    @Test
    public void test3CalcBattleSequence(){
        System.out.println("Test Case 3");
        double playerHealth = -2;
        double enemyHealth = 21;
        double playerAttack = -1;
        double enemyAttack = 4;
        Battle instance = new Battle();
        double expResult;
        expResult = 99;
        double result = instance.calcBattleSequence(playerHealth, enemyHealth, playerAttack, enemyAttack);
        assertEquals(expResult, result, 99);
    }
    
    /******
     * 
     * Test Case 4
     * 
     */
    @Test
    public void test4CalcBattleSequence(){
        System.out.println("Test Case 4");
        double playerHealth = 23;
        double enemyHealth = 22;
        double playerAttack = -2;
        double enemyAttack = 5;
        Battle instance = new Battle();
        double expResult;
        expResult = 99;
        double result = instance.calcBattleSequence(playerHealth, enemyHealth, playerAttack, enemyAttack);
        assertEquals(expResult, result, 99);
    }
    
    /******
     * 
     * Test Case 5
     * 
     */
    @Test
    public void test5CalcBattleSequence(){
        System.out.println("Test Case 5");
        double playerHealth = -5;
        double enemyHealth = 23;
        double playerAttack = -3;
        double enemyAttack = 6;
        Battle instance = new Battle();
        double expResult;
        expResult = 99;
        double result = instance.calcBattleSequence(playerHealth, enemyHealth, playerAttack, enemyAttack);
        assertEquals(expResult, result, 99);
    }
    
    /******
     * 
     * Test Case 6
     * 
     */
    @Test
    public void test6CalcBattleSequence(){
        System.out.println("Test Case 6");
        double playerHealth = 6;
        double enemyHealth = 1;
        double playerAttack = 3;
        double enemyAttack = 2;
        Battle instance = new Battle();
        double expResult;
        expResult = -2.6666666666666665;
        double result = instance.calcBattleSequence(playerHealth, enemyHealth, playerAttack, enemyAttack);
        assertEquals(expResult, result, -2.6666666666666665);
    }
    
    /******
     * 
     * Test Case 7
     * 
     */
    @Test
    public void test7CalcBattleSequence(){
        System.out.println("Test Case 7");
        double playerHealth = 12;
        double enemyHealth = 15;
        double playerAttack = 2;
        double enemyAttack = 3;
        Battle instance = new Battle();
        double expResult;
        expResult = 3.5;
        double result = instance.calcBattleSequence(playerHealth, enemyHealth, playerAttack, enemyAttack);
        assertEquals(expResult, result, 3.5);
    }
    
    /******
     * 
     * Test Case 8     * 
     */
    @Test
    public void test8CalcBattleSequence(){
        System.out.println("Test Case 8");
        double playerHealth = 20;
        double enemyHealth = 7;
        double playerAttack = 1;
        double enemyAttack = 1;
        Battle instance = new Battle();
        double expResult;
        expResult = -13;
        double result = instance.calcBattleSequence(playerHealth, enemyHealth, playerAttack, enemyAttack);
        assertEquals(expResult, result, -13);
    }
}
