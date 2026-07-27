package dsa.com.lecture63_RecursionPart10;

public class PartitionEqualSubsetSum {

    static boolean solve(int target, int[] nums, int index){
        //base case
        if(target == 0) {
            return true;
        }
        if (target < 0){
            return false;
        }
        if (index >= nums.length){
            return false;
        }

        //include-exclude pattern
        boolean includeAns = solve(target-nums[index],nums,index+1);
        boolean excludeAns = solve(target,nums,index+1);

        return includeAns || excludeAns;
    }
    static boolean canPartition(int[] nums){
        int sum = 0;
        for (int num : nums){
            sum += num;
        }

        //checking sum is odd or even
        if((sum & 1) == 1){
            return false;
        }
        int index = 0;
        int target = sum/2;

        return solve(target , nums , index);

    }

    public static void main(String[] args) {
        int[] nums = {1,5,11,5}; //11 == 11 true
        System.out.println("Partition the given array in two subsets ? : " +canPartition(nums));
    }
}
