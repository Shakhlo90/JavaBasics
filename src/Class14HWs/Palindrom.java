package Class14HWs;

import java.util.Scanner;

public class Palindrom {
    void palindrom(String word) {
        StringBuilder sb = new StringBuilder(word.toLowerCase());
        sb.reverse();
        if (sb.toString().equals(word)) {
            System.out.println(word + " is  Pilindrom");
        } else {
            System.out.println(word + " is not Polindrom");
        }
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        Palindrom pstr = new Palindrom();
        for (int i = 0; i < 3; i++) {
            System.out.println("Please enter the word");
            String word = sc.next();
            pstr.palindrom(word);
        }
    }
}
