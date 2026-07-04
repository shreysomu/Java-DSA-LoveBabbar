package dsa.com.lecture57_RecursionPart4;

public class Print1ToNUsingRecursion {

    static void print1ToN(int n,int count){
        if(count > n)
            return;
        System.out.println(count);
        print1ToN(n,count+1);
    }


    //2nd method without any extra parameter
    static void print1ToN2ndMethod(int n){
        int i = 1;
        //base case
        if(n == 0)
            return;
        print1ToN2ndMethod(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {

        System.out.println("Using First method : ");
        print1ToN(5,1);

        System.out.println();
        System.out.println("Using Second method : ");
        print1ToN2ndMethod(5);
    }
}
