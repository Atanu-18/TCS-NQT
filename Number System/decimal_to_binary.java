

public class decimal_to_binary {
    public static void main(String args[] ){
        int n = 11;

        String binary = decimalToBinary(n);
        System.out.println(binary);
    }

    public static String decimalToBinary(int n){
        if(n ==0){
            return "0";
        }

        StringBuilder sb = new StringBuilder();

        while(n > 0){
            int rem = n % 2;
            n = n / 2;
            sb.append(rem);
        }

        return sb.reverse().toString();
    }
}
