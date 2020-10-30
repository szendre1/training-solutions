package classstructuremethods;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();
        client.setName("John Doe");
        client.setYear(1970);
        client.setAddress("Budapest");

        System.out.println("Name: "+client.getName());
        System.out.println("Year: "+client.getYear());
        System.out.println("Address: "+client.getAddress());

        //String ujcim = client.migrate("Veszprém");
        System.out.println("Új cím: "+client.migrate("Veszprém"));
        System.out.println("Új cím: "+client.getAddress());

    }

}
