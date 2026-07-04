package dsa.com.lecture57_RecursionPart4;

public class PrintArrayUsingRecursion {

    static void printArray(int[] arr,int i){
        if(i == arr.length)
            return;
        System.out.println(arr[i]);
        printArray(arr,i+1);
    }

    public static void main(String[] args) {
        int[] arr = {10,12,34,21,24,11,35,78,99};
        printArray(arr,0);
    }
}
