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
public class armor implements Serializable{
    
    private double armor;
    private double upgradeArmor;
    
    
 public armor() {
    }
    
    
    
    public double getArmor() {
        return armor;
    }

    public void setArmor(double armor) {
        this.armor = armor;
    }

    public double getUpgradeArmor() {
        return upgradeArmor;
    }

    public void setUpgradeArmor(double upgradeArmor) {
        this.upgradeArmor = upgradeArmor;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.armor) ^ (Double.doubleToLongBits(this.armor) >>> 32));
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.upgradeArmor) ^ (Double.doubleToLongBits(this.upgradeArmor) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Armor{" + "armor=" + armor + ", upgradeArmor=" + upgradeArmor + '}';
    }
    
    
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final armor other = (armor) obj;
        if (Double.doubleToLongBits(this.armor) != Double.doubleToLongBits(other.armor)) {
            return false;
        }
        if (Double.doubleToLongBits(this.upgradeArmor) != Double.doubleToLongBits(other.upgradeArmor)) {
            return false;
        }
        return true;
    }
    
    
    
}
