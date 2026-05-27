package dsa.com.lecture29_ArrayPart3;

public class FindMissingNumberInNRange {

//Using xor---- XorSum

    static int missingNumber(int[] arr){

        int n = arr.length;
        int xorSum = 0;
        for (int x : arr){
            xorSum ^= x;
        }
        for (int i = 0;i<=n;i++){
            xorSum ^= i;
        }
        return xorSum;
    }

    public static void main(String[] args) {
        int [] arr = {0,1,2,4,5,6};
        System.out.println("Missing number : " + missingNumber(arr)); //3

    }
}
