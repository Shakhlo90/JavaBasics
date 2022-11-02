package Class25;

import java.util.LinkedList;

public class Repil192 {

    public static void main(String[] args) {


        LinkedList<Integer> number = new LinkedList<>();
        int num = 100;

        for (int i = 1; i <= num; i++) {
            boolean flag = false;
            if (i == 1) {
                flag = true;
            } else {
                for (int j = 2; j <= i / 2; ++j) {
                    //non prime
                    if (i % j == 0) {
                        flag = true;
                        break;
                    }
                }

            }
            if (!flag) number.add(i);




        }
        System.out.println(number);
    }

}