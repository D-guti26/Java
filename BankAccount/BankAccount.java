public class BankAccount {

    private double balance;

  
    public BankAccount(double balance) {
      this.balance = balance;
    }

    public double getbalance() {
      return this.balance; 
    }
    
    public void setbalance(double balance){
      balance += balance;
    }

    public void withdraw(double withdrawAmount) {
      balance -= withdrawAmount;
    }
  }
