package class15;

import java.util.Arrays;

public class E1 {
    int [] createArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = 10;
        }
        return array;
    }

    public static void main(String[] args) {
        E1 obj = new E1();
        int []array = obj.createArray(8);
        System.out.println(Arrays.toString(array));
    }
}
