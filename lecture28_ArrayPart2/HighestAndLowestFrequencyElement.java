package dsa.com.lecture28_ArrayPart2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class HighestAndLowestFrequencyElement {

    static int[] getHighestLowestFreqElement(int[] arr){

        HashMap<Integer,Integer> freq = new HashMap<>();
        for (int num : arr){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        int highestFreq = Integer.MIN_VALUE;
        int highestNum = -1;
        for (int key : freq.keySet()){
            int currentKey = key;
            int currentFreq = freq.get(key);
            if (currentFreq>highestFreq){
                highestFreq = currentFreq;
                highestNum = currentKey;
            }
        }

        int lowestFreq = Integer.MAX_VALUE;
        int lowestNum = -1;
        for (int key : freq.keySet()){
            int currentFreq = freq.get(key);
            if (currentFreq < lowestFreq){
                lowestNum = key;
                lowestFreq = currentFreq;
            }
        }

        return new int[]{highestNum,lowestNum};
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Printing Array : ");
        for (int x : arr) {
            System.out.print(x + " ");
        }

        System.out.println();
        int[] ans =  getHighestLowestFreqElement(arr);

        System.out.println("Highest  frequency element of  the array is : "  + ans[0]);
        System.out.println("Lowest frequency element of  the array is : "  + ans[1]);

    }
}
