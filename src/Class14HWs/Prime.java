package Class14HWs;

public class Prime {
     boolean isPrime(int num) {

        return num % 2 == 1;
    }
    public static void main(String[] args) {
        Prime p = new Prime();
        if (p.isPrime(13)) {
            System.out.println("not Prime");
        } else {
            System.out.println("Prime");
        }

    }


}
