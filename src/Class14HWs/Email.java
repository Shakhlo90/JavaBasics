package Class14HWs;

public class Email {
  String creatEmail(String name, String lastname, String emailserve){
      String c=name+lastname+emailserve;
      return c.toLowerCase();
  }

    public static void main(String[] args) {
        Email cre= new Email();
        String x=cre.creatEmail("Shakhlo","tukhtaeva","@gmail");
        System.out.println(x);
  }

}
