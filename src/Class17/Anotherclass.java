package Class17;

public class Anotherclass {


    static  	String maxLength(String[]arr)
    {String longer="";
        for(int i=0; i<arr.length; i++){
            if (arr[i].length()>longer.length())
                longer=arr[i];
        }
        return longer;
    }

    public static void main(String[] args) {
        String[] arr = {"hey","yolo","hi","this is long"};
        System.out.println(maxLength(arr));
        //should print "this is long"
    }

}