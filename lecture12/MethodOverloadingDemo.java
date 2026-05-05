package dsa.com.lecture12;

import java.util.Scanner;

public class MethodOverloadingDemo {

    static void display(int num){
        System.out.println("Entered number is : " +num);
    }

    static void display(String str){
        System.out.println("Entered String is : " + str);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");

        int num = sc.nextInt();
        display(num);

        sc.nextLine();
        System.out.println("Enter a String : ");

        String str = sc.nextLine();
        display(str);
    }
}
