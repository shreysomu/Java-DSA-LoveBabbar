package dsa.com.lecture25CollectionFrameworkPart3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ComparableInterface {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(32);
        list.add(21);
        list.add(44);

        System.out.println("list : " + list);

        System.out.println();
        System.out.println("Sorting list : ");
        Collections.sort(list);
        System.out.println(list);


        System.out.println();
        System.out.println("Students : ");

        List<Student> students = new ArrayList<>();
        students.add(new Student(23,"Raj",67));
        students.add(new Student(27,"Ayushi",53));
        students.add(new Student(25,"Shriya",52));
        students.add(new Student(21,"Shiv",77));
        students.add(new Student(25,"Shrey",74));


        System.out.println(students);

        System.out.println();
        System.out.println("Sorting Students : ");
        Collections.sort(students);
        System.out.println("Printing Students after sorting : " + students);


    }
}
