public class SavingsAccount extends BankAccount {
  
  double initialBalance;

  public SavingsAccount(double initialBalance) {

    super(initialBalance);

  }

  @Override
  public void withdraw(double withdrawAmount) {

    if (getbalance() - withdrawAmount >= 100){

      super.withdraw(withdrawAmount);

    } else {

    System.out.println("Unsufficient funds");
    
  }
}
}