package dsa.com.lecture39;

public class SearchInRotatedArray {

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

    static int binarySearch(int[] arr, int target, int start, int end){

        while(start <= end){

            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }

        return -1;
    }

    static int search(int[] arr, int target){

        int pivot = pivotIndex(arr);
        int n = arr.length;

        if(pivot == -1){
            return binarySearch(arr, target, 0, n - 1);
        }

        if(target >= arr[0] && target <= arr[pivot]){
            return binarySearch(arr, target, 0, pivot);
        }

        return binarySearch(arr, target, pivot + 1, n - 1);
    }



    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        int target = 6;

        if (search(arr,target) == -1){
            System.out.println("Target element is not present in array");
        }
        else {
            System.out.println("Target1 Element is present at : " + search(arr, target));
        }
    }
}
