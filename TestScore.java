import javax.swing.*;
public class TestScore {
  public static void main(String[] args) throws IllegalArgumentException {
    int [] id = {10,11,12,13,14,15};
    int [] score = new int[6];
    String input = "", output = "", scoreString;

    for (int i = 0; i < id.length; i++){
      input = JOptionPane.showInputDialog(null, "Enter a test score for id number" + id[i]);
      try{
      score[i] = Integer.parseInt(input);
      if (score[i] < 0 || score[i] > 100)
        throw new IllegalArgumentException();
      }
      catch(NumberFormatException e){
          JOptionPane.showMessageDialog(null, "You entered " + input + " invalid number!"+
          "\nScore is set to zero");
          score[i] = 0;
        }
        catch(IllegalArgumentException e){
            JOptionPane.showMessageDialog(null, "You entered " + score[i] + " Which is outside range of 0 - 100 \nScore is set to zero)");
            score[i] = 0;
          }


    }
    for(int i = 0; i < score.length; i++)
    output = output + "ID# "+ id[i] + " score "+ score[i] + "\n";
    JOptionPane.showMessageDialog(null, output);
  }
}
