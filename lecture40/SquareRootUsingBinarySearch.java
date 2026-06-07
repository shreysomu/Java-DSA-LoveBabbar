package dsa.com.lecture40;

public class SquareRootUsingBinarySearch {


    static int mySqrt(int x){
        int s = 1;
        int e = x;
        int ans = -1;
        if(x==0){
            return 0;
        }

        while (s <= e){
            int mid = s + (e-s)/2;
            if(mid  == x/mid){ //Integer_Overflow
                return mid;
            }
            else if(mid>x/mid){ //Integer_Overflow
                e = mid-1;
            }
            else {
                ans = mid;
                s = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 26;
        System.out.println(mySqrt(n));
    }
}
