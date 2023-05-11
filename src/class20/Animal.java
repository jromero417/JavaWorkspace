package class20;

public class Animal {
    String name;
    String color;
    int age;
    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    void walk(){
        System.out.println("walking...");
    }
    void sleep(){
        System.out.println("zzz.....");
    }
    void jump(){
        System.out.println("jumping...");
    }
}


