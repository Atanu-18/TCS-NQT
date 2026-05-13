public class largest_element {
    public static void main(String args[]) {
        int arr[] = {1,5,8,9,6,78};

        int largest = arr[0];

        for(int i = 0; i < arr.length; i++){
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println(largest);
    }
}