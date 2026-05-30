package dsa.com.lecture33_2Darray;

import java.util.ArrayList;
import java.util.List;

public class WavePrintAMatrix {

    static List<Integer> wavePrintMatrix(int[][] matrix) {

        List<Integer> res = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;

        for (int col = 0; col < n; col++) {

            if ((col & 1) == 1) {   // Odd column

                for (int row = m - 1; row >= 0; row--) {
                    res.add(matrix[row][col]);
                }

            } else {                // Even column

                for (int[] x : matrix) {
                    res.add(x[col]);
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Wave Matrix: " + wavePrintMatrix(arr));
    }
}