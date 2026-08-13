package dsa.com.lecture72_RecursionPart19;

import java.util.ArrayList;
import java.util.List;

public class PhoneNumber {

    static void solve(String digits,int index , String [] mapping,List<String> result,StringBuilder output){
        //base case
        //index jaise hi output string bahar nikal jayega....
        //output string ready hai to push inside result list

        if(index >= digits.length()){
            result.add(output.toString());
            return;
        }

        //1 case solve karna hai , fill 1 bock
       int value =  digits.charAt(index) - '0';
        String mappedString = mapping[value];
        //current value uaki mPPED STRING ke pas ready hai
        //current block par use rakh dete hai abki recursion de dega

        for (int i = 0; i < mappedString.length(); i++) {
            output.append(mappedString.charAt(i));
            solve(digits, index+1,mapping,result,output);

            //back tracking
            output.deleteCharAt(output.length()-1);
        }
    }
    static List<String> letterCombination(String digits){
        String[] mapping = {"", "", "abc", "def" , "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> result = new ArrayList<>();
        int index = 0 ;
        StringBuilder output = new StringBuilder();
        solve(digits, index , mapping,result,output);
        return result;
    }
    public static void main(String[] args) {

        String digits = "23";
        System.out.println("All possible combinations : " + letterCombination(digits) );
    }
}
