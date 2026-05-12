package dsa.com.lecture19;

public class MotorCycle extends Vehicle{

   public String handleBarStyles;
   public String suspensionTypes;

    public MotorCycle(String name, String model, int noOfTyres, String handleBarStyles, String suspensionTypes) {
        super(name, model, noOfTyres);
        this.handleBarStyles = handleBarStyles;
        this.suspensionTypes = suspensionTypes;
    }

    public void wheelie(){
        System.out.println(name + " Motorcycle is wheelieeeeeee! ");
    }
}
