package class18;

public class AnimalTester {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.color="Black";
        System.out.println(horse.color);
        horse.sleep();

        Cat cat = new Cat();
        cat.name="Mano";
        cat.sleep();
        cat.speak();
    }
}
