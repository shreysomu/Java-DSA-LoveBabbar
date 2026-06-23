package dsa.com.lecture54_RecursionPart1;

import java.util.Scanner;

public class FibonacciNumber {

    static int fibonacci(int num){
        if(num <= 1){
            return num;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);
    }
    public static void main(String[] args) {
        System.out.println("Enter the number to find fibonacci : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("nth Fibonacci number : " + fibonacci(num));
    }
}
