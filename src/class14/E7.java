package class14;

public class E7 {
    void largestNum(int a,int b){
        if (a>b){
            System.out.println(a);
        }else {
            System.out.println(b);
        }
    }

    public static void main(String[] args) {
        E7 obj = new E7();
        obj.largestNum(10,20);
    }
}
