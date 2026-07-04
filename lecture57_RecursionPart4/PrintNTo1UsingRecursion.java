package dsa.com.lecture57_RecursionPart4;

public class PrintNTo1UsingRecursion {

    static void printNTo1(int n,int count){
        if(count == 0)
            return;
        System.out.println(count);
        printNTo1(n,count-1);

    }


    //2nd method without any extra parameter
    static void printNTo12ndMethod(int n){
        //base case
        if(n == 0)
            return;
        System.out.println(n);
        printNTo12ndMethod(n-1);
    }
    public static void main(String[] args) {

        System.out.println("Using First method : ");
        printNTo1(5,5);

        System.out.println();
        System.out.println("Using Second method : ");
        printNTo12ndMethod(5);
    }
}
