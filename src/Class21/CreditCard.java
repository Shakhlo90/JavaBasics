package Class21;

public class CreditCard {
    double balance;
    double interest;
    CreditCard(double balance, double interest){
       this.balance=balance;
       this.interest=interest;

    }
    void culculateInterest(){
        double inerestAmount=interest*balance/100;
        System.out.println(inerestAmount);
    }
}
class Visa extends CreditCard{
Visa(double balance, double interest){
    super(balance, interest);
}
    void culculateInterest(){
        double inerestAmount=interest*balance/100;
        System.out.println("Interest amount"+(inerestAmount+5));
    }

}
class AX extends CreditCard{
    AX(double balance, double interest){
        super(balance, interest);

    }
    void culculateInterest(){
        double inerestAmount=interest*balance/100;
        System.out.println(inerestAmount+5);
    }

}
class TestCredit{
    public static void main(String[] args) {
        CreditCard c= new CreditCard(1000, 5);
        c.culculateInterest();
        Visa v= new Visa(2000, 5);
        v.culculateInterest();
        AX ax= new AX(4000,6);
        ax.culculateInterest();
    }
}