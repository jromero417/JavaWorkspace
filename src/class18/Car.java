package class18;

public class Car {
    String make;
    String model;
    String color;
    int year;
    int horsepower;
    Car(String make,String model,String color){
        this.make=make;
        this.model=model;
        this.color=color;
    }
    Car(String make,String model,String color,int year){
        this(make,model,color);
        this.year=year;
    }
    void startCar(){
        System.out.println("Car started");
    }
    void stopCar(){
        System.out.println();
    }
}
