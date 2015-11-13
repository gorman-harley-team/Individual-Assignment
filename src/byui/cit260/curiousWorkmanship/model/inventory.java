/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.curiousWorkmanship.model;

import java.util.Objects;

/**
 *
 * @author Travis
 */
public class inventory implements Serializable{
    
    private String item;
    private String upgradeShip;
    private String upgradeWeapon;
    private String upgradeArmor;
    private double health;

    public inventory() {
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getUpgradeShip() {
        return upgradeShip;
    }

    public void setUpgradeShip(String upgradeShip) {
        this.upgradeShip = upgradeShip;
    }

    public String getUpgradeWeapon() {
        return upgradeWeapon;
    }

    public void setUpgradeWeapon(String upgradeWeapon) {
        this.upgradeWeapon = upgradeWeapon;
    }

    public String getUpgradeArmor() {
        return upgradeArmor;
    }

    public void setUpgradeArmor(String upgradeArmor) {
        this.upgradeArmor = upgradeArmor;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "inventory{" + "item=" + item + ", upgradeShip=" + upgradeShip + ", upgradeWeapon=" + upgradeWeapon + ", upgradeArmor=" + upgradeArmor + ", health=" + health + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.item);
        hash = 79 * hash + Objects.hashCode(this.upgradeShip);
        hash = 79 * hash + Objects.hashCode(this.upgradeWeapon);
        hash = 79 * hash + Objects.hashCode(this.upgradeArmor);
        hash = 79 * hash + Objects.hashCode(this.health);
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
        final inventory other = (inventory) obj;
        if (!Objects.equals(this.item, other.item)) {
            return false;
        }
        if (!Objects.equals(this.upgradeShip, other.upgradeShip)) {
            return false;
        }
        if (!Objects.equals(this.upgradeWeapon, other.upgradeWeapon)) {
            return false;
        }
        if (!Objects.equals(this.upgradeArmor, other.upgradeArmor)) {
            return false;
        }
        if (!Objects.equals(this.health, other.health)) {
            return false;
        }
        return true;
    }
    
    
    
}
