import mylib.StrongPasswordBuilder;
import mylib.StrongPasswordGenerator;

import java.util.Scanner;

public class StrongPasswordGeneratorTest {
    public static void main(String[] args) throws Exception {
        StrongPasswordGenerator gen = new StrongPasswordBuilder()
                .WithLength(128)
                .WithLower(true)
                .WithUpper(true)
                .WithNumbers(true)
                .WithSpecialSigns(true)
                .WithSignsAllowed("*$&#^@")
                .Build();

        Scanner scn = new Scanner(System.in);
        do {
            System.out.println("Generowanie haseł. Aby zakończyc użyj 0");
            String text = scn.nextLine();
            if(text.equals("0")) break;
            System.out.printf("Wylosowane hasło: %s\n", gen.Generate());
        } while (true);
    }
}
