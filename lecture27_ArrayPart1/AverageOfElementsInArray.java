package dsa.com.lecture27_ArrayPart1;

import java.util.Scanner;

public class AverageOfElementsInArray {


    static double getAverage(int[] arr){
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }

        System.out.println("Total sum is : " + sum);

        int size = arr.length;
        return (double) sum /size;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : " );
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter element : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Average of Elements : " +  getAverage(arr));
    }
}
