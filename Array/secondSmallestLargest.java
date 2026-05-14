import java.util.Scanner;

public class secondSmallestLargest {
    public static void main(String[] args){
        // int arr[] = {2, 5, 1, 3, 0};

        //user input
        Scanner sc = new Scanner(System.in);

        System.out.println("ENter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }



        int second_smallest = secondSmallest(arr);
        int second_largest = secondLargest(arr);

        System.out.println(second_smallest);
        System.out.println(second_largest);

        sc.close();
    }

    public static int secondSmallest(int[] arr){
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            } else if(arr[i] > smallest && arr[i] < secondSmallest){
                secondSmallest = arr[i];
            }
        }

        return secondSmallest;
    }


    public static int secondLargest(int arr[]){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            } else if(arr[i] < largest && arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }
}