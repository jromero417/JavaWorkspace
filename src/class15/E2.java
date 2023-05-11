package class15;

public class E2 {
    void method1(){
        System.out.println("Hello world");
    }
    int sumArr (int[]arr ) {
        int sumArr = 0;
        for (int i = 0; i < arr.length; i++) {
            sumArr = sumArr + arr[i];
        }
        return sumArr;
    }

    public static void main(String[] args) {
        E2 obj = new E2();
        int sum=obj.sumArr(new int []{10,10,10});
        System.out.println(sum);
    }
}
