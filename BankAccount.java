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

  public boolean deposit(double amount) {
    if (amount > 0) {
      balance = balance + amount;
    }
    else {
      balance = balance;
    }
    return (amount >= 0);
  }

  public boolean withdraw(double amount) {
    if(balance < amount || amount < 0) {
      balance = balance;
    }
    else {
      balance = balance - amount;
    }
    return (balance > amount && amount > 0);
  }

}
