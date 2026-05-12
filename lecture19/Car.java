package dsa.com.lecture19;

public class Car extends Vehicle{
    public int noOfDoors;
    public String transmissionTypes;

    Car(String name, String model, int noOfTyres, int noOfDoors, String transmissionTypes){
       super(name, model,noOfTyres);
       this.noOfDoors = noOfDoors;
       this.transmissionTypes = transmissionTypes;
      // super.startEngine();
      // super.stopEngine();

    }

    public void startAC(){
        System.out.println("AC started of :" + name);
    }
}
