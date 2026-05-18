package dsa.com.lecture21;


abstract class Bird{
    abstract void fly();
    abstract void eat();
}

class Sparrow extends Bird {

    @Override
    void fly() {
        System.out.println("Sparrow flying");
    }

    @Override
    void eat() {

        System.out.println("Sparrow eating");
    }
}


class Crow extends Bird{

    @Override
    void fly() {
        System.out.println("Crow flying");
    }

    @Override
    void eat() {

        System.out.println("Crow eating");
    }
}
public class AbstractionDemo {

    public static void main(String[] args) {
       // Bird b = new Bird(); //abstract class can't be instantiated

        Bird b = new Sparrow();
        b.eat();
        b.fly();


        b = new Crow();
        b.fly();
        b.eat();

    }
}



