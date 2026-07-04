package dsa.com.lecture57_RecursionPart4;

public class PrintDigitUsingRecursion {

    static void printDigit(int num ){
        if(num == 0)
            return;

        int dig = num % 10;

        printDigit(num/10);
        System.out.println(dig);


    }
    public static void main(String[] args) {
        printDigit(2356774);
    }
}
