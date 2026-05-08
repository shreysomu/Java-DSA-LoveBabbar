package dsa.com.lecture15;

import java.util.Scanner;

public class ArmstrongNumber {

    static boolean isArmstrong(int num){
        int temp = num;
        int sum = 0;
        while (num != 0){
            int dig = num%10;
            sum = sum + dig*dig*dig;
            num /= 10;
        }
        return sum == temp;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number  :");

        int num = sc.nextInt();

        System.out.println("Entered number is Armstrong number or not ?: " + isArmstrong(num));
    }
}
