public class reverse_array {
    public static void main(String args[]) {
        int arr[] = {1,2,3,4,5};

        int p = 0;
        int q = arr.length - 1;

        while(p < q){
            int temp = arr[p];
            arr[p] = arr[q];
            arr[q] = temp;
            p++;
            q--;
        }

        System.out.println("reversed array is : ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
