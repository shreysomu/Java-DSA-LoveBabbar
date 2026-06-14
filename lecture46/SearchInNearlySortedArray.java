package dsa.com.lecture46;

public class SearchInNearlySortedArray {

    static int findElementInNearlySortedArray(int[] arr, int target) {

        int n = arr.length;

        int s = 0;
        int e = n - 1;

        while (s <= e) {

            int mid = s + (e - s) / 2;

            if (mid - 1 >= 0 && arr[mid - 1] == target) {
                return mid - 1;
            }

            if (arr[mid] == target) {
                return mid;
            }

            if (mid + 1 < n && arr[mid + 1] == target) {
                return mid + 1;
            }

            if (target > arr[mid]) {
                s = mid + 2;
            } else {
                e = mid - 2;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {10, 30, 20, 50, 40, 70, 60, 80};
        int target = 60;

        int index = findElementInNearlySortedArray(arr, target);

        if (index != -1) {
            System.out.println("Element is present at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}