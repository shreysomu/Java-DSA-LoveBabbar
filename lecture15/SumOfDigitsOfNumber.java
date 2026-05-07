package dsa.com.lecture15;

import java.util.Scanner;

public class SumOfDigitsOfNumber {

    static int sumOfDigitsOfNumber(int num) {
        int sum = 0;
        while (num != 0){

            int dig = num%10;
            sum+=dig;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number  :");

        int num = sc.nextInt();

        System.out.println("Sum of all digits of entered number : " +sumOfDigitsOfNumber(num));
    }
}
