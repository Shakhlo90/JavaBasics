package Class28;

import java.util.TreeMap;

public class HW4 {
    public static void main(String[] args) {
        TreeMap<String, Person> list = new TreeMap<>();
        list.put("ID6789543", new Person("Jerry", "Robert", 22, 120000));
        list.put("ID6789765", new Person("Milana", "Jey", 26, 130000));
        list.put("ID67980743", new Person("Jonatan", "Ray", 28, 150000));
        list.put("ID89654943", new Person("Allan", "Smith", 25, 140000));
        list.put("ID6789543", new Person("Tom", "Johnson", 32, 200000));
        list.put("ID6789543", new Person("Mendeley", "George", 42, 300000));

        var enteries = list.entrySet().iterator();

        while (enteries.hasNext()) {
            System.out.println(enteries.next());
        }

    }

}

