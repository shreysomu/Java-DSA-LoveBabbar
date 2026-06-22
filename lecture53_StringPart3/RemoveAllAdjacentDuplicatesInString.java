package dsa.com.lecture53_StringPart3;

public class RemoveAllAdjacentDuplicatesInString { //Leetcode 1047

    static String removeDuplicates(String s){
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
           char currentChar = s.charAt(i);

           if (res.length() > 0 && res.charAt(res.length() - 1) == currentChar){
               res.deleteCharAt(res.length() - 1);
           }
           else {
               res.append(currentChar);
           }
        }
        return res.toString();
    }
    public static void main(String[] args) {
        String s = "abbaca";  //output : "ca"
        System.out.println("After removing all the adjacent duplicates in string : " + removeDuplicates(s));
    }
}
