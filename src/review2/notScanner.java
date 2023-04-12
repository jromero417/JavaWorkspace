package review2;

import java.util.Scanner;

public class notScanner {
    public static void main(String[] args) {

        int i=10;

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 1 word");
        String word = scan.next();
        System.out.println("Word that was captured = " + word);

        System.out.println("Please enter full sentence");
        String sentence = scan.nextLine();
        System.out.println(sentence);

        System.out.println("Please enter integer value");
        int number = scan.nextInt();
        System.out.println("Entered number is = " +number);

        System.out.println("Please enter decimal value");
        double decimal = scan.nextDouble();
        System.out.println("Decimal value is = " + decimal);



    }
}
