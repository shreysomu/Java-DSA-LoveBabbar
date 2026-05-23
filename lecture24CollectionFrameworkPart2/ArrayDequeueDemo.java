package dsa.com.lecture24CollectionFrameworkPart2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class ArrayDequeueDemo {
    public static void main(String[] args) {
        Deque<Integer> q = new ArrayDeque<>();
        q.offer(78);
        q.offerFirst(72);
        q.offerLast(91);

        System.out.println(q);
        System.out.println();
        System.out.println("pollLast method");

        q.pollLast();
        System.out.println(q);

        System.out.println();
        System.out.println("pollFirst method : ");
        q.pollFirst();
        System.out.println(q);

        System.out.println();
        System.out.println("Size : " +q.size());
    }
}
