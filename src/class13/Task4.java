package class13;

public class Task4 {
    public static void main(String[] args) {
        //Find out how many sentences are in a string
        String str = "Is it saturday? Is it raining? Do we have a Java Class today?";
        String strArray[] = str.split("[.!?]");
        System.out.println(strArray.length);

    }
}
