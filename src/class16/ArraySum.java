package class16;

public class ArraySum {
    int sumArray(int[] arr) {
        int sum =0;
        for (int num:arr){
            sum=sum+num;
        }
        return sum;
    }

    public static void main(String[] args) {
        ArraySum sum= new ArraySum();
        int result = sum.sumArray(new int[]{10,10,10});
        System.out.println(result);

    }
}
