package Class25;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo2 {
    public static void main(String[] args) {
        ArrayList<String> beautyProducts = new ArrayList<>();
        beautyProducts.add("Blush");
        beautyProducts.add("Base");
        beautyProducts.add("Mascara");
        beautyProducts.add("lipstick");
        beautyProducts.add("Dove Soap");
        beautyProducts.add("Conditioner");
        beautyProducts.add("Primer");
        beautyProducts.add("shampoo");
        beautyProducts.add("lotion");
        beautyProducts.add("concealer");
        beautyProducts.add("eyeLinear");
        Iterator<String> demo=beautyProducts.iterator();
        while (demo.hasNext()){
            var item= demo.next();
            if (item.startsWith("B")|| item.endsWith("a")){
            demo.remove();

            }

        }
        System.out.println(beautyProducts);

beautyProducts.removeIf(makeup->makeup.startsWith("B"));




    }
}
