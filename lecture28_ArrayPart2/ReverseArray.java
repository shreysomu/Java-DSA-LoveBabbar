package dsa.com.lecture28_ArrayPart2;

import java.util.Scanner;

public class ReverseArray {


    static void reverseArray(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;

        while (i <= j) {

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        System.out.println("Array after reverse : ");
        for (int k = 0; k < n; k++) {
            System.out.print( arr[k] + " ");
        }
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
        reverseArray(arr);
    }
}
