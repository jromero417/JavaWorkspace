package class19;

public class Animal {
    String name;
    String color;
    String breed;
    int age;
    double weight;
    public Animal(String name, String color, String breed, int age, double weight) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }
    void printInfo(){
        System.out.println(name+" "+color+" "+breed+" "+age+" "+weight);
    }


}
class Dog extends Animal{
    double price;
   public Dog(String name, String color, String breed, int age, double weight,double price){
       super(name, color, breed, age, weight);
       this.price=price;//assigning the price
   }
   void printInfo(){
       super.printInfo(); //reusing the printInfo method from parent class by using super keyword
       System.out.println(price);
   }
}
class Cat extends Animal{
    public Cat(String name, String color, String breed, int age, double weight){
        super(name, color, breed, age, weight);
    }

}
class Horse extends Animal{
    public Horse(String name, String color, String breed, int age, double weight) {
        super(name, color, breed, age, weight);
    }
}
class AnimalTester{
    public static void main(String[] args) {
        Dog dog = new Dog("Tom", "Black", "Persian", 10, 20, 2000);
        dog.printInfo();
    }
}
