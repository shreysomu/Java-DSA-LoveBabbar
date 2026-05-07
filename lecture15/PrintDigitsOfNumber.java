package dsa.com.lecture15;

import java.util.Scanner;

public class PrintDigitsOfNumber {

    static void printDigitsOfNumber(int num){
        while (num!=0){
            int dig = num%10;
            System.out.println(dig);
            num/=10;

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number  :");

        int num = sc.nextInt();

        System.out.println("All digits of entered number :");
        printDigitsOfNumber(num);
    }
}
