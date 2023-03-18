import mylib.Account;

public class Main {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.setName("patryk wronski");
        System.out.println(acc.getName());
        System.out.println(Account.capitalize("test string"));
    }
}