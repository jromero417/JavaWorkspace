package class9;

public class E5Arrays {
    public static void main(String[] args) {
        for (int i=0;i<=5;i++){
            if (i%2==0)
                System.out.print(i+" ");
        }
        System.out.println();
        char [] chars ={'A','B','C','D','E'};
        for (int i=0;i<= chars.length;i++){
            if (i%2==0)
                System.out.print(chars[i]+" ");
        }
    }
}
