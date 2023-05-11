package class15;

public class Task3 {
    boolean isPrime(int num) {
        boolean isPrime = true;
        int count = 0;

        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }

            if (count > 1) {
                isPrime = false;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        Task3 obj = new Task3();

    }
}
