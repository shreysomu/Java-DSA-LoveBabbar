package dsa.com.lecture14;

public class StringDemo {
    public static void main(String[] args) {
        String str = "Shrey";
        String str2 = new String("Trivedi");
        System.out.println(str + " " + str2);
        System.out.println(str.length());
        System.out.println(str2.length());
        System.out.println(str.charAt(0));
        System.out.println(str2.charAt(3));

        String name = "Somu";
      //  name[0] = 'T';
        name = "Tomu"; // new String not updating actual one
        System.out.println(name);
    }
}
