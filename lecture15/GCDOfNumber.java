package dsa.com.lecture15;

import java.util.Scanner;

public class GCDOfNumber {

    static int gcdOfNumber(int a, int b){

        while (b != 0){
            int temp = b;
            b = a%b;
             a = temp;
        }
        return a;
    }

    static int getLCM(int a,int b){
        int gcd = gcdOfNumber(a,b);
        return (a*b)/gcd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers  :");

        int num1= sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("GCD of entered 2 numbers is : " + gcdOfNumber(num1,num2));
        System.out.println("LCM of entered 2 numbers is : " + getLCM(num1,num2));

    }
}
