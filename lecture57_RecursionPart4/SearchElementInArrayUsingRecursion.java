package dsa.com.lecture57_RecursionPart4;

public class SearchElementInArrayUsingRecursion {

    static int findTarget(int[] arr , int i , int target){
        if (i == arr.length)
            return -1;

        if (arr[i] == target)
            return i;

       return findTarget(arr, i+1,target);
    }
    public static void main(String[] args) {
        int[] arr = {10,45,32,46,26,79,31,12,86};
        int target = 31;
       int res =  findTarget(arr,0,target);
        System.out.println("Found at index " + res);
    }
}
