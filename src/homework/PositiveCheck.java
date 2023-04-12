package homework;

public class PositiveCheck {

    public static void main(String[] args) {

        int num = -10;

        if (num>0)
        {
            System.out.println("Number is positive");
        }
        else
        {
            System.out.println("Number is negative");
        }

        int number=3;
        int remainder = number%2;
        if (remainder==0){
            System.out.println("Number is even");
        }
        else {
            System.out.println("Number is odd");
        }
    }
}