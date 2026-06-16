package dsa.com.lecture49;

public class RowWithMaximum1sIn2DMatrix {

    static int getFirstOccIndex(int[][] arr, int rowIndex){
        int totalRow = arr.length;
        int totalCol = arr[0].length;
        int target = 1;
        int ans = -1;

        if(arr[rowIndex][totalCol-1] == 0){
            return totalCol;
        }
        else {
            int s = 0;
            int e = totalCol - 1;
            while (s <= e){
                int mid = s + (e-s) /2;
                if (arr[rowIndex][mid] == 0){
                    s = mid + 1;
                }
                else {
                    ans = mid;
                    e = mid - 1;
                }
            }
        }
        return ans;
    }
    static int rowWithMaxOnes(int[][] matrix){

        int totalRow = matrix.length;
        int totalCol = matrix[0].length;
        int maxi = -1;
        int rowIndexOfMaxOnes = -1;


        for (int row = 0; row < totalRow; row++) {
            int firstOccIndex = getFirstOccIndex(matrix,row);
            int oneCount = totalCol - firstOccIndex;

            if (oneCount != 0 && oneCount > maxi){
                maxi = oneCount;
                rowIndexOfMaxOnes = row;
            }
        }
        return rowIndexOfMaxOnes;
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {0,0,0,1},
                {0,0,1,1},
                {0,1,1,1},
                {1,1,1,1}
        };

        int[][] matrix1 = {
                {0,0,0,0},
                {0,0,0,0},
                {0,0,0,0},
                {0,0,0,0}
        };


        int ans = rowWithMaxOnes(matrix);

        System.out.println(ans + " row is having maximum ones");

        int ans1 = rowWithMaxOnes(matrix1);

        System.out.println(ans1 + " row is having maximum ones");
    }
}
