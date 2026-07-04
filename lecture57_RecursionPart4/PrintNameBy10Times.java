package dsa.com.lecture57_RecursionPart4;

public class PrintNameBy10Times {

    static void printMyName(int n){
        if(n == 0)
            return;

        System.out.print(n + "time : ");
        System.out.println("Shrey");
        printMyName(n-1);
    }

    public static void main(String[] args) {
        printMyName(10);
    }
}
