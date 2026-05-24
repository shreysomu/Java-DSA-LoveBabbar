package dsa.com.lecture26;

import java.util.Scanner;

public class EvenOddUsingBitwiseOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to check odd or even : ");
        int n = sc.nextInt();

        if((n&1)==1)
            System.out.println(n + " is a odd number.");
        else
            System.out.println(n + " is an even number. ");
    }
}
