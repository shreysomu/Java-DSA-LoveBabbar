package dsa.com.lecture59_RecursionPart6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AllSubsequencesOfString {

    static List<String> powerSet(String s){
        List<String> res = new ArrayList<>();
        StringBuilder output = new StringBuilder();
        int i = 0;
        getAllSubsequences(s,i,output,res);
        Collections.sort(res);
        return res;
    }

    private static void getAllSubsequences(String s, int i, StringBuilder output, List<String> res) {
        //base
        if (i == s.length()){
            String subsequence = output.toString();
            res.add(subsequence);
            return;
        }
        //1 case we'll solve other recursion will take care
        //include-exclude pattern
        char ch = s.charAt(i);
        //include
        output.append(ch);
        getAllSubsequences(s,i+1,output,res);

        //exclude
        output.deleteCharAt(output.length()-1);
        getAllSubsequences(s,i+1,output,res);
    }

    public static void main(String[] args) {
        String s = "abc";  //"a","b","c","ab","bc","ac","abc"," " == 2^n subsequences ---->>> n = length
        List <String> res = powerSet(s);
        System.out.println(res);
    }
}
