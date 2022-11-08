package Class27;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Map {
    private static Set<java.util.Map.Entry<String, Integer>> var;

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("mango", 10);

        map.put("apple", 30);

        map.put("orange", 20);

        map.put("mango", 40);

        map.put("mango", 40);
        Collection<HashMap.Entry<String, Integer>>p=map.entrySet();

        Collection<Integer> keys = map.values();
        Iterator<Integer> itter = keys.iterator();
        while (itter.hasNext()) {
            Integer item = itter.next();
            {
                if (item > 20)
                    itter.remove();
            }

        }
        System.out.println(keys);

        Collection<String> key = map.keySet();
        System.out.println(key);
        Iterator<String> itters = key.iterator();
        while (itters.hasNext()) {
            String items = itters.next();
            {
                if (items.equals("mango"))
                    itter.remove();
            }


        }
        System.out.println(key);
    }

}


