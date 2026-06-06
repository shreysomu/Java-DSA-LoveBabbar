package dsa.com.lecture39;

public class PivotIndexInSortedRotatedArray {


    static int pivotIndex(int[] arr){
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int ans = 0;
        if(arr[s] < arr[e]){
            return -1;
        }

        while (s <= e){
            int mid = s +(e-s)/2;

            if(arr[mid] <= arr[e]){
                e = mid-1;
            }
            else {
                ans = mid;
                s = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        int [] arr1 = {-66,-67};
        System.out.println("Pivot index is : " + pivotIndex(arr));
        System.out.println("Pivot index is : " + pivotIndex(arr1));

    }
}
