package week06d05;

public class Biscuit {

    private BiscuitType biscuitType;
    private int gramAmount;

    public static Biscuit of(BiscuitType biscuitType, int gramAmount) {
        Biscuit biscuit = new Biscuit();
        biscuit.biscuitType = biscuitType;
        biscuit.gramAmount = gramAmount;
        return biscuit;
    }

    @Override
    public String toString() {
        return "Biscuit{" +
                "biscuitType=" + biscuitType +
                ", gramAmount=" + gramAmount +
                '}';
    }
}
