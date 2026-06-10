package dsa.com.lecture43;

import java.util.Arrays;

public class AggressiveCowsProblem {

    static int aggressiveCows(int[] stalls, int k){
        Arrays.sort(stalls);
        int n = stalls.length;
        int ans = -1;
        int s = 0;
        int e = stalls[n-1] - stalls[0];

        while (s <= e){
            int mid = s + (e-s)/2;

            if(isValidAns(stalls,k,mid)){
                ans = mid;
                s = mid+1;
            }
            else {
                e = mid-1;
            }
        }
        return ans;
    }

    private static boolean isValidAns(int[] stalls,int k,int minDistance) {
        int cowCount = 1;
        int lastPosition = 0; //first cow is placed at 0 index

        for (int i = 0; i < stalls.length; i++) {
            //current cow ko current position par tabhi place kar paunga
            //jab current and previous cow k beach ka distance
            //>= miDistance ho

            if (stalls[i] - stalls[lastPosition] >= minDistance){
                //can place safely;
                cowCount++;
                //new caw placed so lastPosition needs to update
                lastPosition = i;
                if (cowCount == k){
                    //all cows are placed
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] stalls = {1,2,8,4,9};
        int k =3;
        System.out.println("Largest possible minimum distance between two cows : " +aggressiveCows(stalls,k));
    }

}
