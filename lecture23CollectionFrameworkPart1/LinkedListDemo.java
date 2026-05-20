package dsa.com.lecture23CollectionFrameworkPart1;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ll1 = new LinkedList<>();
        ll1.add(34);
        ll1.add(45);
        ll1.add(89);
        ll1.add(39);
        ll1.add(79);

        System.out.println("Printing linkedlist ll1 : " + ll1);
        System.out.println(ll1.lastIndexOf(79));

        System.out.println();
        System.out.println("addFirst and addLast : ");

        ll1.addFirst(35);
        ll1.addLast(23);

        System.out.println("Printing ll1 : " + ll1);

        System.out.println();
        System.out.println("Peek and Poll methods : ");
        System.out.println( "Peak : " + ll1.peek());
        System.out.println("Poll : " + ll1.poll());
        System.out.println(ll1);
    }
}
