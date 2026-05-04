package dsa.com.lecture10;

import java.util.Scanner;

public class PrintingAllThePrimeNumbersFrom1ToN {

    static boolean isPrime(int num){
        if(num<=1)
            return false;
        for (int i = 2; i*i <=num ; i++) {
            if (num%i == 0)
                return false;

        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of N : ");

        int n = sc.nextInt();

        System.out.println("All The prime numbers between 1 to " + n + ": ");
        for (int i = 2; i <= n ; i++) {
            if(isPrime(i))
                System.out.println(i);
        }
    }
}
