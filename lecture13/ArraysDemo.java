package dsa.com.lecture13;

import java.util.Scanner;

public class ArraysDemo {
    public static void main(String[] args) {
        //declaration
        int arr[];
        //allocation
        arr = new int[10];
        int brr[] = {1,2,3,4};

        int n = brr.length;
        //accessing element
        System.out.println("Value at 0 index : " + brr[0]);

        for (int i = 0; i <n ; i++) {
            System.out.println("Value at " + i + " index : " + brr[i]);
        }

        System.out.println("Accessing value using For-Each loop : ");
        //for each value
        for (int val : brr){
            System.out.println(val);
        }

        System.out.println("Taking input from user : ");
        Scanner sc = new Scanner(System.in);


        for (int i = 0 ;i< arr.length;i++){
            System.out.println("Enter an element for index " + i);
            arr[i] = sc.nextInt();
        }

        System.out.println("Printing Array : ");
        for (int val : arr){
            System.out.println(val);
        }
    }
}
