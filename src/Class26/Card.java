package Class26;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public abstract class Card {
   long account;
    String firstname;
    String lastname;
    Card(long creditaccount, String firstname, String lastname){
this.account=creditaccount;
this.firstname=firstname;
this.lastname=lastname;
    }
abstract void golden();
void selver(){
    System.out.println("5 % cashback");
}

    @Override
    public String toString() {
        return "Card{" +
                "account=" + account +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
 class Card1 extends Card{
Card1(long account, String firstname, String lastname)
{
super(account, firstname, lastname);}
    void golden(){
        System.out.println("10%");
    }

     @Override
     public String toString() {
         return "Card1{" +
                 "account=" + account +
                 ", firstname='" + firstname + '\'' +
                 ", lastname='" + lastname + '\'' +
                 '}';
     }
 }

class Card2 extends Card{
    Card2(long account, String firstname, String lastname)
    {
        super(account, firstname, lastname);}
    void golden(){
        System.out.println("6%");
    }

    @Override
    public String toString() {
        return "Card2{" +
                "account=" + account +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
class  Card3 extends Card {
    public static void main(String[] args) {

    }
    Card3(long account, String firstname, String lastname) {
        super(account, firstname, lastname);
    }

    void golden() {
        System.out.println("8%");
    }

    @Override
    public String toString() {
        return "Card3{" +
                "account=" + account +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
class  Tester{
    public static void main(String[] args) {
        LinkedList<Card> linkedList=new LinkedList<>();
        linkedList.add(new Card1(5666666666l, "Jom", "Jery"));
        linkedList.add(new Card2(5666666666l, "Jom", "Jery"));
        linkedList.add(new Card3(5666666666l, "Jom", "Jery"));

        for(Card card:linkedList){
            card.selver();
            card.golden();
        }
        System.out.println("--------------------------------------------------------");
        Iterator<Card> itter=linkedList.iterator();
        while (itter.hasNext()){

            Card item=itter.next();
            item.golden();
            item.selver();
        }
        System.out.println(linkedList);
    }
}

