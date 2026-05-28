package dsa.com.lecture30_ArrayPart4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumProblem {

    static List<List<Integer>> threeSum(int[] arr, int target) {

        List<List<Integer>> output = new ArrayList<>();
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length-1; j++) {
                for (int k = j+1; k < arr.length; k++) {


                    if (arr[i] + arr[j] + arr[k] == target) {
                       List<Integer> temp = new ArrayList<>();
                       temp.add(i);
                       temp.add(j);
                       temp.add(k);
                       output.add(temp);
                    }
                }
            }
        }
        return output;
    }

    public static void main(String[] args) {

        int[] arr = {2, 1, 3, 5, 4, 6};
        int target = 15;
        System.out.println("Index of Triplets are  :" + threeSum(arr,target));
    }
}
