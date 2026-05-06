package DataHiding;

public class Test {
    public static void main(String[] args) {
        Account acc = new Account();

        acc.setBalance(5000);
        System.out.println(acc.getBalance());

        acc.setBalance(-1000);
        System.out.println(acc.getBalance());
    }
}
