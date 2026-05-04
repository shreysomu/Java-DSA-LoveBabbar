package dsa.com.lecture9;

import java.util.Scanner;

public class StudentPercentage {
    public static void main(String[] args) {
        System.out.println("Enter your all five subjects marks under 100 : ");
        Scanner sc = new Scanner(System.in);

        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float d = sc.nextFloat();
        float e = sc.nextFloat();

        float sum = a+b+c+d+e;
        System.out.println("Sum of Your overall marks is : " + sum);

        float percentage = (sum/500)*100;
        System.out.println("Your marks in percentage : " +percentage +"%");
    }
}
