package dsa.com.lecture54_RecursionPart1;

public class FactorialOfANumber {

    static long factorial(int num){
        //base case
        if(num == 0){
            return 1;
        }
        return num * factorial(num-1); //recursive call
    }
    public static void main(String[] args) {
        int num = 5;
        System.out.println("Factorial of given number is : " + factorial(num));
    }
}
