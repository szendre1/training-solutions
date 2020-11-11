package introcontrol;

public class IntroControlMain {
    public static void main(String[] args) {
        IntroControl introControl = new IntroControl();
        System.out.println(introControl.substractTenIfGreaterThanTen(27));
        System.out.println(introControl.describeNumber(1));
        System.out.println(introControl.greetingToJoe("Joe"));
        System.out.println(introControl.calculateBonus(10000000));
        System.out.println(introControl.calculateConsumption(3000,2000));
        introControl.printNumbers(10);
        System.out.println();
        introControl.printNumbersBetween(20,15);
        System.out.println();
        introControl.printNumbersBetweenAnyDirection(45,40);
        System.out.println();
        introControl.printOddNumbers(11);

    }
}
