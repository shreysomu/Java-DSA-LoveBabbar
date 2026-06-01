package dsa.com.lecture35_Sorting;

public class SelectionSorting {

    static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;

            // Find the minimum element in the unsorted portion
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap only if needed
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }

            System.out.print("After Pass " + (i + 1) + " : ");

            for (int num : arr) {
                System.out.print(num + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[] arr = {5, 6, 4, 2, 1, 8, 9, 10};

        System.out.println("Array Before Sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("\n");

        selectionSort(arr);

        System.out.println("\nFinal Sorted Array using SelectionSort :");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}