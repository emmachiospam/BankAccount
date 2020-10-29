public class Tester {
  public static void main(String[] args) {
    BankAccount b1 = new BankAccount(12345, "hullo");
    b1.deposit(500);
    b1.deposit(500);
    b1.deposit(500);
    b1.withdraw(1600);
    System.out.println(b1.getBalance());
    System.out.println(b1.toString());
  }
}
