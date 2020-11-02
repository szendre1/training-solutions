package localvariables;

public class DistanceMain {
    public static void main(String[] args) {
        Distance distance = new Distance(15.555, true);
        int km = (int) distance.getDistancelnKm();
        System.out.println("A távolság: "+distance.getDistancelnKm()+"Km Pontos:"+distance.isExact());
        System.out.println("A távolság: "+km+"Km");
    }
}
