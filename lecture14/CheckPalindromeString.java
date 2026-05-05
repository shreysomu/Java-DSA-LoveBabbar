package dsa.com.lecture14;

import java.util.Scanner;

import static dsa.com.lecture14.ReverseString.reverseString;

public class CheckPalindromeString {
    static boolean isPalindrome(String str){
        String original = str;
        String reverse = reverseString(original);

        for (int i = 0; i < original.length(); i++) {
            char ch = original.charAt(i);
            char ch1 = reverse.charAt(i);

            if (ch != ch1){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();

        System.out.println("Is entered String is palindrome ? : " +  isPalindrome(str));

    }
}
