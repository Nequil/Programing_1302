import javax.swing.*;
public class SqrtException{
  public static void main(String[] args)
    throws ArithmeticException{
      double num = 0, results = 0;
      String input = "";

      try {
        input = JOptionPane.showInputDialog(null, "Enter a number");
        num = Integer.parseInt(input);
        if (num < 0)
          throw new ArithmeticException();
        results = Math.sqrt(num);

      JOptionPane.showMessageDialog(null, "Square root of " +num+ " is " + results);
    }
    catch(ArithmeticException e){
      JOptionPane.showMessageDialog(null, "You entered "+num+ "\n" + "Can't take a the square root of a negative number");
    }
    catch(NumberFormatException e){
        JOptionPane.showMessageDialog(null, "You entered " + input + " invalid number!");
      }
    }
  }
