package dsa.com.lecture10;

import java.util.Scanner;

public class CountingFrom1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N :");

        int n = sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            System.out.println(i);
        }
    }
}
