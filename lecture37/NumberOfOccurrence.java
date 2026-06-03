package dsa.com.lecture37;

public class NumberOfOccurrence {
    static int getUpperBound(int[] arr, int target){
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int ans = n;
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

    static int getLowerBound(int[] arr, int target){
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int ans = n;
        while(s<=e){
            int mid = s+(e-s)/2;

            if (arr[mid] >= target){
                ans = mid;
                e = mid-1;
            }
            else {
                s = mid +1;
            }
        }
        return ans;
    }

    static int countFreq(int[] arr, int target) {
        // code here
        int lowerBoundIndex = getLowerBound(arr,target);
        int upperBoundIndex = getUpperBound(arr,target);

        return upperBoundIndex - lowerBoundIndex;
    }

    public static void main(String[] args) {
        int [] arr = {1, 1, 2, 2, 2, 2, 3,5};
        int target1 = 2;
        int target2 = 4;

        int res = countFreq(arr,target1);
        System.out.println("Occurrence of target1 : " + res);
        int res2 = countFreq(arr,target2);
        System.out.println("Occurrence of target2  : " + res2);

    }

}


