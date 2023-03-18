package mylib;
import org.apache.commons.lang3.StringUtils;

public class Account {
    private String name;
    private static String ukrAlphabet = "абвгдеєжзиіїйклмнопрстуфхцчшщьюя";
    private static String translitRepl[] = {"a","b","v","g","d","e","je","zh","z","y","i","ji", "j",
            "k","l","m","n","o","p","r","s","t","u","f","h","c",
            "ch","sh","shh","'","ju","ja"};

    public void setName(String name) {
        this.name = capitalize(name);
    }

    public String getName() {
        return name;
    }

    public static String translit(String text){
        StringBuilder result = new StringBuilder();
        text = text.toLowerCase();
        for (int i = 0; i<text.length(); i++) {
            int index = ukrAlphabet.indexOf(text.charAt(i));

            if(index != -1){
                result.append(translitRepl[index]);
            }else{
                result.append(text.charAt(i));
            }
        }

        return result.toString();
    }

    public static String capitalize(String aStr)
    {
        String[] tokens = StringUtils.split(aStr);
        for(int i = 0; i < tokens.length; i++)
            tokens[i] = StringUtils.capitalize(tokens[i]);
        return StringUtils.join(tokens,' ');
    }



}
