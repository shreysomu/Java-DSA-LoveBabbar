package dsa.com.lecture14;

import java.util.Scanner;

public class ReverseString {
    static String reverseString(String str){
        String reverse = "";
        int n = str.length();

        for (int i = n-1; i >=0  ; i--) {

            char ch = str.charAt(i);
            reverse += ch;
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();

        System.out.println("Reversed string : " +  reverseString(str));

    }
}
