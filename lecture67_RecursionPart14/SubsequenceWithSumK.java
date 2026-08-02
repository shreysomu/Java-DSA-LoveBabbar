package dsa.com.lecture67_RecursionPart14;

public class SubsequenceWithSumK {
    static boolean checkSubsequenceSum(int[] arr, int k){
        int index = 0;
        int sum = 0;
        boolean res = solve(arr,k,sum,index);
        return res;
    }

    static boolean solve(int[] arr, int k, int sum, int index) {
        //base case
        if(index >= arr.length){
            //subsequence ready hai ....
            //check sum
            if(sum == k)
                return true;
            else
                return false;
        }

        //1 case we'll do other recursion will tc
        //include-exclude

        //exclude
        boolean excludeAns = solve(arr,k,sum,index+1);
        boolean includeAns = solve(arr,k,sum + arr[index],index+1);

        boolean finalAns = includeAns || excludeAns;
        return finalAns;
    }

    public static void main(String[] args) {
        int[] arr = {10,1,2,7,6,1,5};
        int k = 8;
        System.out.println("Sum of all elements in the subsequences equals to k ? :" +checkSubsequenceSum(arr,k));
    }
}
