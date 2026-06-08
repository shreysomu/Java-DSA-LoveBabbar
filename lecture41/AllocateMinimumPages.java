package dsa.com.lecture41;

public class AllocateMinimumPages {
    static int findPages(int[] arr, int k){

        if(arr.length<k){
            return -1;
        }
        int n = arr.length;
        int s = 1;
        int sum = 0;

        for (int j : arr) {
            sum += j;
        }

        int e = sum;
        int res = -1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if (isValidAnswer(arr,k,mid)){
                res = mid;
                e = mid-1;
            }
            else {
                s = mid+1;
            }
        }
        return res;
    }

     static boolean isValidAnswer(int[] arr,int k, int maxPages) {
        int studentCount = 1;
        int pages = 0;

         for (int j : arr) {
             if (pages + j <= maxPages) {
                 pages += j;
             } else {
                 studentCount++;
                 if (studentCount > k || j > maxPages) {
                     return false;
                 } else {
                     pages = 0;
                     pages += j;
                 }
             }
         }
         return true;
    }

    public static void main(String[] args) {
        int[] arr = {12,34,67,90};
        int k = 2;
        System.out.println("Minimum of maximum pages is : " +findPages(arr,k));
    }
}
