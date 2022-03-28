package uz.jl.parking.entity;

/**
 * @author Elmurodov Javohir, Tue 10:36 AM. 11/2/2021
 */
public class Row {
    private Ceil[] ceilList;
    private String rowId;
    private boolean full;

    public Row(Ceil[] ceilList, String rowId) {
        this.ceilList = ceilList;
        this.rowId = rowId;
    }

    public Ceil[] getCeilList() {
        return ceilList;
    }

    public void setCeilList(Ceil[] ceilList) {
        this.ceilList = ceilList;
    }

    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
        this.rowId = rowId;
    }
}
