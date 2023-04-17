package mylib;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StringFun {
    public static boolean isPalindrome(String text){
        text = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        for(int i = 0; i <= text.length()/2; i++){
            if(text.charAt(i) != text.charAt(text.length()-1-i))
                return false;
        }
        return true;
    }

    public static String anarchize(String text){
        boolean upperCase = Character.isUpperCase(text.charAt(0));
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < text.length(); i++){
            char x = text.charAt(i);
            if(upperCase) x = Character.toLowerCase(x);
            else x = Character.toUpperCase(x);
            result.append(x);
            upperCase = !upperCase;
        }
        return result.toString();
    }

    public static String camelize(String text){
        String[] words = StringUtils.normalizeSpace(text).split(" ");
        StringBuilder result = new StringBuilder();
        for(int i = 0; i<words.length; i++){
            String word = words[i].toLowerCase();
            if(i != 0){
                char[] arr = word.toCharArray();
                arr[0] = Character.toUpperCase(arr[0]);
                word = String.valueOf(arr);
            }
            result.append(word);
        }
        return result.toString();
    }

    public static String decamelize1(String text){
        StringBuilder result = new StringBuilder();
        for(int i = 0; i<text.length(); i++){
            if(i == 0) {
                result.append(Character.toUpperCase(text.charAt(i)));
                continue;
            }
            if(Character.isUpperCase(text.charAt(i))) result.append(" ");
            result.append(Character.toLowerCase(text.charAt(i)));
        }
        return result.toString();
    }

    public static String decamelize2(String text){
        String result;
        List<String> words = new ArrayList<>();
        int a=0, b;
        for(int i = 0; i<text.length(); i++){
            if(Character.isUpperCase(text.charAt(i))){
                b = i;
                words.add(text.substring(a,b));
                a = i;
            }
            if(i == text.length() - 1){
                words.add(text.substring(a,i+1));
            }
        }
        StringBuilder resultBuilder = new StringBuilder();
        for(String w : words){
            resultBuilder.append(w.toLowerCase()).append(" ");
        }
        result = resultBuilder.toString();
        return StringUtils.normalizeSpace(result.substring(0,1).toUpperCase() + result.substring(1));
    }

    public static String shuffle(String text){
        StringBuilder result = new StringBuilder();
        Random rnd = new Random();
        while(text.length()>0){
            int x = rnd.nextInt(text.length());
            result.append(text.charAt(x));
            text = text.substring(0,x) + text.substring(x+1);
        }
        return result.toString();
    }

}
