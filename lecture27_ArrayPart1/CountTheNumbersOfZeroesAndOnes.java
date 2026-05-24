package dsa.com.lecture27_ArrayPart1;

import java.util.Scanner;

public class CountTheNumbersOfZeroesAndOnes {

    static void countOfZeroesOnes(int[] arr){

        int countZero = 0;
        int countOnes = 0;
        for (int x : arr){
            if(x==0)
                countZero++;
            if (x==1)
                countOnes++;
        }

        System.out.println("Number of zeroes : " + countZero);
        System.out.println("Numbers of ones : " + countOnes);
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
        countOfZeroesOnes(arr);
    }
}



