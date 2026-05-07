package dsa.com.lecture15;

import java.util.Scanner;

public class PalindromeNumber {

    static boolean isPalindrome(int num){
        int temp = num ;
        int rev = 0;

        if(num < 0)
            return false;

        while (temp != 0){
            int dig = temp%10;
            rev = rev*10+dig;
            temp/=10;
        }
        return rev == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number  :");

        int num = sc.nextInt();

        System.out.println("Entered number is palindrome or not ?: " + isPalindrome(num));
    }
}
