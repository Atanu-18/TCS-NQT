import java.util.Scanner;

public class smallest_element {
    public static void main(String args[]) {
        int[] arr1 = {2, 5, 1, 3, 0};

        int result = smallestElement(arr1);

        System.out.println("Smallest element is: " + result);

    
    }
    public static int smallestElement(int[] arr) {
        int smallest = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }

        return smallest;

    
    }
    
}