package methodstructure.bmi;

public class BodyMass {

private double Weight;
private double Height;

    public BodyMass(double weight, double height) {
        Weight = weight;
        Height = height;

    }

    public double getWeight() {
        return Weight;
    }

    public double getHeight() {
        return Height;
    }

    public double bodyMassIndex(){
        return Weight/(Height*Height);
    }

    public BmiCategory body(){
        if (bodyMassIndex()<18.5){
            return  BmiCategory.UNDERWEIGHT;
        } else
        if (bodyMassIndex()<=25){
            return BmiCategory.NORMAL;
        } else {
            return BmiCategory.OVERWEIGHT;
        }
    }

    public boolean isThinnerThan(BodyMass bodyMass){
        return (bodyMassIndex()<bodyMass.bodyMassIndex());
    }
}
