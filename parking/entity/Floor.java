package uz.jl.parking.entity;

/**
 * @author Elmurodov Javohir, Tue 10:36 AM. 11/2/2021
 */
public class Floor {
    private Row[] rows;
    private int floorId;
    private boolean full;

    public Floor(Row[] rows, int floorId) {
        this.rows = rows;
        this.floorId = floorId;
    }

    public Row[] getRows() {
        return rows;
    }

    public void setRows(Row[] rows) {
        this.rows = rows;
    }

    public int getFloorId() {
        return floorId+1;
    }

    public void setFloorId(int floorId) {
        this.floorId = floorId;
    }
}
