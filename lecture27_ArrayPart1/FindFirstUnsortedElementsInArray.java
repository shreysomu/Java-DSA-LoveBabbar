package dsa.com.lecture27_ArrayPart1;

import java.util.Scanner;

public class FindFirstUnsortedElementsInArray {

    static int firstUnsortedElement(int[] arr){

        int res = 0;
        for (int i = 0;i< arr.length-1;i++){
            if (arr[i] > arr[i+1]) {
                return arr[i + 1];
            }
        }
        return -1;
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
        int res =   firstUnsortedElement(arr);
        if (res == -1)
            System.out.println("Array is sorted");
        else
            System.out.println("First Unsorted Element is : " + res);
    }
}
