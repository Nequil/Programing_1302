public class CustomerAccount {
  private int acctNum;
  private double balance;
  public CustomerAccount(int num, double bal)
      throws HighBalanceException {
        acctNum = num;
        balance = bal;
        if (balance > 20000.00)
          throw (new HighBalanceException( ));
    }
}
