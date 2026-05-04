package dsa.com.lecture10;

public class ForLoopDemo {
    public static void main(String[] args) {
        for (int i = 0 ;i<10;i++){
            System.out.println("Shrey");
        }


        System.out.println("printing all odd numbers between 1 t0 30 : ");
        for (int i = 1; i <= 30; i+=2) { //printing all odd numbers between 1 t0 30
            System.out.println(i);

        }

        System.out.println("printing all even numbers between 1 t0 30 : ");
        for (int i = 2; i <=30 ; i+=2) {
            System.out.println(i);
        }
    }
}
