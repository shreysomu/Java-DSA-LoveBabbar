package dsa.com.lecture10;

import java.util.Scanner;

public class PrintingSumOfAllTheNumbersFrom1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N : ");
        int n = sc.nextInt();

        int sum = 0;
        int res = 0;
        for (int i = 1; i <=n ; i++) {
           // sum +=i; // calculating sum normally
             res = (n+1)*n/2; // calculating sum using formula
        }
       // System.out.println("Sum of all numbers from 1 to "+ n + " is : " + sum);
        System.out.println("Sum of all numbers from 1 to " + n + " is : " + res);

    }
}
