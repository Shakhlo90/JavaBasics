package RepilClass25;

import java.util.ArrayList;

public class ArrayInteger {
    public static void main (String[]args){

        /*ArrayList<Integer> num = new ArrayList<>();
        num.add(111);
        num.add(222);
        num.add(333);
        num.add(444);
        num.add(555);
        num.add(666);

        System.out.println(num.get(0));
        System.out.println(num.get(2));
        System.out.println(num.get(4));*/

        ArrayList<Integer> num= new ArrayList<>(6);
        num.add(111);
        num.add(222);
        num.add(333);
        num.add(444);
        num.add(555);
        num.add(666);
        System.out.println(num);
        num.clear();
        System.out.println(num);
        ArrayList<String> str= new ArrayList<>();
        str.add("hi");
        str.add("yo");
        str.add("sup");
        str.add("yolo");
        str.add("boop");
        str.remove("hi");
        str.remove("sup");
        str.remove("boop");
        System.out.print(str.get(1)+str.get(2));

    }


}

