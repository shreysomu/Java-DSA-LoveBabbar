package dsa.com.lecture48;

public class SearchIn2DMatrix {

    //first integer of each row is greater than the last integer of previous row
    static boolean searchMatrix(int[][] matrix, int target){
        int totalRow = matrix.length;;
        int totalCol = matrix[0].length;

        int n = totalCol*totalRow;
        int s = 0;
        int e = n-1;

        while (s <= e){
            int mid = s + (e-s)/2;
            int rowIndex = mid / totalCol;
            int colIndex = mid%totalCol;

            if (matrix[rowIndex][colIndex] == target){
                return true;
            } else if (matrix[rowIndex][colIndex] > target) {
                e = mid - 1;
            }
            else {
                s = mid + 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        int[][] matrix = {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };
        int target = 4;
        System.out.println(searchMatrix(matrix,target));
    }
}
