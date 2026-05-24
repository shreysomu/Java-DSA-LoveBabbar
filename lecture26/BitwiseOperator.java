package dsa.com.lecture26;

public class BitwiseOperator {
    public static void main(String[] args) {
        int a = 8;
        int b = 10;

        System.out.println("Bitwise and : " + (a & b));
        System.out.println("Bitwise or : " + (a | b));
        System.out.println("Bitwise xor : " + (a ^ b));
        System.out.println("Bitwise not : " + (~a));
        System.out.println("Bitwise left shift of a: " + (a<<1));
        System.out.println("Bitwise left shift of b : " + (b<<2));

        System.out.println("Bitwise right shift of a: " + (a>>1));
        System.out.println("Bitwise right shift of b : " + (b>>2));
    }
}
