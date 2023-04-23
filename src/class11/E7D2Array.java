package class11;

public class E7D2Array {
    public static void main(String[] args) {
        boolean[][] arr2D = {
                {true, false, true, true, false},
                {true, false, false, false, false},

        };
        int counter = 0;
        for (boolean[] arr1D : arr2D) {
            for (boolean check : arr1D) {
                if (check==true) {
                    counter++;

                }
            }
        }
        System.out.println(counter);
    }
}
