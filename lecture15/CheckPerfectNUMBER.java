package dsa.com.lecture15;

import java.util.Scanner;

public class CheckPerfectNUMBER {

    
    static boolean checkPerfectNumber(int num){

        if(num <= 1)
            return false;
        int sum = 1;

        for (int i = 2; i*i<= num; i++) {
            if(num%i == 0){
                int factor1 = i;
                int factor2 = num/i;
                sum=sum+factor1+factor2;
            }
        }

        return  (sum == num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number  :");

        int num = sc.nextInt();

        System.out.println("Entered number is Perfect number or not ?: " + checkPerfectNumber(num));
    }
}
