package dsa.com.lecture34;

public class RotateImage {

    static void rotate90Clockwise(int[][] matrix) {
        int n = matrix.length;

        // Step 1: Transpose
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for (int row = 0; row < n; row++) {
            int startCol = 0;
            int endCol = n - 1;

            while (startCol < endCol) {
                int temp = matrix[row][startCol];
                matrix[row][startCol] = matrix[row][endCol];
                matrix[row][endCol] = temp;

                startCol++;
                endCol--;
            }
        }

        // Print matrix
        for (int[] x : matrix) {
            for (int j = 0; j < n; j++) {
                System.out.print(x[j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Rotated Matrix by 90° Clockwise:");
        rotate90Clockwise(arr);
    }
}