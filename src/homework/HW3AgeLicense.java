package homework;

import java.util.Scanner;

public class HW3AgeLicense {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = scan.nextInt();
        if (age >=18){
            System.out.println("Your drivers license has been issued!");
        } else if (age >=15 ){
            System.out.println("Here is a learners permit!");
        } else if (age<15 ) {
            System.out.println("Stick to racing games...");
        }
    }
}
