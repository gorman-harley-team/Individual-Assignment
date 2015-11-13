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
public class map implements Serializable{
    
    private String rowCount;
    private String columnCount;
    private String locationsVisited;

    public map() {
    }

    public String getRowCount() {
        return rowCount;
    }

    public void setRowCount(String rowCount) {
        this.rowCount = rowCount;
    }

    public String getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(String columnCount) {
        this.columnCount = columnCount;
    }

    public String getLocationsVisited() {
        return locationsVisited;
    }

    public void setLocationsVisited(String locationsVisited) {
        this.locationsVisited = locationsVisited;
    }

    @Override
    public String toString() {
        return "map{" + "rowCount=" + rowCount + ", columnCount=" + columnCount + ", locationsVisited=" + locationsVisited + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.rowCount);
        hash = 29 * hash + Objects.hashCode(this.columnCount);
        hash = 29 * hash + Objects.hashCode(this.locationsVisited);
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
        final map other = (map) obj;
        if (!Objects.equals(this.rowCount, other.rowCount)) {
            return false;
        }
        if (!Objects.equals(this.columnCount, other.columnCount)) {
            return false;
        }
        if (!Objects.equals(this.locationsVisited, other.locationsVisited)) {
            return false;
        }
        return true;
    }
    
    
    
}
