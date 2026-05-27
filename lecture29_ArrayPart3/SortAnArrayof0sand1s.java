package dsa.com.lecture29_ArrayPart3;

import java.util.Arrays;

public class SortAnArrayof0sand1s {


    static int[] sortArrayOf0sAnd1s(int [] nums){

        int n = nums.length;
        int i = 0;
        int j = n-1;

        while (i<j){
            if(nums[i] == 1 && nums[j] == 0){
                //swap
                nums[i] = 0;
                nums[j] = 1;
                i++;
                j--;
            }
            if(nums[i] == 0)
                i++;
            if (nums[j] == 1)
                j--;
        }
        return nums;
    }
    public static void main(String[] args) {

        int[] arr = {0,1,0,1,1,1,0,0,0,1,1,0,0,1};
       int[] res =   sortArrayOf0sAnd1s(arr);
        System.out.println("Array after sorting in 0s and 1's : " + Arrays.toString(res));
    }
}
