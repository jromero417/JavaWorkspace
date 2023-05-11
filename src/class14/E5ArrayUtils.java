package class14;

import java.util.Scanner;

public class E5ArrayUtils {
    boolean contains(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        E5ArrayUtils obj = new E5ArrayUtils();
        int arr[] = {10, 20, 45};
        boolean result = obj.contains(arr, 20);
        System.out.println(result);

    }
}
