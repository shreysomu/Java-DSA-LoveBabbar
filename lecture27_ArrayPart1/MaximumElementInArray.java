package dsa.com.lecture27_ArrayPart1;

import java.util.Scanner;

public class MaximumElementInArray {


    static int maxElement(int[] arr){
        int size = arr.length;
        int max = arr[0];
        for (int x : arr){
            if(x>max)
                max = x;
        }
        return max;
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
        System.out.println("Maximum element is : " + maxElement(arr));
    }
}
