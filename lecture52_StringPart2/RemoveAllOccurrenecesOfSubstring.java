package dsa.com.lecture52_StringPart2;

public class RemoveAllOccurrenecesOfSubstring {


    static String removeOccurrences(String str, String part){

        while (str.contains(part)){
            int index = str.indexOf(part);
            //create new string by merging left and right part of found substring inside str String
            str = str.substring(0,index) + str.substring(index + part.length());
        }
        return str;    //O(n^2 * m)
    }
    public static void main(String[] args) {

        String str = "ababcab";
        String part = "ab";
        System.out.println(removeOccurrences(str,part));
    }
}
