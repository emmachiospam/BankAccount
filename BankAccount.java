public class BankAccount {
  private double balance;
  private int accountID;
  private String password;

  public BankAccount(int a, String p) {
    balance = 0.0;
    accountID = a;
    password = p;
  }

  public String getBalance() {
    return("balance is" + balance);
  }

  public String getAccountID() {
    return("AccountID is" + accountID);
  }

  public void changePassword(String p) {
    password = p;
  }


}
