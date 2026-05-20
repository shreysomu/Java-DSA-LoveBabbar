package dsa.com.lecture23CollectionFrameworkPart1;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

        Stack<Integer> st1 = new Stack<>();
        Stack<String> st2  = new Stack<>();

        st1.add(34);
        st1.add(23);
        st1.add(67);
        st1.add(89);

        System.out.println("Stacks : " + st1);

        System.out.println();
        System.out.println("Push method : ");
        st1.push(45);
        st1.push(25);
        st1.push(78);
        st1.push(33);

        System.out.println(st1);

        System.out.println();
        System.out.println("Pop Method : ");
        st1.pop();
        System.out.println(st1);

        System.out.println();
        System.out.println("Peek method : ");
        System.out.println(st1.peek());

        System.out.println();
        System.out.println("Search method : ");
        System.out.println(st1.search(34));
        System.out.println(st1.search(21));

        System.out.println();
        System.out.println("Empty method : ");
        System.out.println(st1.empty());
    }
}
