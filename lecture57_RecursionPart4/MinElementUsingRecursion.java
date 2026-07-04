package dsa.com.lecture57_RecursionPart4;

public class MinElementUsingRecursion {

    static void findMini(int[] arr, int i, int min) {

        // Base case
        if (i == arr.length) {
            System.out.println("Min value : " + min);
            return;
        }

        // Processing
        if (arr[i] < min) {
            min = arr[i];
        }

        // Recursive call
        findMini(arr, i + 1, min);
    }

    public static void main(String[] args) {

        int[] arr = {12, 34, 21, 5, 66, 43, 26, 75, 68};

        findMini(arr, 0, Integer.MAX_VALUE);
    }
}
