package week14d02;

// Room 3: 3. csoport: Szarka Endre, Lökösházi Anett, Laci (én) 13:07-ig

//Adott egy fájl melyben online bevásárlások találhatók.
// A fájl a még ki nem szállított rendeléseket tartalmazza.
// Egy sorban egy egyedi azonosító és utána a termékek neve van felsorololva.
// Minden vásárlás legalább 2 termékből áll.
//```
//A233 bread,tomato,flour,sugar
//A312 sugar,beer,apple,pear
//B3402 meet,soda,cola,bbq_sauce
//B341 pasta,passata,basil,cheese
//A10 corn,hot_dog,rolls
//CM231 beer,chips
//C123 pepper,salt,rosmary,pizza_dough,passata,oregano
//W34111 pasta,sugar,rosmary,cheese,meet,carrot,potato,tomato
//K8921 wine,soda
//```
//
//Olvasd be a fájlt és tárold el az adatokat a memóriában, majd oldd meg a következő feladatokat.
//1. Egyedi azonosító alapján legyenek lekérdezhetőek a vásárolt termékek ABC sorrendben.
// (Bónusz, a termékekeket fordított ABC sorrendben adjuk vissza.)
//2. Számoljuk össze, hogy egy termék neve alapján, hogy abból a termékből mennyit adtak el.
//3. Adjuk vissza egy vásárlási azonosító alapján, hogy hány termék szerepel a vásárlásban.
//4. Készíts statisztikát melyben visszaadod, hogy az egyes termékek hányszor szerepelnek a fájlban.
//
// Megj.: file elérési útvonala: src/main/resources/week14d02/kozosFeladat.txt

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class OnlineShopping {

    private Map<String, List<String>> AllShopping = new HashMap<>();


    public void readFromFile(Path path) {
        try {
            BufferedReader reader = Files.newBufferedReader(path);
            String line;
            while ((line = reader.readLine()) != null) {
                String[] lineArray = line.split(" ");
                String key = lineArray[0];
                String itemsString = lineArray[1];
                String[] itemsArray = itemsString.split(",");

                List<String> keyItems = new ArrayList<>(Arrays.asList(itemsArray));
                AllShopping.put(key, keyItems);
            }
        } catch (IOException ioException) {
            throw new IllegalArgumentException("Cannot read the file.", ioException);
        }
    }

    public List<String> getItemsInABCorder(String inputId) {
        return AllShopping.get(inputId);

    }

    //Számoljuk össze, hogy egy termék neve alapján,
    // hogy abból a termékből mennyit adtak el.

    public int getProductCountFromName(String inputProductName) {
        int productCounter = 0;
        for (List<String> listInMap : AllShopping.values()) {
            for (String productName : listInMap) {
                if (productName.equals(inputProductName)) productCounter++;
            }
        }
        return productCounter;
    }

    //Adjuk vissza egy vásárlási azonosító alapján, hogy hány termék szerepel a vásárlásban.
    public int getItemsCount(String inputId) {

        return AllShopping.get(inputId).size();
    }

    //Készíts statisztikát melyben visszaadod, hogy az egyes termékek hányszor szerepelnek a fájlban.

    public Map<String, Integer> shoppingStatistics() {

        Set<String> productNamesSet = new HashSet<>();
        Map<String, Integer> mapForFullPurchaseHistory = new HashMap<>();

        for (List<String> listInMap : this.AllShopping.values()) {
            for (String productName : listInMap) {
                productNamesSet.add(productName);
            }
        }

        for (String productName : productNamesSet) {
            mapForFullPurchaseHistory.put(productName, this.getProductCountFromName(productName));
        }
        return mapForFullPurchaseHistory;
    }


    public static void main(String[] args) {

        Path myPath = Path.of("shopped.txt");
        OnlineShopping onlineShopping = new OnlineShopping();

        onlineShopping.readFromFile(myPath);

        List<String> c123Elements = onlineShopping.getItemsInABCorder("C123");
        System.out.println("A C123 tételek" + c123Elements);
        System.out.println("A sugar száma: " + onlineShopping.getProductCountFromName("sugar"));
        System.out.println("C123 elemek száma: "+ onlineShopping.getItemsCount("C123"));
        System.out.println(onlineShopping.shoppingStatistics());


    }

}