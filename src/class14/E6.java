package class14;

public class E6 {
    boolean isEven(int number){
        if(number%2==0){
            return true;

        }
        return false;
    }

    public static void main(String[] args) {
        E6 obj = new E6();
        int number=15;
        boolean result=obj.isEven(number);
        System.out.println(result);
    }
}
