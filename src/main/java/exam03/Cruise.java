package exam03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cruise {

    private Boat boat;
    private LocalDate sailing;
    private double basicPrice;
    private List<Passenger> passengers= new ArrayList<>();

    public Boat getBoat() {
        return boat;
    }

    public LocalDate getSailing() {
        return sailing;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public Cruise(Boat boat, LocalDate sailing, double basicPrice) {
        this.boat = boat;
        this.sailing = sailing;
        this.basicPrice = basicPrice;
    }

    public void bookPassenger(Passenger passenger){
        if(passengers.size()<boat.getMaxPassengers()){
            passengers.add(passenger);
        } else {
            throw new IllegalArgumentException("Nincs elég hely!");
        }
    }



}
