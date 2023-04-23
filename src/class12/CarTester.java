package class12;

public class CarTester {
    public static void main(String[] args) {
        //below code will create an object of car class
        Car car= new Car();
        car.make="Toyota";
        car.model="GR86";
        car.mileage=7500;
        car.color="Gray";
        car.engine="2.4L 4-cylinder Boxer Engine";
        car.startCar();
        car.rev();
        car.shutOff();

        Car car1= new Car();
        car1.make="Tesla";
        car1.model="Model S";
        car1.mileage=0;
        car1.color="White";
        car1.engine="Electric";
        car1.startCar();
        car1.shutOff();
        }
    }
