package dsa.com.lecture28_ArrayPart2;

import java.util.Scanner;

public class ExtremeElementsInAlternateManner {

    static void extremeElementsAlternate(int[] arr){
        int n = arr.length;
        int i = 0;
        int j = n-1;
        while (i<=j){

            if (i == j){
                System.out.println(arr[i]);
                return;
            }
            else {
                System.out.print(arr[i] + " ");
                i++;
                System.out.print(arr[j] + " ");
                j--;
            }
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
        extremeElementsAlternate(arr);
    }
}
