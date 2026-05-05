package dsa.com.lecture13;

import java.util.Scanner;

public class SumOfAllThe2DArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][4];
        int sum = 0;
        System.out.println("taking inputs from user :");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter element for row " +i+ " column " +j+" :");
                arr[i][j] = sc.nextInt();
            }

        }
        System.out.println("Printing 2-D Array : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j] + " ");
                sum+=arr[i][j];
            }
            System.out.println();
        }
        System.out.println("Sum of all the elements of 2-D array is : " + sum);
    }
}
