package class12;

public class Car {
    //define 5 properties and methods

    String model;
    String make;
    int mileage;
    String color;
    String engine;

    void startCar (){
        System.out.println("Starting the "+model);
    }
    void shutOff(){
        System.out.println("Shutting off the " + model);
    }
    void rev (){
        System.out.println("vroom");
    }

}
