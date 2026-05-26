package dsa.com.lecture28_ArrayPart2;

import java.util.HashMap;
import java.util.Scanner;

public class ModeOfTheArray { //mode ---->> Highest frequency

    static int modOfArray(int[] arr){
        HashMap<Integer,Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
 //            for (int i : freq.keySet()){
//                System.out.println(i+ " -> " +freq.get(i));
//            }

        int maxFreq = -1;
        int keyOfMaxFreq  = -1;

        for (int key : freq.keySet()){
            int freqOfCurrentKey = freq.get(key);


            if (freqOfCurrentKey > maxFreq){
                maxFreq = freqOfCurrentKey;
                keyOfMaxFreq = key;
            }
        }

        return keyOfMaxFreq;
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
        System.out.println("Mode(Key of highest frequency) of the array is : " + modOfArray(arr));
    }
}
