package dsa.com.lecture50;

import dsa.com.lecture50.InfiniteArray;

public class UnboundSearch {

    static int unboundSearch(InfiniteArray arr, int target) {

        if (arr.get(0) == target) {
            return 0;
        }

        int i = 1;

        while (arr.get(i) < target) {
            i *= 2;
        }

        int s = i / 2;
        int e = i;

        while (s <= e) {

            int mid = s + (e - s) / 2;

            if (arr.get(mid) == target) {
                return mid;
            }

            if (arr.get(mid) > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] nums = {1, 3, 5, 7, 9, 12, 15, 20, 25, 30};

        InfiniteArray arr = new InfiniteArray(nums);

        int target = 20;

        System.out.println(
                "Target found at index: "
                        + unboundSearch(arr, target)
        );
    }
}