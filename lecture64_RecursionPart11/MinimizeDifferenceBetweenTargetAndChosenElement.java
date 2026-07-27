package dsa.com.lecture64_RecursionPart11;

public class MinimizeDifferenceBetweenTargetAndChosenElement {

    static int solve(int sum,int target, int[][] mat,int row){
        //bae case
        if(row >= mat.length){
            //invalid row index
            //sum is ready
            //calculate difference between target and sum and
            //store or return the min diff
            return Math.abs(target-sum);
            //row index, having value on multiple columns
        }

        //1 case solve other cases recursion will handle

        int mini = Integer.MAX_VALUE;

        for (int num : mat[row]){
            int ans =  solve(sum+num,target,mat,row+1);
            mini = Math.min(mini,ans);
        }
        return mini;
    }
    static int minimizeTheDifference(int[][] mat, int target){
        int row = 0;
        int sum = 0;

       return  solve(sum,target,mat,row);
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int target = 13;

        System.out.println("Minimum absolute difference between two numbers is : " + minimizeTheDifference(matrix,target));
    }
}
