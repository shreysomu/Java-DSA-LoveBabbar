package dsa.com.lecture36_BinarySearch;

public class BinarySearch {

    static int binarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};
        int target = 70;

        int index = binarySearch(arr, target);

        if (index != -1) {
            System.out.println(target + " is found at index : " + index);
        } else {
            System.out.println(target + " is not present in the array.");
        }
    }
}