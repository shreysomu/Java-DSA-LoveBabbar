package dsa.com.lecture57_RecursionPart4;

public class CountElementInArrayUsingRecursion {

    static void countElements(int[] arr ,int i,int count){
        if (i == arr.length) {
            System.out.println("Total count of  element is : " + count);
            return;
        }
        countElements(arr,i+1,count+1);
    }

    public static void main(String[] args) {
        int[] arr = {22,56,3,22,45,22,22,46,22,56,78,22,34};
        countElements(arr,0,0);
    }
}
