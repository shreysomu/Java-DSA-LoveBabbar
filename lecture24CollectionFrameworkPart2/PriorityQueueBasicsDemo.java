package dsa.com.lecture24CollectionFrameworkPart2;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueBasicsDemo {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();

        pq.offer(56);
        pq.offer(34);
        pq.offer(89);
        pq.offer(67);

        System.out.println("Printing Queue : " + pq);

        System.out.println();
        //Default Behaviour - > Integers - > less value - > high priority --> minHeap
        System.out.println("Poll : " + pq.poll());
        System.out.println("Queue : " +pq);


        System.out.println();
        //
        System.out.println("High priority to Higher value ------");

        Queue<Integer> pq1 = new PriorityQueue<>((a,b)->b-a);
        //MaxHeap -> integer - > high value ->> high priority

        pq1.offer(32);
        pq1.offer(91);
        pq1.offer(7);
        pq1.offer(10);

        System.out.println("Maxheap(Queue) : " + pq1);
        System.out.println("Poll : " + pq1.poll());
        System.out.println("Queue after poll : " + pq1);



    }
}
