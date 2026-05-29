package dsa.com.lecture32KadanesAlgorithm;

import static java.lang.Integer.MIN_VALUE;

public class MaximumSubArrayLeetCode53 {

    static int maxSubArray(int[] arr){

        int currentSum = 0;
        int maxSum = MIN_VALUE;

        for (int j : arr) {
            currentSum += j;
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("MAx sum of contiguous array is : " + maxSubArray(arr));
    }
}
