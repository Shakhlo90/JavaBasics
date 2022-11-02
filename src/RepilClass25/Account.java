package RepilClass25;

public class Account {
    private String acc_no="7560504000";
    private String name= "Sumair";
    private String email="sumair@syntax.com ";
    private double amount =50000.0;

    String getAcc_no(){
        return acc_no;
    }
    void setAcc_no(String acc_no){
        this.acc_no=acc_no;
    }

    String getName(){
        return name;
    }
    void setName(String name){
        this.name=name;
    }
    String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email=email;
    }
   public  double getAmount(){
        return amount;
    }
    public void setAmount(double amount){
        this.amount=amount;

    }
}
class Tester{
    public static void main(String[] args) {
        Account account= new Account();
        System.out.println(account.getAcc_no()+ " " +account.getName());
    }
}
