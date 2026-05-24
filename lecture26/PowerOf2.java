package dsa.com.lecture26;

import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int m = sc.nextInt();

        if((m & (m-1)) == 0)
            System.out.println(m + " is a power of 2");
        else
            System.out.println(m + " is not a power of 2");

    }
}
