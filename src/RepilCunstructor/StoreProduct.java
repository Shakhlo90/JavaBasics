package RepilCunstructor;

public class StoreProduct {
    String label;

    double price;

    String category;

    boolean hasExpiration;


    int stock;

    StoreProduct(String label,double price, String category, boolean hasExpiration,
                 int stock )
    {   this. label=label;
        this. price=price;
        this. category=category;
        this. hasExpiration=hasExpiration;
        this. stock=stock;
    }




    StoreProduct(String label,double price,int stock){
        this. label=label;
        this. price=price;
        category="misc";
        hasExpiration=false;
        this.stock=stock;
    }

    StoreProduct(String label,double price,String category){
        this.label=label;
        this. price=price;
         this.category=category;
        hasExpiration=false;
        stock=0;
    }
    void  display (){
        System.out.println(label+" "+ price+" "  + category+" " +  hasExpiration+" "+ stock);
    }


public static void main(String[]args){

StoreProduct a= new StoreProduct("Eggs",3.0,"Produce",true,10);
a.display();
StoreProduct b= new StoreProduct("Paper Towels",2.0, 24);
b.display();
StoreProduct c= new StoreProduct("Paper Towels",2.0,null );
c.display();







}






}
