package inheritanceconstructor.cars;

public class Jeep extends Car{

    private double extraCapacity;
    private double extraFuel;


    public Jeep(double fuelRate, double fuel, double tankCapacity, double extraCapacity, double extraFuel) {
        super(fuelRate, fuel, tankCapacity);
        if (extraFuel>extraCapacity){
            throw new IllegalArgumentException("Tank capacity is less than fuel!");
        }
        this.extraCapacity=extraCapacity;
        this.extraFuel=extraFuel;

    }

    @Override
    public void modifyFuelAmount(double fuel) {
        extraFuel+=fuel;
        if (extraFuel>extraCapacity){
            super.modifyFuelAmount(extraFuel-extraCapacity);
            extraFuel=extraCapacity;
        } else if (extraFuel<0){
            super.modifyFuelAmount(extraFuel);
            extraFuel=0;
        }
    }

    @Override
    public void drive(int km) {
        if (this.getFuel()+extraFuel<this.getFuelRate()/100*km){
            throw new RuntimeException("Not enough fuel available!");
        }
        double needFuel=this.getFuelRate()/100*km;
        modifyFuelAmount(-needFuel);
    }

    @Override
    public double calculateRefillAmount() {
        return super.calculateRefillAmount()+extraCapacity-extraFuel;
    }

    public double getExtraCapacity() {
        return extraCapacity;
    }

    public double getExtraFuel() {
        return extraFuel;
    }
}


