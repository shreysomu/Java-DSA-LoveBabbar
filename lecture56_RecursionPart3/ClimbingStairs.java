package dsa.com.lecture56_RecursionPart3;

public class ClimbingStairs {  //leetcode 70

    static int climbingStairs(int n){
        //base case
        if(n == 1 || n == 2)
            return n;

        return climbingStairs(n-1) + climbingStairs(n-2);
    }

    public static void main(String[] args) {
        int n = 3;

        System.out.println("Number of distinct ways to climb to the top : " + climbingStairs(n));
    }
}
