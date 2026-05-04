package dsa.com.lecture10;

import java.util.Scanner;

public class PrintingAllEvenNumbersFrom1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n = sc.nextInt();

        System.out.println("Printing all even numbers to N :");
        for (int i = 2; i <=n; i+=2) {
            System.out.println(i);
        }
    }
}
