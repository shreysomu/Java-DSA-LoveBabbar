package dsa.com.lecture12;

import java.util.Scanner;

public class IsEvenDemo {
    static boolean isEven(int num){
        if(num%2==0)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check if number is even or not :");
        int num = sc.nextInt();
        System.out.println("Entered number is Even ? : " + isEven(num) );
    }
}
