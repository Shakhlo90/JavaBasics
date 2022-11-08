package Replit;

import java.util.*;

public class Replit196 {
    public static void main(String[]args){
        LinkedHashSet<String> num=new LinkedHashSet<>();
        num.add("third");
        num.add("first");
        num.add("second");

        ArrayList<String> i= new ArrayList<>(num);

        System.out.println(i);
        i.clear();
        System.out.println(i);
        HashSet<String> color=new HashSet<>();
        color.add("Red");
        color.add("Pink");
        color.add("Yellow");
        color.add("White");
        color.add("Black");
        System.out.println(color);
        System.out.println(color.size());

        TreeSet<String> country=new TreeSet<>();
        country.add("India");
        country.add("Australia");
        country.add("South Africa");
        country.add("America");
        country.add("America");
        System.out.println(country);


    }
}
