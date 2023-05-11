package class14;

public class Task1 {
    //Check if word is palindrome, ignoring spaces
    boolean isPalindrome(String str){
        String reversedStr="";
        for (int i=str.length()-1;i>=0;i--){ //Reversing given string with a reverse loop
            reversedStr=reversedStr+str.charAt(i);

        }
        boolean isStrPalindrome=false;
        if (str.equalsIgnoreCase(reversedStr)){
            isStrPalindrome=true;
        }
        return isStrPalindrome;
    }

    public static void main(String[] args) {
        Task1 obj = new Task1();
        boolean result = obj.isPalindrome("Madam");
        System.out.println(result);

    }
}
