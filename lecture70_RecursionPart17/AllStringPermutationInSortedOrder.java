package dsa.com.lecture70_RecursionPart17;

import java.util.ArrayList;
import java.util.Collections;

public class AllStringPermutationInSortedOrder {

    static void solve(String s ,String output,ArrayList<String> ans){
        //agar meri input string or remaining string empty aayi hai
        //that means output string me permutation ready hai
        //ans vali list me store kar do

        //base case
        if(s.isEmpty()){
            ans.add(output);
            return;
        }

        //har character ko current position par try karkr dekho
        //baaki recursion ko de do

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String remString = s.substring(0,i) + s.substring(i+1);

            //baki recursion dekh lega
            solve(remString,output+ch,ans);
        }
    }

    static ArrayList<String> permutation(String s){

        ArrayList<String> ans = new ArrayList<>();
        solve(s,"",ans);
        Collections.sort(ans);
        return ans;
    }
    public static void main(String[] args) {
        String s = "ABC";
        System.out.println("Total permutation in lexicographically non- decreasing order : " + permutation(s));
    }
}
