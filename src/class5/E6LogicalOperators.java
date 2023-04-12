package class5;

public class E6LogicalOperators {
    public static void main(String[] args) {

        //  System.out.println(true || true || false);
        int age = 61;
        char gender = 'F';

        //if gender is F or equal to 60 you will get a discount
        if (gender=='F' || age > 60) {
            System.out.println("You will get a discount");
        }

    }
}
