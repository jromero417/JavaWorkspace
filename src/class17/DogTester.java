package class17;

public class DogTester {
    public static void main(String[] args) {
        /*Dog dog1 = new Dog();
        dog1.name="John";
        dog1.color="Black";
        dog1.breed="German";
        dog1.age=5;
        dog1.printInfo();
        Dog dog2 = new Dog();
        dog2.name="Ryan";
        dog2.color="White";
        dog2.breed="Husky";
        dog2.age=6;
        dog2.printInfo();
        Dog dog3 = new Dog();
        dog3.name="Tom";
        dog3.color="Gold";
        dog3.breed="Retriever";
        dog3.age=10;
        dog3.printInfo();
        Dog dog4 = new Dog();
        dog4.name="Adam";
        dog4.color="Red";
        dog4.breed="Mutt";
        dog4.age=8;
        dog4.printInfo();
        Dog dog5 = new Dog();
        dog5.name="Logan";
        dog5.color="White";
        dog5.breed="Poodle";
        dog5.age=2;
        dog5.printInfo();*/

        Dog dog1=new Dog("Jack","Black","Persian",12);
        Dog dog2=new Dog("Shaggy","White","Husky",8);
        Dog dog3=new Dog("Fluffy","Pink","British",7);
        Dog dog4=new Dog("Papi","Brown","Asian",6);
        Dog dog5=new Dog("Papi2","Brown & Black","Asian",6);

        dog1.printInfo();
        dog2.printInfo();
        dog3.printInfo();
        dog4.printInfo();
        dog5.printInfo();


    }
}
