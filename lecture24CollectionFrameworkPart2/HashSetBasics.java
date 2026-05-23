package dsa.com.lecture24CollectionFrameworkPart2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetBasics {
    public static void main(String[] args) {
        Set<Integer> st = new HashSet<>();
        st.add(10);
        st.add(10);
        st.add(23);
        st.add(45);
        st.add(45);
        st.add(33);

        System.out.println("Set : " +st);

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);

        System.out.println();
        System.out.println("Set1 : " + set1);
        System.out.println("Set2 : " + set2);
        System.out.println("retainAll Method : "  );
        set1.retainAll(set2);
        System.out.println("After using set1.retainAll(set2) --- Set1 :  " + set1);


        System.out.println();
        System.out.println("ContainsAll Method : " + set1.containsAll(set2));
        System.out.println("ContainsAll Method : " + set2.containsAll(set1));


        System.out.println();
        System.out.println("LinkedHAshSet to preserve order : ");

        Set<Integer> st3 = new LinkedHashSet<>();
        st3.add(10);
        st3.add(23);
        st3.add(45);
        st3.add(33);

        System.out.println("Set after using LinkedHAshSet : " +st3);



        System.out.println();
        System.out.println("TreeSet for sorted order : ");

        Set<Integer> st4 = new TreeSet<>();
        st4.add(10);
        st4.add(23);
        st4.add(45);
        st4.add(33);

        System.out.println("Set after using TreeSet : " +st4);


        System.out.println();

        HashSet<Student> set5 = new HashSet<>();

        Student s1 = new Student(1,"Somu");
        Student s2 = new Student(1,"Somu");
        Student s3 = new Student(1,"Somu");

        set5.add(s1);
        set5.add(s2);
        set5.add(s3);


        System.out.println("Set of Students : " + set5);



    }
}
