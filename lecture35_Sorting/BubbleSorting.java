package dsa.com.lecture35_Sorting;

public class BubbleSorting {

    static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

            System.out.print("After " + (i + 1) + " iteration : ");

            for (int num : arr) {
                System.out.print(num + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[] arr = {5, 6, 4, 2, 1, 8, 9, 10};

        System.out.println("Sorted Array after using Bubble Sort:\n");

        bubbleSort(arr);

        System.out.println("\nFinal Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}