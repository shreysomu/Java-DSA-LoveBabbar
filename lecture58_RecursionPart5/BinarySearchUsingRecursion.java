package dsa.com.lecture58_RecursionPart5;

public class BinarySearchUsingRecursion {

    static int binarySearchRecursive(int[] arr ,int s, int e, int target){
        if(s>e)
            return -1;

        int mid = s + (e-s)/2;
        if(arr[mid] == target)
            return mid;

        if(arr[mid] > target){
            e = mid - 1;
        } else if (arr[mid] < target) {
            s = mid + 1;
        }
      return  binarySearchRecursive(arr,s,e,target);
    }
    public static void main(String[] args) {
        int[] arr = {10,23,45,67,78,99};
        int target = 67;
        int s = 0;
        int e = arr.length - 1;

        System.out.println("Found at index : " + binarySearchRecursive(arr,s,e,target));
    }
}
