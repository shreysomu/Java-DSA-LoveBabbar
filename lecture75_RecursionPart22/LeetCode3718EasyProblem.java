package dsa.com.lecture75_RecursionPart22;

import java.util.HashSet;

public class LeetCode3718EasyProblem {
        public static int missingMultiple(int[] nums, int k) {



        //Brute Force Approach ------>>>> TLE
//            for (int i = 1;; i++) {
//                int multi = i * k;
//                boolean found = false;
//
//
//                for (int x : nums) {
//
//                    if (multi == x) {
//                        found = true;
//                        break;
//                    }
//                }
//
//                if (!found) {
//                    return multi;
//                }
//
//            }


            //Optimized approach using HashSet

            HashSet<Integer> hs = new HashSet<>();

            for(int x : nums){
                hs.add(x);
            }


            for (int i = 1; ; i++) {
                int multi = i * k;

                if (!hs.contains(multi)){
                    return multi;
                }
            }
        }


    public static void main(String[] args) {

            int[] nums = {8,2,3,4,6};
            int k = 2;

        System.out.println(" missing smallest positive multiple  : "  + missingMultiple(nums,k));
    }
}
