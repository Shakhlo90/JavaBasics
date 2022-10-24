package WeekendClass13;

public class HW4 {
    public static void main(String[] args) {
        String sen = "Is it saturday? Is it raining? Do we have a Java Class today?";
        String[] w = sen.split(" ");
        String out="";
        for(String c:w)
        { String rw="";
        for (int i = c.length() - 1; i >=0; i--) {
            rw=rw+c.charAt(i);}
        out=out+rw+" ";

        }
        System.out.println(out.replace("?",""));
    }
}
