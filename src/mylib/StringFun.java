package mylib;

public class StringFun {
    public static boolean isPalindrome(String text){
        text = text.replaceAll("[^a-zA-Z0-9]", "");
        for(int i = 0; i <= text.length()/2; i++){
            if(text.charAt(i) != text.charAt(text.length()-1-i))
                return false;
        }
        return true;
    }

}
