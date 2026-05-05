package dsa.com.lecture13;

public class MaxElementInTheArray {
    public static void main(String[] args) {
        int arr[] = {10,20,89,49,21,6,90,94,78,90};
        int max = arr[0];

        int n = arr.length;
        for (int i = 0; i < n ; i++) {
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Maximum Element is : " + max);
    }
}
