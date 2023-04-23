package class12;

public class E8StringDemo {
    public static void main(String[] args){
        String sentence = "      JAVA is very very easy";
        //Method chaining and its .possible to in String class
        sentence=sentence.trim().toLowerCase();
        System.out.println(sentence);
        System.out.println(sentence.startsWith("java"));
    }
}
