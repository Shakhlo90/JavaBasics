package Class14HWs;

public class PrimeR {
    public static void main(String[] args) {
        PrimeR pp = new PrimeR();

        System.out.println(pp.pmeth(5));
    }

    String pmeth(int num) {
        if (num % 2 != 1) return "Prime number";
        else return "non Prime";

    }
}
