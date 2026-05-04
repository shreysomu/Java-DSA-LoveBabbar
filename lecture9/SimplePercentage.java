package dsa.com.lecture9;

import java.util.Scanner;

public class SimplePercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of first Subject : ");
        float sub1 = sc.nextFloat();

        System.out.println("Enter marks of second Subject : ");
        float sub2 = sc.nextFloat();

        System.out.println("Enter marks of third Subject : ");
        float sub3 = sc.nextFloat();

        System.out.println("Enter marks of fourth Subject : ");
        float sub4 = sc.nextFloat();

        System.out.println("Enter marks of fifth Subject : ");
        float sub5 = sc.nextFloat();

        // find minimum (the least marks)
        float min = sub1;

        if(sub2<min)
            min = sub2;
         if(sub3<min)
            min = sub3;
         if(sub4<min)
            min = sub4;
        if(sub5<min) min = sub5;

        float sum = sub1 + sub2 + sub3 + sub4 + sub5;
        System.out.println("Your lowest mark is : " +min);

        //removing the lowest mark

        sum -= min;
        System.out.println("Your total marks after removing lowest one : " + sum);
        double percentage = (sum * 100)/400.0;

        System.out.println("Your best 4 marks in percentage : " + percentage+"%");

    }
}
