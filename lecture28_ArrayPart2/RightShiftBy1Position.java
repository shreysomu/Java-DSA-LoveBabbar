package dsa.com.lecture28_ArrayPart2;

import java.util.Scanner;

public class RightShiftBy1Position {

    static void rightShiftBy1Position(int[] arr) {
        int n = arr.length;

        int temp = arr[n-1];
        for (int i = n-1 ; i>0 ;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        System.out.println("array after right shift by 1 position : ");
        for (int x : arr){
            System.out.print(x + " ");
        }
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
        rightShiftBy1Position(arr);
    }
}
