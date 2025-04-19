package DSA.Recursion;

import java.util.Arrays;

public class reverse_space_optimized_method {
    
    public static void main(String[] args) {
     
        int n=5;
        int arr[] = { 5, 4, 3, 2, 1};
        reverseArray(arr,5);
        System.out.println("Reversed array is: " + Arrays.toString(arr));
    }

    public static void reverseArray(int arr[],int n){

        int j = n-1;
        int temp = 0;

        for(int i=0; i<n/2; i++){

            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }
    }
}
