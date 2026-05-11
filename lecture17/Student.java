package dsa.com.lecture17;

public class Student {

    public int id;
    public int age;
    public String name;
    public int nos;


    //default constructor

    public Student(){
        System.out.println("Student by default constructor is called");
    }

    //parameterized constructor

    public Student(int id,int age , String name,int nos){
        System.out.println("Student parameterized constructor is called");
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;

    }

    public Student(Student st) {
        System.out.println("Copy constructor : ");
        this.id = st.id;
        this.name = st.name;
        this.age = st.age;
        this.nos = st.nos;
    }

    public void study(){
        System.out.println(name + " studying");
    }

    public void sleep(){
        System.out.println(name + " sleeping");
    }

    public void bunk(){
        System.out.println(name + " bunking");
    }
}
