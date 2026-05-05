package dsa.com.lecture14;

import java.util.Scanner;

public class CountVowelsInString {
    static int getVowelsCount(String str){
        int count = 0;
        for (int i = 0; i < str.length() ; i++) {

            char ch = str.charAt(i);
            if(ch == 'a' || ch =='e' || ch=='i' || ch=='o' || ch =='u' || ch == 'A' || ch =='E' || ch=='I' || ch=='O' || ch =='U'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the String : ");
            String str = sc.nextLine();

            System.out.println("Total count of vowels in the entered string : " +  getVowelsCount(str));

    }
}
