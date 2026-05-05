package dsa.com.lecture14;

import java.util.Scanner;

public class TakingInputFromUserInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = sc.nextLine();

        System.out.println("Entered String is : " +str);

        System.out.println("Enter another String : ");
        String str1 = sc.next();
        System.out.println("Entered string after using next : " +str1);
    }
}
