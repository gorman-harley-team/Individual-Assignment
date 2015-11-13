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
public class spaceCaves implements Serializable{
    
    private String caveTrapOne;
    private String caveTrapTwo;
    private String caveCollection;

    public spaceCaves() {
    }

    public String getCaveTrapOne() {
        return caveTrapOne;
    }

    public void setCaveTrapOne(String caveTrapOne) {
        this.caveTrapOne = caveTrapOne;
    }

    public String getCaveTrapTwo() {
        return caveTrapTwo;
    }

    public void setCaveTrapTwo(String caveTrapTwo) {
        this.caveTrapTwo = caveTrapTwo;
    }

    public String getCaveCollection() {
        return caveCollection;
    }

    public void setCaveCollection(String caveCollection) {
        this.caveCollection = caveCollection;
    }

    @Override
    public String toString() {
        return "spaceCaves{" + "caveTrapOne=" + caveTrapOne + ", caveTrapTwo=" + caveTrapTwo + ", caveCollection=" + caveCollection + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.caveTrapOne);
        hash = 67 * hash + Objects.hashCode(this.caveTrapTwo);
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
        final spaceCaves other = (spaceCaves) obj;
        if (!Objects.equals(this.caveTrapOne, other.caveTrapOne)) {
            return false;
        }
        if (!Objects.equals(this.caveTrapTwo, other.caveTrapTwo)) {
            return false;
        }
        if (!Objects.equals(this.caveCollection, other.caveCollection)) {
            return false;
        }
        return true;
    }
    
    
}
