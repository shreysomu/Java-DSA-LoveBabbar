package dsa.com.lecture12;

import java.util.Scanner;

public class CalculatePercentageDemo {
    static double calculatePercentage(int obtained , int total){
        double res = (double) (obtained * 100) /total;
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter obtained marks : ");
        int obtainedMarks = sc.nextInt();

        System.out.println("Enter Total Marks: ");
        int totalMarks = sc.nextInt();

        System.out.println("Your total percentage is : " +calculatePercentage(obtainedMarks,totalMarks)+"%");
    }
}
