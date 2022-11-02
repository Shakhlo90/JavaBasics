package RepilClass25;

import java.util.ArrayList;
import java.util.Iterator;

public class HW {
    public static void main(String[] args) {
        ArrayList<String> beautyProducts = new ArrayList<>();
        beautyProducts.add("Blushe");
        beautyProducts.add("Base");
        beautyProducts.add("Mascara");
        beautyProducts.add("lipsticke");
        beautyProducts.add("Dove Soap");
        beautyProducts.add("Conditionere");
        beautyProducts.add("Primere");
        beautyProducts.add("shampoo");
        beautyProducts.add("lotione");
        beautyProducts.add("concealer");
        beautyProducts.add("eyeLinear");

        Iterator<String>str=beautyProducts.iterator();
        while (str.hasNext()){
            if(str.next().endsWith("e")){
                str.remove();
            }

        }
        System.out.println(beautyProducts);

beautyProducts.removeIf(item->item.endsWith("e"));
        System.out.println(beautyProducts);



        }    }
