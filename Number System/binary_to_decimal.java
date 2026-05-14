

public class binary_to_decimal {
    public static void main(String[] args) {

        String n = "1011";

        int decimal = binaryToDecimal(n);

        System.out.println(decimal);
        
    }


    public static int binaryToDecimal(String n){
        return Integer.parseInt(n, 2);
    }
}
