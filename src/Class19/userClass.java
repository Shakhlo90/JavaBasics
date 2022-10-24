package Class19;

public class userClass {
    String name;
    String mobil;

    public userClass(String name, String mobil) {
        this.name = name;
        this.mobil = mobil;
    }

}

class userInfo extends userClass {
    String address;

    userInfo(String name, String mobil, String address) {

        super(name, mobil);
        this.address = address;
    }
    void userDetails() {
        System.out.println("The name is " + name + " ; the adress is " + address + " ; the mobil is " + mobil);

    }

    public static void main(String[] args) {
        userInfo user = new userInfo("John","12345", "123 West Street" );
        user.userDetails();
    }


}
