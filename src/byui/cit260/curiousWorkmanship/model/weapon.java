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
public class weapon implements Serializable{
    
    private String plasmaGun;
    private String beamBlade; 

    public weapon() {
    }

    public String getPlasmaGun() {
        return plasmaGun;
    }

    public void setPlasmaGun(String plasmaGun) {
        this.plasmaGun = plasmaGun;
    }

    public String getBeamBlade() {
        return beamBlade;
    }

    public void setBeamBlade(String beamBlade) {
        this.beamBlade = beamBlade;
    }

    @Override
    public String toString() {
        return "weapon{" + "plasmaGun=" + plasmaGun + ", beamBlade=" + beamBlade + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.plasmaGun);
        hash = 53 * hash + Objects.hashCode(this.beamBlade);
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
        final weapon other = (weapon) obj;
        if (!Objects.equals(this.plasmaGun, other.plasmaGun)) {
            return false;
        }
        if (!Objects.equals(this.beamBlade, other.beamBlade)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
