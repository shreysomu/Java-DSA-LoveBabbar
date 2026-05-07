package dsa.com.lecture15;

import java.util.Scanner;

public class ReverseAnumber {

    static int reverseNumber(int num){
        int rev = 0;
        while (num != 0){
            int dig = num%10;
            rev = rev*10 + dig;
            num /= 10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number  :");

        int num = sc.nextInt();

        System.out.println("Reverse of entered number : " +reverseNumber(num));
    }
}
