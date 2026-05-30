package dsa.com.lecture33_2Darray;

import java.util.ArrayList;
import java.util.List;

public class PrintSumOfEachColumnIn2DArray {

        static List<Integer> columnSumOf2DArray(int[][] arr){
            List<Integer> res = new ArrayList<>();

            int n = arr.length;
            int m = arr[0].length;
            for (int j = 0;j<m;j++) {
                int sum = 0;
                for (int[] x : arr) {
                    sum += x[j];
                }
                res.add(sum);
            }
            return res;
        }

        public static void main(String[] args) {
            int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
            System.out.println("Sum of each column in 2D array is : " +columnSumOf2DArray(arr));
        }
}
