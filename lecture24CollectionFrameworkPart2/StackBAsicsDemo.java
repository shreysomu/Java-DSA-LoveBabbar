package dsa.com.lecture24CollectionFrameworkPart2;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackBAsicsDemo {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(20);
        stack.push(45);
        stack.push(89);
        stack.push(32);

        System.out.println("Stack : " +stack);

        System.out.println();
        System.out.println("Pop : " + stack.pop());
        System.out.println("Stack : " + stack);

        System.out.println();
        System.out.println("Peek : " +stack.peek());
    }
}
