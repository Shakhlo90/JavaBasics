package Class28;

import java.util.Collection;
import java.util.LinkedList;

public class HW6 {
    public static void main(String[] args) {
        Collection<String> country = new LinkedList<>();
        country.add("Japan");
        country.add("Germany");
        country.add("Italy");
        country.add("France");
        country.add("China");
        country.add("Mexico;");

        var iterator = country.iterator();
        String str = "";
        while (iterator.hasNext()) {
            var item = iterator.next();
            str += item + "," + " ";
        }
        System.out.println("All countries from the collection are :" + str);
    }
}
