package ioreadwritebytes.temperatures;

public class Temperatures {
    private byte[] data;

    public Temperatures(byte[] data) {
        this.data = data;
    }

    public byte[] getData() {
        return data;
    }

    public double getYearAverage() {
        double sumData=0;
        for (int d = 0; d < data.length; d++) {
            sumData += data[d];
        }
        return sumData/data.length;
    }

    public double getMonthAverage() {
        double sumData=0;
        for (int d = data.length-30; d < data.length; d++) {
            sumData += data[d];
        }
        return sumData/30;
    }
}
