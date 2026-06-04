package dsa.com.lecture38;

public class PeakIndexOfMountainArray {

    static int peakIndexInMountainArray(int[] arr) {

        int s = 0;
        int e = arr.length - 1;

        while (s < e) {

            int mid = s + (e - s) / 2;

            if (arr[mid] < arr[mid + 1]) {
                // We are in ascending part
                s = mid + 1;
            } else {
                // We are in descending part or at peak
                e = mid;
            }
        }

        return s; // or return e
    }

    public static void main(String[] args) {

        int[] arr = {0, 2, 5, 3, 1};

        int ans = peakIndexInMountainArray(arr);

        System.out.println("Peak element is " + arr[ans]
                + " present at index " + ans);
    }
}