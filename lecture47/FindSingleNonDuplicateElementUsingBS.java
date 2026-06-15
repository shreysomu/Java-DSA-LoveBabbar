package dsa.com.lecture47;

public class FindSingleNonDuplicateElementUsingBS {

    static int singleNonDuplicate(int[] nums) {

        int s = 0;
        int e = nums.length - 1;

        while (s < e) {

            int mid = s + (e - s) / 2;

            if ((mid & 1) == 1) {
                mid--;
            }

            if (nums[mid] == nums[mid + 1]) {
                s = mid + 2;
            } else {
                e = mid;
            }
        }

        return nums[s];
    }

    public static void main(String[] args) {

        int[] input = {1,1,2,2,3,3,4,4,7,8,8};

        System.out.println(
                "Single Non Duplicate Element: "
                        + singleNonDuplicate(input));
    }
}