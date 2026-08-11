package dsa.com.lecture69_RecursionPart16;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum1 {

    static void solve(int[] candidates,int target , int index ,List<List<Integer>> res , List<Integer> output){
        //base case
        if(target == 0){
            //target 0 means output vali list me ek res ban chuka hai
            //then store it into res wali ist

            res.add(new ArrayList<>(output));
            return;
        }

        if (index >= candidates.length){
            return;
        }

        if(target<0){
            return;
        }

        //1 case we need to solve other recursion will take care

        //include-exclude pattern

        //include
        output.add(candidates[index] );
        solve(candidates,target-candidates[index],index,res,output);

        //backtrack step
        output.remove(output.size()-1);

        //exclude
        solve(candidates, target, index+1, res, output);
    }
    static List<List<Integer>> combinationSum(int[] candidates,int target){
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int index = 0;

        solve(candidates,target,index,res,output);
        return res;
    }
    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;

        System.out.println("List of all unique combinations of candidates : " + combinationSum(candidates,target));
    }
}
