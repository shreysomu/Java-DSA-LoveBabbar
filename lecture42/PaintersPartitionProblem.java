package dsa.com.lecture42;

public class PaintersPartitionProblem {

    static int minTime(int[] boards,int k){
        int sum = 0;
        for (int i = 0; i < boards.length; i++) {
            sum += boards[i];
        }

        int s = 0;
        int e = sum;
        int ans = -1;

        while (s <= e){
            int mid = s +(e-s)/2;

            if (isValidSolution(boards, k, mid)){
                ans = mid;
                e = mid-1;
            }
            else {
                s = mid+1;
            }
        }
        return ans;
    }

     static boolean isValidSolution(int[] boards, int k, int maxLength) {

        int painterCount = 1;
        int paintedLength = 0;
         for (int i = 0; i < boards.length; i++) {

             if(paintedLength + boards[i] <= maxLength){
                 paintedLength += boards[i];
             }
             else {
                 painterCount++;
                 paintedLength = 0;
                 if(painterCount>k || boards[i]>maxLength){
                     return false;
                 }
                 else{

                     paintedLength += boards[i];
                 }
             }
         }
         return true;
    }

    public static void main(String[] args) {
        int[] boards = {10,20,30,40};
        int k = 2;
        System.out.println(minTime(boards,k));
    }
}
