package interfaces.animal;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    List<Animal> animals = new ArrayList<>();
    //(List.of(new Lion(), new Duck(), new Worm()));


    public Zoo(List<Animal> animals) {
        this.animals = List.copyOf(animals);
    }

    public int getNumberOfAnimals() {
        return animals.size();
    }

    public int getNumberOfLegs() {
        int legNumber = 0;
       // for (Animal x : animals) {
       //     legNumber = legNumber + x.getNumberOfLegs();

       // }

        legNumber = animals.stream().mapToInt(o -> o.getNumberOfLegs()).sum();
        return legNumber;
    }
}