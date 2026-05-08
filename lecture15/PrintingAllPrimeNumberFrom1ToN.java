package dsa.com.lecture15;

import java.util.Scanner;

public class PrintingAllPrimeNumberFrom1ToN {

    static boolean isPrime(int num ){
        if(num<=1)
            return false;

        for (int i = 2; i*i <= num ; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    static void printAllPrimes(int num){

        for (int i = 2; i <= num ; i++) {

            boolean isPrime = isPrime(i);
            if (isPrime)
                System.out.println(i);

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number  :");

        int num = sc.nextInt();

        System.out.println("All Prime numbers from 1 to " + num +" are :");
        printAllPrimes(num);
    }
}
