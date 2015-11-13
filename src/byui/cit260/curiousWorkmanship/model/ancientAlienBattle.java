/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.curiousWorkmanship.model;

/**
 *
 * @author Travis
 */
public class ancientAlienBattle implements Serializable{
    
    private double mathTrapOne;
    private double mathTrapTwo;
    private double mathTrapThree;
    
    
 public ancientAlienBattle() {
    }
    
    

    public double getMathTrapOne() {
        return mathTrapOne;
    }

    public void setMathTrapOne(double mathTrapOne) {
        this.mathTrapOne = mathTrapOne;
    }

    public double getMathTrapTwo() {
        return mathTrapTwo;
    }

    public void setMathTrapTwo(double mathTrapTwo) {
        this.mathTrapTwo = mathTrapTwo;
    }

    public double getMathTrapThree() {
        return mathTrapThree;
    }

    public void setMathTrapThree(double mathTrapThree) {
        this.mathTrapThree = mathTrapThree;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.mathTrapOne) ^ (Double.doubleToLongBits(this.mathTrapOne) >>> 32));
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.mathTrapTwo) ^ (Double.doubleToLongBits(this.mathTrapTwo) >>> 32));
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.mathTrapThree) ^ (Double.doubleToLongBits(this.mathTrapThree) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "AncientAlienBattle{" + "mathTrapOne=" + mathTrapOne + ", mathTrapTwo=" + mathTrapTwo + ", mathTrapThree=" + mathTrapThree + '}';
    }
    
    
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ancientAlienBattle other = (ancientAlienBattle) obj;
        if (Double.doubleToLongBits(this.mathTrapOne) != Double.doubleToLongBits(other.mathTrapOne)) {
            return false;
        }
        if (Double.doubleToLongBits(this.mathTrapTwo) != Double.doubleToLongBits(other.mathTrapTwo)) {
            return false;
        }
        if (Double.doubleToLongBits(this.mathTrapThree) != Double.doubleToLongBits(other.mathTrapThree)) {
            return false;
        }
        return true;
    }
    
    
    
}
