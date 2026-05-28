package dsa.com.lecture30_ArrayPart4;

import java.util.HashMap;

public class FindFirstRepeatingElement {

    static int findFirstRepeatingElement(int[] arr){
        HashMap<Integer,Integer> freq = new HashMap<>();


        for (int x : arr){
            freq.put(x,freq.getOrDefault(x,0) + 1);
        }

        for (int i : arr){
            if (freq.get(i)>1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10,5,3,4,5,3,6};
        System.out.println("First repeated element is : " + findFirstRepeatingElement(arr));
    }
}
