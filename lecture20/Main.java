package dsa.com.lecture20;

public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.add(3,6));
        System.out.println(cal.add(7,8,9));
        System.out.println(cal.add(5,9,2,8.8));


        //Circle circle = new Circle();
      //  circle.draw();

       // Rectangle rec = new Rectangle();
      //  rec.draw();

        Circle circle2 = new Circle();
        doDrawingStuff(circle2); //dynamic dispatch or upcasting

        Rectangle rec2 = new Rectangle();
        doDrawingStuff(rec2);

    }

    public static void doDrawingStuff(Shape s){
        s.draw();
    }
}
