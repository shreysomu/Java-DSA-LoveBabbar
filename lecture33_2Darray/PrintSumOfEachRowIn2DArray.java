package dsa.com.lecture33_2Darray;

import java.util.ArrayList;
import java.util.List;

public class PrintSumOfEachRowIn2DArray {

    static List<Integer> rowSumOf2DArray(int[][] arr){
        List<Integer> res = new ArrayList<>();

        int n = arr.length;
        int m = arr[0].length;
        for (int[] x : arr) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += x[j];
            }
            res.add(sum);
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Sum of each row in 2D array is : " +rowSumOf2DArray(arr));
    }
}
