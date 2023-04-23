package class13;

public class E3StringDemo {
    public static void main(String[] args) {

        String str = "dsdgsdngkdshgSFDGSDGDS44123124@#$@#%@%!!";
        System.out.println(str.replaceAll("[^a-z]",""));
        System.out.println(str.replaceAll("[^a-z0-9A-Z]",""));
        System.out.println(str.replaceAll("[DS4]",""));
        System.out.println(str.replaceAll("[A-Z]","\\$"));
        System.out.println(str.replaceAll(" ","\\$"));


    }
}
