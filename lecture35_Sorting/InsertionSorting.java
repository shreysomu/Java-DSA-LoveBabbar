package dsa.com.lecture35_Sorting;

public class InsertionSorting {


    public static void main(String[] args) {

        int[] arr = {5, 6, 4, 2, 1, 8, 9, 10};

        System.out.println("Array Before Sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("\n");

        insertionSort(arr);

        System.out.println("\nFinal Sorted Array after using Insertion Sort :");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

     static void insertionSort(int[] arr) {
        int n = arr.length;
         for (int i = 1; i < n; i++) {
             int prev = i-1;
             int currValue = arr[i];

             while (prev >=0 && currValue < arr[prev]){
                 arr[prev+1] = arr[prev];
                 prev--;
             }

             arr[prev+1] = currValue;

             System.out.print("After Pass " + i  + " : ");
             for (int num : arr) {
                 System.out.print(num + " ");
             }

             System.out.println();
         }
    }
}
