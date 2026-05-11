package dsa.com.lecture18;

public class Student {

    private int id;
    private int age;
    private String name;
    private int nos;
    private String gf;

    public String getName() {
        return this.name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<100)
          this.age = age;
        return;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNos() {
        return nos;
    }

    public void setNos(int nos) {
        this.nos = nos;
    }

    public String getGf() {
        return gf;
    }

    public void setGf(String gf) {
        this.gf = gf;
    }




    //parameterized constructor

    public Student(int id, int age , String name, int nos , String gf){
        System.out.println("Student parameterized constructor is called");
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
        this.gf = gf;

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

    void gfChatting(){
        System.out.println(name + " chatting");
    }
}
