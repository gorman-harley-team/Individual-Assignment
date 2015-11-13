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
public class game implements Serializable{
    
    private String characterName;
    private String weapons;

    public game() {
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getWeapons() {
        return weapons;
    }

    public void setWeapons(String weapons) {
        this.weapons = weapons;
    }

    @Override
    public String toString() {
        return "game{" + "characterName=" + characterName + ", weapons=" + weapons + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.characterName);
        hash = 17 * hash + Objects.hashCode(this.weapons);
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
        final game other = (game) obj;
        if (!Objects.equals(this.characterName, other.characterName)) {
            return false;
        }
        if (!Objects.equals(this.weapons, other.weapons)) {
            return false;
        }
        return true;
    }
    
    
    
}
