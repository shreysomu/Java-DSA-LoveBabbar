package dsa.com.lecture12;

import java.util.Scanner;

public class Checkmaximum {
    static int getMaximum(int a,int b){
        if(a>b)
            return a;
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number1 :");
        int n1 = sc.nextInt();

        System.out.println("enter number2 :");
        int n2 = sc.nextInt();

        System.out.println("Maximum of both number is : " +getMaximum(n1,n2));

    }
}
