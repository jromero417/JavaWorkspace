package class13;

public class Task2 {
    //Create string to hold a sentence
    //Write program to get new string without any spaces
    public static void main(String[] args) {
        String str ="Asghar is the best teacher ever. but his classes are so hard.    we need more time ";
        System.out.println(str.replaceAll(" ",""));

    }
}
