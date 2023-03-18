import mylib.Account;

public class Main {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.setName("patryk wronski");
        System.out.println(acc.getName());
        System.out.println(Account.capitalize("test string"));

        System.out.println(Account.translit("Андрусяк"));
        System.out.println(Account.translit("Безкоровайний"));
        System.out.println(Account.translit("Ващенко"));
        System.out.println(Account.translit("Головатий"));
        System.out.println(Account.translit("Дорошенко"));
    }
}