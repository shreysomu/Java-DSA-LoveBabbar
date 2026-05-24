package dsa.com.lecture27_ArrayPart1;

import java.util.Scanner;

public class SearchElementLinearSearch {
    static void searchElement(int[] arr, int target){

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(arr[i] == target) {
                System.out.println("Element is present at index : " + i);
                return;
            }
        }
        System.out.println("Element is not present in array.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : " );
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Printing Array : ");
        for(int x: arr){
            System.out.print(x + " ");
        }

        System.out.println();
        System.out.println("Enter element to search : ");
        int target = sc.nextInt();
        searchElement(arr,target);
    }
}
