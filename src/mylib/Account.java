package mylib;
import org.apache.commons.lang3.StringUtils;

public class Account {
    private String name;

    public void setName(String name) {
        this.name = capitalize(name);
    }

    public String getName() {
        return name;
    }

    public static String capitalize(String aStr)
    {
        String[] tokens = StringUtils.split(aStr);
        for(int i = 0; i < tokens.length; i++)
            tokens[i] = StringUtils.capitalize(tokens[i]);
        return StringUtils.join(tokens,' ');
    }

}
