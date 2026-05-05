package dsa.com.lecture14;

public class ComparingStrings {
    public static void main(String[] args) {
        String name1 = "Shrey";
        String name2 = "Shrey";

        String name3 = "shrey";
        if(name1 == name2){ //it'll check if both strings are referencing to same name
            System.out.println("Both strings are equal");
        }
        else {
            System.out.println("Both strings are not equal");
        }

        if (name1.equals(name3)){ // it'll check value and it's case-sensitive
            System.out.println("Both strings are same");
        }
        else {
            System.out.println("Both strings are not same");
        }

        if(name1.equalsIgnoreCase(name3)){ // it'll ignore cases
            System.out.println("Both Strings are equal.");
        }
        else {
            System.out.println("Both Strings are not same.");
        }
    }
}
