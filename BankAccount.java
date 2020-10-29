public class BankAccount {
  private double balance;
  private int accountID;
  private String password;

  public BankAccount(int accountID, String password) {
    balance = 0.0;
    accountID = accountID;
    password = password;
  }

  public double getBalance() {
    return(balance);
  }

  public int getAccountID() {
    return(accountID);
  }

  public void setPassword(String newPass) {
    password = newPass;
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

  public String toString() {
    return(accountID + "\t" + balance);
  }

}
