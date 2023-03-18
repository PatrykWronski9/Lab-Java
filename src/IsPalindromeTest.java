import mylib.StringFun;

import java.util.Scanner;

public class IsPalindromeTest {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        do {
            System.out.print("Podaj tekst do sprawdzenia (0 aby zakończyć): ");
            String text = scn.nextLine();
            if(text.equals("0")) break;
            System.out.print("Tekst: \"" + text + "\"" +
                    (StringFun.isPalindrome(text) ? " " : " nie ") +
                    "jest palindromem\n");
        } while (true);
    }
}
