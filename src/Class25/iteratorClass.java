package Class25;

import java.util.ArrayList;
import java.util.Iterator;

public class iteratorClass {
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
        Iterator<String> beuty= beautyProducts.iterator();
        //Iterator<String> iterator =beautyProducts.iterator();
       /* System.out.println(iterator.hasNext()); // we have one item
        System.out.println(iterator.next()); //it gives us the item and also removes the items from iterator
        System.out.println(iterator.hasNext());
        iterator.next();
        iterator.next();
        System.out.println(iterator.next());*/

        //break till 2:01
        while (beuty.hasNext()){
            System.out.println(beuty.next());
        }











        //11
        /*for (int i = 0; i < beautyProducts.size(); i++) {
            if (beautyProducts.get(i).endsWith("r")) {
                beautyProducts.remove(i);
            }
        }
       /* for (String item:beautyProducts
             ) {
            if(item.endsWith("r")){
                beautyProducts.remove(item);
            }
        }*/
       // System.out.println(beautyProducts);*/
    }
}