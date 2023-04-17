import mylib.StringFun;

import java.util.Scanner;

public class ShuffleTest {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        do {
            System.out.println("Podaj tekst do zabawy: ");
            String text = scn.nextLine();
            if(text.equals("0")) break;
            System.out.printf("Tekst \"%s\" po przelosowaniu wygląda tak: \"%s\"\n", text, StringFun.shuffle(text));
        } while (true);
    }
}
