package dsa.com.lecture21;

    interface Bird1{
         void fly();
         void eat();
    }

    class Sparrow1 implements Bird1 {


        @Override
        public void fly() {
            System.out.println("Sparrow1 flying");
        }

        @Override
        public void eat() {

            System.out.println("Sparrow1 Eating");
        }
    }


    class Crow1 implements Bird1 {

        @Override
       public void fly() {
            System.out.println("Crow1 flying");
        }

        @Override
       public void eat() {

            System.out.println("Crow1 eating");
        }
    }
    public class InterfaceDemo {

        public static void main(String[] args) {
            // Bird b = new Bird(); //abstract class can't be instantiated

            Bird1 b = new Sparrow1();
            b.eat();
            b.fly();


            b = new Crow1();
            b.fly();
            b.eat();

        }
    }



