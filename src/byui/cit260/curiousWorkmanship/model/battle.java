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
public class battle implements Serializable{
    
    private double attack;
    private double defend;

    public battle() {
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public double getDefend() {
        return defend;
    }

    public void setDefend(double defend) {
        this.defend = defend;
    }

    @Override
    public String toString() {
        return "battle{" + "attack=" + attack + ", defend=" + defend + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.attack) ^ (Double.doubleToLongBits(this.attack) >>> 32));
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.defend) ^ (Double.doubleToLongBits(this.defend) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final battle other = (battle) obj;
        if (Double.doubleToLongBits(this.attack) != Double.doubleToLongBits(other.attack)) {
            return false;
        }
        if (Double.doubleToLongBits(this.defend) != Double.doubleToLongBits(other.defend)) {
            return false;
        }
        return true;
    }
    
    
    
}
