public class Tester {
  public static void main(String[] args) {
    BankAccount b1 = new BankAccount(1000001, "abc123");
    BankAccount b2 = new BankAccount(1000231, "abcasdg23");
    b1.deposit(3000.0);
    b2.deposit(1234.0);
    System.out.println(b1.getBalance());
    System.out.println(b2.getBalance());
    System.out.println(b1.transferTo(b2, 200.0, "no"));
    System.out.println(b1.getBalance());
    System.out.println(b2.getBalance());


    // b1.deposit(500);
    // b1.deposit(500);
    // b1.deposit(500);
    // b1.withdraw(1600);
    // b1.setPassword("testing");
    // System.out.println(b1.getBalance());
    // System.out.println(b1.toString());
  }
}
