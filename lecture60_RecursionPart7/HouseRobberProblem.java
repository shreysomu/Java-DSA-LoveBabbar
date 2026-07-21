package dsa.com.lecture60_RecursionPart7;

public class HouseRobberProblem {

    public static int rob(int[] nums){

        int index = 0;
        return solve(nums,index);
    }

    static int solve(int[] nums, int index) {
        //base case
        if(index >= nums.length){
            return 0;
        }
        //1 case hum solve karenge
        //baaki ecursion sambhal lega
        //index vale house par hai
        //2 choices hai , include or exclude

        int includeRes = nums[index] + solve(nums,index +2);
        int excludeRes =  solve(nums,index + 1);
        return Math.max(includeRes,excludeRes);
    }


    public static void main(String[] args) {
        int[] nums = {2,7,9,3,1};
        int res = rob(nums);

        System.out.println("Maximum money made by robber : " + res);
    }
}
