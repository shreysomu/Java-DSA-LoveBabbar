package dsa.com.lecture27_ArrayPart1;

import java.util.Scanner;

public class SumOfPositiveAndNegativeNumbers {

    static void sumOfPosNegNumbers(int [] arr){

        int posSum = 0;
        int negSum = 0;
        for (int x : arr){
            if(x<0){
                negSum += x;
            }
            else {
                posSum += x;
            }
        }

        System.out.println("Sum of Positive numbers is : " +posSum);
        System.out.println("Sum of Negative numbers is : " +negSum);


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : " );
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Printing Array : ");
        for(int x: arr){
            System.out.print(x + " ");
        }

        System.out.println();
        sumOfPosNegNumbers(arr);

    }
}
