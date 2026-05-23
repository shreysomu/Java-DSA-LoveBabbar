package dsa.com.lecture24CollectionFrameworkPart2;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> animal1 = new LinkedList<>(); //LinkedList implementation of Queue
        Queue<String> animal2 = new ArrayDeque<>(); //Array implementation of Queue
        Queue<String> animal3 = new PriorityQueue<>(); //Priority Queue implementation of Queue

        Queue<Integer> q = new LinkedList<>();
        q.offer(90);
        q.offer(69);
        q.offer(26);
        q.offer(36);

        System.out.println("Printing Queue : " +q);
        System.out.println("Removing : " + q.poll());

        System.out.println("Again Printing : " + q);

        System.out.println("Peeking " + q.peek());



    }
}
