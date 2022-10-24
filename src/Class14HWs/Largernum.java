package Class14HWs;

public class Largernum {
    void result(int num, int num2) {
        if (num > num2) {
            System.out.println(num + " is larger than " + num2);
        } else if ( num2>num) {
            System.out.println(num2 + " is larger than " + num);

        }
else {
            System.out.println("The numbers are equals");
        }
    }


    public static void main(String[] args) {
        Largernum larger = new Largernum();
        larger.result(44, 44);


    }
}

