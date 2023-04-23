package class11;

public class E2D2Array {
    public static void main(String[] args) {

        String[][] names =
                {{"Sarah", "Artem", "Lean", "Semir"},
                        {"Farwa", "Halima", "Alina", "Semir"},
                };
        for (int row=0;row< names.length;row++){
            for (int column=0;column<names[row].length;column++){
                System.out.println(names[row][column]);
            }
        }

    }
}

