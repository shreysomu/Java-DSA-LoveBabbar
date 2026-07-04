package dsa.com.lecture57_RecursionPart4;

public class MaxElementUsingRecursion {

    static void findMaxi(int[] arr, int i, int max) {

        // Base case
        if (i == arr.length) {
            System.out.println("Max value : " + max);
            return;
        }

        // Processing
        if (arr[i] > max) {
            max = arr[i];
        }

        // Recursive call
        findMaxi(arr, i + 1, max);
    }

    public static void main(String[] args) {

        int[] arr = {12, 34, 21, 5, 66, 43, 26, 75, 68};

        findMaxi(arr, 0, Integer.MIN_VALUE);
    }
}