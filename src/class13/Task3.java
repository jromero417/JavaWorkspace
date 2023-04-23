package class13;

public class Task3 {
    public static void main(String[] args) {
        //count the number of alphanumeric characters in a string
        String str="abdefgh12345!@#&*&";
        str=str.replaceAll("[^a-zA-z0-9]","");
        System.out.println(str.length());
    }
}
