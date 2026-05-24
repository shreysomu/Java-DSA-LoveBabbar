package dsa.com.lecture26;

public class UniqueElementFinding {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50,40,30,20,10};
        int num = 0;
        int n = arr.length;
        for (int j : arr) {
            num = num ^ j;
        }

        System.out.println("Unique element is : " + num);
    }
}
