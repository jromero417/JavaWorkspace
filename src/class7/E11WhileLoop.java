package class7;

public class E11WhileLoop {
    public static void main(String[] args) {

        int num = 100;
        while (num > 0) {
            System.out.print(num + " ");
            num--;
        }
        num = 20;
        System.out.println();
        while (num <= 100) {
            System.out.print(num + " ");
            num += 2;
        }
        num = 100;
        System.out.println();
        while (num >= 1) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
            num--;

        }
    }
}