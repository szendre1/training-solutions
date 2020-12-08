package inheritanceconstructor.cars;

public class Car {
    private double fuelRate;  // fogyasztás
    private double fuel;
    private double tankCapacity;

    public Car(double fuelRate, double fuel, double tankCapacity) {
        if (fuel>tankCapacity){
            throw new IllegalArgumentException("Tank capacity is less than fuel!");
        }
        this.fuelRate = fuelRate;
        this.fuel = fuel;
        this.tankCapacity = tankCapacity;
    }

    public void modifyFuelAmount(double fuel){
        this.fuel+=fuel;
        if (this.fuel>this.tankCapacity){
            this.fuel=this.tankCapacity;
        }
    }

    public double getFuelRate() {
        return fuelRate;
    }

    public double getFuel() {
        return fuel;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void drive(int km){ // csökkenti az üzemanyag mennyiségét, nem fogyhat ki!
        if (fuel<fuelRate/100*km){
            throw new RuntimeException("Not enough fuel available!");
        }
        double needFuel=fuelRate/100*km;
        modifyFuelAmount(-needFuel);
    }

    public double calculateRefillAmount(){ //kiszámolja, mennyit lehet tankolni
        return this.tankCapacity-this.fuel;
    }
}
