package uz.jl.parking.entity;



import java.util.UUID;

/**
 * @author Elmurodov Javohir, Tue 10:36 AM. 11/2/2021
 */
public class Car {
    private UUID id;
    private String carNumber;
    private String place;
    private boolean is01;
    private boolean foreigner;
    private String enteringTime;
    private int ceilIndex;

    public Car() {
        this.id = UUID.randomUUID();
    }

    public Car(String carNumber, String place, String enteringTime, int rowIndex) {
        this.id = UUID.randomUUID();
        this.carNumber = carNumber;
        this.place = place;
        this.enteringTime = enteringTime;
        this.is01 = carNumber.startsWith("UZ01");
        this.foreigner = !carNumber.startsWith("UZ");
        this.ceilIndex = rowIndex;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.is01 = carNumber.startsWith("UZ01");
        this.foreigner = !carNumber.startsWith("UZ");
        this.carNumber = carNumber;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public boolean isIs01() {
        return is01;
    }

    public void setIs01(boolean is01) {
        this.is01 = is01;
    }

    public String getEnteringTime() {
        return enteringTime;
    }

    public void setEnteringTime(String enteringTime) {
        this.enteringTime = enteringTime;
    }

    public int getRowIndex() {
        return ceilIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.ceilIndex = rowIndex;
    }

    public boolean isForeigner() {
        return foreigner;
    }

    public void setForeigner(boolean foreigner) {
        this.foreigner = foreigner;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", carNumber='" + carNumber + '\'' +
                ", place='" + place + '\'' +
                ", is01=" + is01 +
                ", enteringTime='" + enteringTime + '\'' +
                ", ceilIndex=" + ceilIndex +
                '}';
    }
}
