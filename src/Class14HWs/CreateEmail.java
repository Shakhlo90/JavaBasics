package Class14HWs;

import java.util.Scanner;

public class CreateEmail {
    void createEmail(String name, String lastname, String mailserv) {
        System.out.println(name + lastname + "@" + mailserv);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CreateEmail cr = new CreateEmail();
        System.out.println("Please enter your name");
        String name = sc.nextLine();
        System.out.println("Please enter your lastname");
        String lastname = sc.nextLine();
        System.out.println("Please enter your mailservice");
        String mailserv = sc.nextLine();
        cr.createEmail(name, lastname, mailserv);
        cr.createEmail("shakhlo", "tukhtaeva", "gmail");
    }


}
