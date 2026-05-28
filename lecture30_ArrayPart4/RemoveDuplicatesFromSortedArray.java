package dsa.com.lecture30_ArrayPart4;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray { //return length of modify array

     static int removeDuplicatesSortedArray(int[] arr){
         int n = arr.length;
         int i = 0;
         int j = 1;

         while (j<n){
             if(arr[i] == arr[j]){
                 j++;
             }
             else {
                 i++;
                 arr[i] = arr[j];
                 j++;
             }

         }
         System.out.println("Modified array : ");
         for (int k = 0; k < i+1; k++) {
             System.out.print(arr[k] + " ");
        }
         System.out.println();
         return i+1;
     }
public static void main(String[] args) {

    int [] arr = {1,2,2,3,3,4,5,6,6,7,8};
    System.out.println("Original array : ");
    for (int j : arr) {
        System.out.print(j + " ");
    }
    System.out.println();
    System.out.println( "Length of the original array is : " + arr.length);
    System.out.println();
    int res = removeDuplicatesSortedArray(arr);
    System.out.println( "Length of the modified array is : " + res);

     }
}
