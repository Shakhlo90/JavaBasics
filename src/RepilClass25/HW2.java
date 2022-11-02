package RepilClass25;

import java.util.ArrayList;
import java.util.Iterator;

public class HW2 {
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Milk");
        drinks.add("Martini");
        drinks.add("Manhattan");
        drinks.add("Mojito");
        drinks.add("tea");
        drinks.add("Margarita");
        Iterator<String> drink = drinks.iterator();
        int i=0;
        while (drink.hasNext()) {

            String item = drink.next();
            if (item.contains("a") || item.contains("e")) {

                drinks.set(drinks.indexOf(item), "water");

            }

        }
        System.out.println(drinks);
    }
}
