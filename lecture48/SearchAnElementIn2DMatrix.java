package dsa.com.lecture48;

public class SearchAnElementIn2DMatrix {

    //Each row and each column are sorted in ascending order
        static boolean searchMatrix(int[][] matrix, int target){

            int totalRows = matrix.length;
            int totalCols = matrix[0].length;

            int row = 0;
            int col = totalCols - 1;

            while (row < totalRows && col >=0){
                if (matrix[row][col] == target)
                    return true;
                else if (matrix[row][col] > target){
                    col--;
                }
                else {
                    row++;
                }
            }
            return false;
        }
        public static void main(String[] args) {

            int[][] matrix = {
                    {1,4,7,11,15},
                    {2,5,8,12,19},
                    {10,13,14,17,24},
                    {18,21,23,26,30}
            };
            int target = 13;
            System.out.println(searchMatrix(matrix,target));
        }
    }


