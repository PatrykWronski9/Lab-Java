import mylib.StringFun;

import java.util.Scanner;

public class AnarchizeTest {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        do {
            System.out.println("Podaj tekst do zabawy: ");
            String text = scn.nextLine();
            if(text.equals("0")) break;
            System.out.printf("Tekst \"%s\" wygląda lepiej w takiej formie: \"%s\"\n", text, StringFun.anarchize(text));
        } while (true);
    }
}
