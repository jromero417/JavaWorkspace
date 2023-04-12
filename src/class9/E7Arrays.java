package class9;

public class E7Arrays {
    public static void main(String[] args) {

        boolean [] flags ={true,false,true,false,false,true};
        int counter = 0; //variable to count amount of false values
        for (int i=0;i< flags.length;i++){
            //loop to go through entire array
            if (!flags[i]){
                //counting amount of false values as program runs
                counter++;
            }

        }
        System.out.println(counter);
    }
}
