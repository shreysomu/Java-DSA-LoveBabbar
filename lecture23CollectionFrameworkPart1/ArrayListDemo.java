package dsa.com.lecture23CollectionFrameworkPart1;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
     //   List<Integer> list = new ArrayList<>();
        //Collection<Integer> collection = new ArrayList<>();

        list.add(20);
        list.add(40);
        list.add(50);

        System.out.println(list);

        list.add(49);
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        //addAll

        System.out.println("addAll.....");
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(32);
        list1.add(89);

        list.addAll(list1);
        System.out.println(list);

        System.out.println("removeAll.....");
        list.removeAll(list1);
        System.out.println(list);

        System.out.println("Size......");
        System.out.println(list.size());

        System.out.println("Printing list1 : " + list1);

        System.out.println("Clearing list1 : ");
        list1.clear();
        System.out.println(list1.size());


        System.out.println("Traverse list using iterator : ");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println("Element : " + iterator.next());
        }

        List<Integer> list2 = new ArrayList<>();
        list2.add(45);
        list2.add(78);
        list2.add(56);
        list2.add(39);

        System.out.println("List2 : " + list2);
        System.out.println("Using get : " + list2.get(1));

        System.out.println("Set method : ");
        list2.set(1,18);
        System.out.println("Again printing list2 : " + list2);


        //toArray
        System.out.println("toArray.......");
        Object[] arr =  list2.toArray();
        for (Object obj : arr) {
            System.out.println(obj);
        }


        System.out.println("Contains...............");
        System.out.println(list2.contains(39));


        System.out.println("ArrayList Methods");
        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(12);
        list4.add(89);
        list4.add(45);
        list4.add(7);

        System.out.println();
        System.out.println("Printing list4 : " + list4);

        System.out.println();
        System.out.println("Sort method in ArrayList : ");
        Collections.sort(list4);
        System.out.println();
        System.out.println("Printing list4 after sorting : " + list4);
        Collections.reverse(list4);
        System.out.println("Again reversing list4 to print in descending order : " + list4);


        ArrayList<Integer> newList = (ArrayList<Integer>) list4.clone();
        System.out.println(" printing new list using clone method : " +newList);

        ArrayList<Integer> marks = new ArrayList<>();
        marks.ensureCapacity(100);

        System.out.println(marks.isEmpty());
        System.out.println(newList.indexOf(45));
    }
}
