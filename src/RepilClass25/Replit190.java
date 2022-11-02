package RepilClass25;

import java.util.LinkedList;

public class Replit190 {
    public static void main(String[] args) {
        LinkedList<Integer> fib=new LinkedList<>();
        fib.add(0);
        fib.add(1);
        int first=0, second=1,f;
        for(int i=2; i<10; i++){
            f=first+second;
            first=second;
            second=f;
            fib.add(f);




        }
       // System.out.print(fib.get(0)+fib.get(1)+fib.get(2)+fib.get(3)+fib.get(4));
        System.out.print(" "+fib.get(0));
        System.out.print(" "+fib.get(1));
        System.out.print(" "+fib.get(2));
        System.out.print(" "+fib.get(3));
        System.out.print(" "+fib.get(4));
        System.out.print(" "+fib.get(5));
        System.out.print(" "+fib.get(6));
        System.out.print(" "+fib.get(7));
        System.out.print(" "+fib.get(8));
        System.out.print(" "+fib.get(9));


    }



    }
