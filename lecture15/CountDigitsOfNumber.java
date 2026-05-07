package dsa.com.lecture15;

import java.util.Scanner;

public class CountDigitsOfNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number  :");

        int num = sc.nextInt();

        System.out.println("Total digits of entered number : " + countDigitsOfNumber(num));
    }

     static int countDigitsOfNumber(int num) {

        int count = 0;
        while (num != 0){
            int dig = num%10;
            count++;
            num/=10;
        }
        return count;
    }
}
