package RepilCunstructor;

class ShoppingStore{
    String item;
    double price;
    int quantity;


    ShoppingStore(String item, double price, int quantity) {
        this.item = item;
        this.price = price;
        this.quantity = quantity;
    }
    double itemTotalPrice(){
        double sum= price*quantity;
        return sum;
    }


   /* class Main {
        public static void main(String[]args) {

            ShoppingStore sh = new ShoppingStore("Blanket", 99.98, 1);
            System.out.println("Blanket Total Value" +sh.itemTotalPrice());
            ShoppingStore sh1 = new ShoppingStore("Blanket", 99.98, 1);


            System.out.println("Mattress Total Value" + sh1.itemTotalPrice());

            double result = sh1.itemTotalPrice() + sh1.itemTotalPrice();
            System.out.println("You purchased" + result + " Today");*/

        }

