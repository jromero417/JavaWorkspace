package class8;

import java.util.Scanner;

public class E1WhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a starting point");
        int start = scan.nextInt();
        System.out.println("Enter an end point");
        int end = scan.nextInt();
        int counter = start;
        while (counter <= end) {
            System.out.print(counter+ " ");
            counter++;
        }
    }
}
