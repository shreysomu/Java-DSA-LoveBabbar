package dsa.com.lecture17;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 1;
        s1.age = 28;
        s1.name = "Somu";
        s1.nos = 5;

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.id);
        System.out.println(s1.nos);


        s1.bunk();
        s1.study();
        s1.sleep();

        //parameterized ctor

        Student s2 = new Student(2,29,"Rahul",4);

        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.id);
        System.out.println(s2.nos);
        s2.bunk();
        s2.study();
        s2.sleep();


      //  System.out.println("Copy constructor : ");
        Student s3 = new Student(s2);

        System.out.println(s3.id);
        System.out.println(s3.name);
        System.out.println(s3.nos);
        System.out.println(s3.age);
        s3.sleep();
        s3.study();
        s3.study();
    }
}
