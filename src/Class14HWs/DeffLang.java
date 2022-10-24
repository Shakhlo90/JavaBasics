package Class14HWs;

import java.util.Scanner;

public class DeffLang {
    void language( String country){

            if(country.equalsIgnoreCase("Spain")){
                System.out.println("Hola");}
                else if (country.equalsIgnoreCase("French")){
                System.out.println("Bonjour");}
            else if (country.equalsIgnoreCase("Germany")){
                System.out.println("Guten Tag");}
            else if (country.equalsIgnoreCase("Italy")){
                System.out.println("Salve");}
            else if (country.equalsIgnoreCase("Japan")){
                System.out.println("konnichiwa");}

            else
                {System.out.println("No more options");
                }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        DeffLang sayHello=new DeffLang()
;
        for (int i=0; i<4; i++)
        {System.out.println("Please enter the country name)");
       String country=sc.nextLine();
        sayHello.language(country);}


    }
}
