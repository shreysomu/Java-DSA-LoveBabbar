package dsa.com.lecture12;

import java.util.Scanner;

public class UpdateValueDemo {
    static int updateValue(int num){
        return num =+10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        updateValue(num);
        System.out.println(num); // it'll not change value of num
    }
}
