package class12;

public class E11StringDemo {
    public static void main(String[] args) {

        String name ="Today is Saturday";
        for (int i=0;i<name.length();i++){
            if (name.charAt(i)=='a'){
                System.out.print(i+" ");
            }
        }

    }
}
