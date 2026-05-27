package dsa.com.lecture30_ArrayPart4;

import java.util.Arrays;

public class TwoSumProblem {

    static int [] twoSum(int[] arr, int target){

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {

        int [] arr = {2,1,3,5,4,6};
        int target = 7;
        System.out.println("Index of both are  :" + Arrays.toString(twoSum(arr, target)));
    }
}
