package homework;

import java.util.Scanner;

public class HW2Loan {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your desired loan:");
        int loan = scan.nextInt();
        if (loan < 200000) {
            System.out.println("Your loan is granted!");
        } else {
            System.out.println("Sorry, but your request has been rejected.");
        }
    }
}
