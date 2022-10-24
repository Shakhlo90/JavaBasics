package Class14HWs;

import java.util.Scanner;

public class EvenOrOdd {
    void num(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        EvenOrOdd x = new EvenOrOdd();
        System.out.println("Please enter the number");
        for (int i = 0; i < 3; i++) {
            int num1 = sc.nextInt();
            x.num(num1);
        }

    }
}
