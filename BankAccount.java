public class BankAccount {
  private double balance;
  private int accountID;
  private String password;

  public BankAccount(int a, String p) {
    balance = 0.0;
    accountID = a;
    password = p;
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
    if (amount >= 0) {
      balance = balance + amount;
      return true;
    }
    else {
      balance = balance;
      return false;
    }
  }

  public boolean withdraw(double amount) {
    if (balance >= amount && amount >= 0) {
      balance = balance - amount;
      return true;
    }
    else {
      balance = balance;
      return false;
    }
  }

  public String toString() {
    return("#" + accountID + "\t $" + balance);
  }

  private boolean authenticate(String password) {
    return(this.password.equals(password));
  }

  public boolean transferTo(BankAccount other, double amount, String password) {
    if(authenticate(password) == true && withdraw(amount) == true) {
      if(other.deposit(amount)) {
        return true;
      }else{
        System.out.println("CRITICAL ERROR");
      }
    }
    return false;
  }
}
