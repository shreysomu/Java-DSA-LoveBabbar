package dsa.com.lecture33_2Darray;

import java.util.Arrays;

public class TransposeOfMatrix {

    static int[][]transpose(int[][] matrix){

        if(matrix == null || matrix.length == 0){
            return new int[0][0];
        }
        //for original array
        int totalRows = matrix.length;
        int totalColumns = matrix[0].length;

        //for new array

        int[][] res = new int[totalColumns][totalRows];

        //actual logic

        for (int i = 0; i < totalRows; i++) {
            for (int j = 0; j < totalColumns; j++) {

                res[j][i] = matrix[i][j];
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

        System.out.println("Wave Matrix: " + Arrays.deepToString(transpose(arr)));
    }
}
