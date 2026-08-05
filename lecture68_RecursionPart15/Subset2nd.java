package dsa.com.lecture68_RecursionPart15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset2nd {
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

    //while excluding ignore the same element and move on to the new element
    while (index+1 < nums.length && nums[index] == nums[index+1]){
        index++;
    }
    //exclude
    solve(nums,index+1,output,ans);
}

    static List<List<Integer>> subsetWithDup(int[] nums){

        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int index = 0;
        solve(nums,index,output,ans);
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,2};
        System.out.println("All possible subsets : " + subsetWithDup(nums));
    }
}
