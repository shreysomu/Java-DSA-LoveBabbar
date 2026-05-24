package dsa.com.lecture27_ArrayPart1;

import java.util.Scanner;

public class MultiplyEachElementsBy10 {

        static void multiplyBy10(int[] arr){

            System.out.println("All Elements After multiplying 10 : ");
            for (int x : arr) {
                System.out.print(x*10 + "  ");
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

             multiplyBy10(arr);
        }
}
