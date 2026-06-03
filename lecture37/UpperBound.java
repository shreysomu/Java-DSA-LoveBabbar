package dsa.com.lecture37;

public class UpperBound {

    static int getUpperBound(int[] arr, int target){
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int ans = -1;
        while(s<=e){
            int mid = s+(e-s)/2;

            if (arr[mid] <= target){
                s = mid+1;
            }
            else {
                ans = mid;
                e = mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int [] arr = {1, 1, 2, 2, 2, 2, 3,5};
        int target1 = 2;
        int target2 = 4;

        int res = getUpperBound(arr,target1);
        System.out.println("Upper Bound is : " + res);
        int res2 = getUpperBound(arr,target2);
        System.out.println("Upper Bound for target2 is : " + res2);

    }
}
