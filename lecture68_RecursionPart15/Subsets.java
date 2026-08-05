package dsa.com.lecture68_RecursionPart15;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    static void solve(int[] nums, int index , List<Integer >output , List<List<Integer>> ans){
        //base case
        if(index >= nums.length){
            //subsequence is ready
            ans.add(new ArrayList<>(output));
            return;
        }
        //include-exclude pattern
        int currValue = nums[index];

        //include
        output.add(currValue);
        solve(nums,index+1,output,ans);

        //backtracking Step
        output.remove(output.size()-1);

        //exclude
        solve(nums,index+1,output,ans);
    }
    static List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int index = 0;
        solve(nums,index,output,ans);
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println("All possible unique subsets : " + subsets(nums));
    }

}
