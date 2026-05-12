package dsa.com.lecture19;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Maruti","800",4,5,"Auto");
        car.startEngine();
        car.startAC();
        car.stopEngine();


        MotorCycle bike = new MotorCycle("Splender" , "Xline",2,"U","soft");
        bike.startEngine();
        bike.wheelie();
        bike.stopEngine();
    }
}
