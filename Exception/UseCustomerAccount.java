import javax.swing.*;
public class UseCustomerAccount {
public static void main(String [ ] args) {
  int acctNum = 0;
  double balance = 0;
    try {
    acctNum = Integer.parseInt(JOptionPane.showInputDialog(null,
      "Enter account number"));
    balance = Double.parseDouble(JOptionPane.showInputDialog(null,
      "Enter balance due"));

    CustomerAccount acct = new CustomerAccount(acctNum, balance);
    JOptionPane.showMessageDialog(null, "Customer #" + acctNum +
    " has a balance of $" + balance);
  }
  catch (HighBalanceException high) {
    JOptionPane.showMessageDialog(null, "Customer #" + acctNum +
      " has a balance of $" + balance +
      " \nwhich is higher than the credit limit");
    }
    catch (NumberFormatException e) {
      JOptionPane.showMessageDialog(null, "Try again please");
    }
  }
}
