package class7;

import java.util.Scanner;

public class E13WhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int input= scan.nextInt();
        int counter=1;
        while (counter<=input){
            System.out.print(counter+" ");
            counter++;
        }
    }
}
