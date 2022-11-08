package Review11;

import java.util.ArrayList;
import java.util.ListIterator;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> animal=new ArrayList<>();
         animal.add("lion");
         animal.add("tiger");
         animal.add("dog");
         animal.add("cat");
         animal.add("camel");
         animal.add("horse");
        for (String s : animal) {
            System.out.println(s);
        }
animal.removeIf(item->item.length()<2);
        System.out.println(animal);


        for (int i = 0; i < animal.size(); i++) {
            if(animal.get(i).length()>4)
                animal.set(i, "Camel");
        }
        System.out.println(animal);
        ListIterator<String>listIterator=animal.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        }

        }



