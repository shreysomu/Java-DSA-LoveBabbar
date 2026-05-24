package dsa.com.lecture26;

import java.util.Scanner;

public class Swap2NumbersUsingXor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int n1 = sc.nextInt();

        System.out.println("Enter second number : ");
        int n2 = sc.nextInt();

        n1 = n1^n2;
        n2 = n1^n2;
        n1 = n1^n2;

        System.out.println("Number after swapping first number is : " + n1 +" and second number is : " + n2);
    }
}
