public class Main {
  public static void main(String[] args) {
    BankAccount account = new BankAccount(0.00);
    SavingsAccount savingsaccount = new SavingsAccount(100.00);

    account.setbalance(101.00);
    System.out.println(savingsaccount.getbalance());
    savingsaccount.withdraw(101.00);
    System.out.println(savingsaccount.getbalance());
  }
}
