package dsa.com.lecture14;


import java.util.Scanner;

public class PrintingEachCharacterOfTheString {
    static void printString(String str){
        int n = str.length();
        for (int i = 0;i<n;i++){
            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();

        System.out.println("All the characters of the entered string : ");
        printString(str);
    }
}
