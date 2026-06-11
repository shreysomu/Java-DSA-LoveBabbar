package dsa.com.lecture44;

public class EKOSPOJproblem {


    static int maxSawHeight(int[] trees, int m){
        int n = trees.length;
        int s = 0;
        int maxi = -1;
        int ans = -1;

        for (int i = 0; i < n; i++) {
            if (trees[i] > maxi){
                maxi = trees[i];
            }
        }

        int e = maxi;

        while (s <= e){
            int mid = s + (e-s)/2;

            if (isValidAns(trees, m ,mid)){
                ans = mid;
                s = mid+1;
            }
            else {
                e =mid-1;
            }
        }
        return ans;
    }

     static boolean isValidAns(int[] trees, int m,int maxHeight) {
        long totalWoodCollected = 0;
         for (int tree : trees) {
             if (tree > maxHeight) {
                 long currentTreeWoodCollected = tree - maxHeight;
                 totalWoodCollected += currentTreeWoodCollected;
             }
         }
         return totalWoodCollected >= m;
     }

    public static void main(String[] args) {

        int[] trees = {20,15,10,17};
        int m = 7;

        System.out.println(maxSawHeight(trees,m));
    }


}
