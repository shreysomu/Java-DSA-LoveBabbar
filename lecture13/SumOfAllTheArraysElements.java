package dsa.com.lecture13;

import java.util.Scanner;

public class SumOfAllTheArraysElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();

        int arr[]  = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element for index "+i +":");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }



        System.out.println("Sum of all "+n+ " elements is : " + sum);
    }
}
