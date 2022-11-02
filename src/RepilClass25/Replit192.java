package RepilClass25;

import java.util.LinkedList;

public class Replit192 {
    public static void main(String[] args) {
        LinkedList<Integer>number= new LinkedList<>();
        int i;

        int num = 0;

        int maxCheck = 100; // The limit to find prime numbers is up to 100

        boolean isPrime = true;

        //Empty String

        String primeNumFound ="";

        //Start loop#2 to maxCheck

        for (i = 2; i <= maxCheck; i++) {

            isPrime = CheckPrime(i);

            if (isPrime) {

                primeNumFound = primeNumFound + i + " ";

            }

        }

        System.out.println("Prime numbers from 1 to " + maxCheck + ":");

        // It prints prime numbers from 1 to maxCheck

        System.out.println(primeNumFound);

    }

    public static boolean CheckPrime(int numToCheck) {

        int remainder;

        for (int i = 2; i <= numToCheck / 2; i++) {

            remainder = numToCheck % i;

            //if remainder gives 0 than numToCheckber is not prime number and breaks loop, else it continues the loop

            if (remainder == 0) {

                return false;

            }

        }

        return true;
    }


}