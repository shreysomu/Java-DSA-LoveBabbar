package dsa.com.lecture14;

public class CommonStringMethods {
    public static void main(String[] args) {
        String str = "Shrey";
        System.out.println("Length of the String is : "+str.length());
        System.out.println("Character at 0 index is : " +str.charAt(0));

        //Empty String --- >>>> length = 0;
        // blank --->> empty or only spaces in string

        String str1 =" ";
        System.out.println(str1.length());
        System.out.println(str1.isEmpty());
        String name = "    Somu   ";
        System.out.println(name.length());
        name = name.trim();//all the spaces will remove
        System.out.println(name);


        String name1 = "shrey";
        String name2 = "SHreya";

        System.out.println(name1.toUpperCase());
        System.out.println(name2.toLowerCase());


        String str8 = "It's raining outside.";
        System.out.println(str8.substring(5,10));

        System.out.println(str8.contains("outside"));


        int num = 4902;
        String str9 = String.valueOf(num);
        System.out.println(num+1);
        System.out.println(str9+1);


        String name10 = "Shrey Somu Trivedi";
        System.out.println(name10.startsWith("Shrey"));
        System.out.println(name10.endsWith("Trivedi"));
        System.out.println(name10.endsWith("Somu"));


        String name11 = "Topper";
        char[] arr = name11.toCharArray();

        System.out.println("Printing char array : ");

        for (char ch : arr){
            System.out.println(ch);
        }

        String input = "my,name,is,shrey";
        String [] words = input.split(",");

        for (String stri : words){
            System.out.println(stri);
        }


        String name19 = "somu";
        name19 = name19.replace('o','i');
        System.out.println(name19);
    }
}
