package class13;

import java.lang.reflect.Array;

public class ArrayUtil {
    public static void main(String[] args) {
        //write the logic to search if number is present in array or not
        int[] arr = {10, 20, 45, 89};
        int[] arr1={12,32,455,889};
        int [] arr2={120,302,5,889};

        int number = 89;
        int number1=10;
        int number2=10;

        ArrayUtil search= new ArrayUtil();
        search.searchArray(arr,number);
        search.searchArray(arr1,number1);
        search.searchArray(arr2,number2);


    }
    void searchArray(int[]arr,int number){
        for (int i=0;i<arr.length;i++){
            if (arr[i]==number){
                System.out.println("Yes");
            }
        }
    }
}
