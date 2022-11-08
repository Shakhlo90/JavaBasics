package Class26;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class HW5 {
    public static void main(String[] args) {
        LinkedHashSet<String> city= new LinkedHashSet<>();
        city.add("Paris");
        city.add("Abu Dhabi");
        city.add("Asmara");
        city.add("Anqara");
        city.add("Tokyo");
        city.add("Istanbul");
        city.add("Beijing");

        Iterator<String> cities= city.iterator();
        while (cities.hasNext()){
            String item= cities.next();
            if(item.startsWith("A")){
                cities.remove();
            }

        }
        System.out.println(city);
    }
}
