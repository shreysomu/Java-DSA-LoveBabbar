package dsa.com.lecture51_StringPart1;

public class MostFrequentCharacter {

    static char getMaxOccurringChar(String str){
        int [] freq = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            freq[currChar - 'a']++;
        }
        int maxFreq = -1;
        char res = 0;

        for (int i = 0; i < 26; i++) {
            if (freq[i] > maxFreq){
                maxFreq = freq[i];
                res = (char) (i + 'a');
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String st = "testsample";
        System.out.println("Character having most frequency in given string is : " + getMaxOccurringChar(st));
    }
}
