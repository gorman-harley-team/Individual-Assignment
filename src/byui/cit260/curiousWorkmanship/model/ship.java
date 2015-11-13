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
public class ship implements Serializable {
    
    private String exit;
    private String reEnter;
    private String upgrade;
    private String shipStats; 

    public ship() {
    }

    public String getExit() {
        return exit;
    }

    public void setExit(String exit) {
        this.exit = exit;
    }

    public String getReEnter() {
        return reEnter;
    }

    public void setReEnter(String reEnter) {
        this.reEnter = reEnter;
    }

    public String getUpgrade() {
        return upgrade;
    }

    public void setUpgrade(String upgrade) {
        this.upgrade = upgrade;
    }

    public String getShipStats() {
        return shipStats;
    }

    public void setShipStats(String shipStats) {
        this.shipStats = shipStats;
    }

    @Override
    public String toString() {
        return "ship{" + "exit=" + exit + ", reEnter=" + reEnter + ", upgrade=" + upgrade + ", shipStats=" + shipStats + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.exit);
        hash = 11 * hash + Objects.hashCode(this.reEnter);
        hash = 11 * hash + Objects.hashCode(this.upgrade);
        hash = 11 * hash + Objects.hashCode(this.shipStats);
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
        final ship other = (ship) obj;
        if (!Objects.equals(this.exit, other.exit)) {
            return false;
        }
        if (!Objects.equals(this.reEnter, other.reEnter)) {
            return false;
        }
        if (!Objects.equals(this.upgrade, other.upgrade)) {
            return false;
        }
        if (!Objects.equals(this.shipStats, other.shipStats)) {
            return false;
        }
        return true;
    }
    
    
}
