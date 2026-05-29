package dsa.com.lecture31;

import java.util.ArrayList;
import java.util.List;

public class MissingElementsFromAnArrayOfDuplicates {

    static List<Integer> findMissingNumbers(int[] arr){

        List<Integer> res = new ArrayList<>();
         //marking.............
        for (int i = 0; i < arr.length ; i++) {
            int value = Math.abs(arr[i]);
            int pos = value-1;

            if(arr[pos]>0){
                arr[pos] = -arr[pos];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0){
                res.add(i+1);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,2,4,7,8,1,10};
        System.out.println("Missing Elements : " +findMissingNumbers(arr));
    }
}
