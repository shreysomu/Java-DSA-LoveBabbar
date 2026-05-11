package dsa.com.lecture18;


public class EncapsulationDemo {
    public static void main(String[] args) {

        Student student = new Student(2,27,"Shrey",4,"Shreya");
        System.out.println(student.getName());
        System.out.println(student.getId());
        System.out.println(student.getNos());
        System.out.println(student.getAge());
        System.out.println(student.getGf());

        student.setAge(29);
        System.out.println(student.getAge());

        student.sleep();
        student.study();
        student.bunk();
        student.gfChatting();
    }
}

