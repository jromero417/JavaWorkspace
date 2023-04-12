package homework;

import java.util.Scanner;

public class HW4CityTemp {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("What city do you live in?");
        String city = scan.next();
        System.out.println("What temperature in fahrenheit is it in " + city + " right now?");
        int tempF = scan.nextInt();
        int tempC = (tempF-32) * 5/9;
        System.out.println("It is " + tempC+ " degrees Celsius in " + city + " right now.");




    }
}
