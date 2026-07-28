package dsa.com.lecture65_RecursionPart12;

public class JumpGame {

    static boolean solve(int[] nums, int index){
        //base cases
        //reached destination
        if (index == nums.length-1){
            return true;
        }

        //destination se bahr nikal gaya
        if(index >= nums.length){
            return false;
        }

        //stuck wali situation
        if(nums[index] == 0){
            return false;
        }

        int jumpValue = nums[index];
        boolean overAllAns = false;
        for (int jump = 1;jump<=jumpValue;jump++){
           boolean ans = solve(nums,index+jump);
           overAllAns = overAllAns || ans;
        }
        return overAllAns;
    }
    static boolean canJump(int[] nums){
        int index = 0;
        boolean ans  = solve(nums,index);
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};  //true
        System.out.println("Reached last index ? : " + canJump(nums));
    }
}
