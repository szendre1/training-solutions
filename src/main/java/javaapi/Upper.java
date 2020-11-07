package javaapi;

public class Upper {
    public void UpperHi() {
        System.out.println("Hello world".toUpperCase());

    }

    public static void main(String[] args) {
        Upper upper = new Upper();
        upper.UpperHi();
    }

}

