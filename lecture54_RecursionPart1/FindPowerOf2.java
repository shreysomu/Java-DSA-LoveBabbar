package dsa.com.lecture54_RecursionPart1;

public class FindPowerOf2 {

    static int findPowerOf2(int num){
        if(num == 0){
            return 1;
        }
        return 2 * findPowerOf2(num - 1);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Power of 2 is : " + findPowerOf2(n));
    }
}
