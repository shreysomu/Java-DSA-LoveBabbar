package dsa.com.lecture53_StringPart3;

public class StringCompression {

    static int compress(char[] chars){ //leetcode 443
        int readIndex = 0;
        int writeIndex = 0;

        while (readIndex < chars.length){
            char currentChar = chars[readIndex];
            int count = 0;

            //count duplicate characters
            while (readIndex < chars.length && currentChar == chars[readIndex]){
                readIndex++;
                count++;
            }

            //current character and count available

            chars[writeIndex] = currentChar;
            writeIndex++;
            if (count>1){
                String countStr = String.valueOf(count);
                for (char digit : countStr.toCharArray()){
                    chars[writeIndex] = digit;
                    writeIndex++;
                }
            }
        }
        return writeIndex;
    }
    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        //output : a2b2c3 ---> length = 6
        System.out.println("Length of the compressed string is : " + compress(chars));
    }
}
