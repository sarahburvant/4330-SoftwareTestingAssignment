package softwareTesingProject;
//import java.util.*;

public class Sort {

    public int[] selectionSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
          
            // Assume the current position holds
            // the minimum element
            int min_idx = i;

            // Iterate through the unsorted portion
            // to find the actual minimum
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                  
                    // Update min_idx if a smaller element
                    // is found
                    min_idx = j;
                }
            }

            // Move minimum element to its
            // correct position
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp; 
            
            
        }
        return arr;
    }

    public static void printArray(int[] arr){
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
  
    public static void main(String[] args){
        int[] arr = { 64, 25, 12, 22, 11 };

        System.out.print("Original array: ");
        printArray(arr);

        Sort sort1 = new Sort();

        int[] arr1 = sort1.selectionSort(arr);

      /*   String str1 = new String();
        str1 = "hello";
        String str2 = new String();
        str2 = sort1.selectionSort(str1); */

        System.out.print("Sorted array: ");
        printArray(arr1);
    }
}
