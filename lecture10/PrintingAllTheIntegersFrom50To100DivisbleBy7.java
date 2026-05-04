package dsa.com.lecture10;

public class PrintingAllTheIntegersFrom50To100DivisbleBy7 {
    public static void main(String[] args) {
        for (int i = 50; i <=100; i++) {
            if(i%7 == 0){
                System.out.println(i);
            }
        }

        //Second way direct updating with +7
        System.out.println("Second way direct updating with +7 : ");
        for (int i = 56; i <=100 ; i+=7) {
            System.out.println(i);
        }
    }
}
