package class13;

public class Math {

    void add(int num1,int num2){
        System.out.println(num1+num2);
    }
    //defining a method
    void multiply(int num1,int num2){
        System.out.println(num1*num2);
    }
    void subtract(int num1,int num2){
        System.out.println(num1-num2);
    }
    void divide (int num1,int num2){
        System.out.println(num1/num2);
    }

    public static void main(String[] args) {
        //Creating the object of math class, calling it math
        Math math = new Math();
        //Calling the method "add" and passing two values
        math.add(10,10);
        math.multiply(2,5);
        math.subtract(50,25);
        math.divide(100,2);
    }
}
