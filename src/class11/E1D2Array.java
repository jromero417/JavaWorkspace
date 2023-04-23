package class11;

public class E1D2Array {
    public static void main(String[] args) {
        int[][] arr = {{10, 20, 30, 40, 50},
                {1, 2, 3, 4, 5},
                {5, 5, 5, 5, 5},
                {10, 8, 6, 4, 2}
        };
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                int element = arr [row][column];
                if (element%2!=0){
                    System.out.print(element+" ");
                }
            }

        }

    }
}
