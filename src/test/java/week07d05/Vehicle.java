package week07d05;

public class Vehicle {

    private int numberOfGears=5;
    private TransmissionType trType = TransmissionType.MANUAL;

    public Vehicle() {
    }

    public Vehicle(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    public Vehicle(TransmissionType trType) {
        this.trType = trType;
    }

    public Vehicle(int numberOfGears, TransmissionType trType) {
        this.numberOfGears = numberOfGears;
        this.trType = trType;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    public void setTrType(TransmissionType trType) {
        this.trType = trType;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public TransmissionType getTrType() {
        return trType;
    }
}
