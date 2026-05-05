package dsa.com.lecture12;

import java.util.Scanner;

public class MethodsDemo {

    static void printTable(int n){
        for (int i = 1; i <=10 ; i++) {
            int res = n*i;
            System.out.println("->" + res);
        }
    }

    static int sum(int a,int b){
        return a+b;
    }

    static int sum(int a , int b,int c){
        return a+b+c;
    }

    static float sum (int a ,float b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n to print the table :");
        int n = sc.nextInt();

        printTable(n);

        System.out.println("Sum of 2 integer numbers : " + sum(10,5));
        System.out.println("Sum of 3 integer numbers : " +  sum(10,30,40));
        System.out.println("Sum of 1 integer and 1 float numbers : " +  sum(20,40.89f));
    }
}
