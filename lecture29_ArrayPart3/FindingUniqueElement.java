package dsa.com.lecture29_ArrayPart3;

public class FindingUniqueElement {
    static int getUniqueElement(int[] arr){

        int xorSum = 0;
        for(int x : arr){
            xorSum ^= x;
        }
        return xorSum;
    }

    public static void main(String[] args) {

        int[] arr = {1,5,6,4,3,1,2,4,6,5,3};
        System.out.println("Unique number is : " +getUniqueElement(arr));
    }
}
