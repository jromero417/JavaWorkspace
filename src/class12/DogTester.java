package class12;

public class DogTester {
    public static void main(String[] args) {

        Dog actualDog = new Dog ();
        actualDog.name="Jacky";
        actualDog.age=15;
        actualDog.breed="German";
        actualDog.color="Black";
        actualDog.weight=50;

        actualDog.bark();

        Dog obj=new Dog();
        obj.name="Bob";
        obj.age=7;
        obj.breed="Siberian";
        obj.color="Red";
        obj.weight=65;

        obj.sleep();

    }
}
