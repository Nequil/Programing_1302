import javax.swing.*;
public class Test extends GradeException{
  public static void main(String[] args) throws GradeException{
    int count = 0;
    int [] id = {1,2,3,4,5,6,7,8,9,10};
    String [] input = new String[10];
    String lettercount, output;
      for (int i = 0; i < id.length; i++)
      input[i] = JOptionPane.showInputDialog(null, "Enter a letter grade for the ID number: "+id[i]);
      try{
        for (int i = 0; i < GradeException.validOptions.length; i++){
          validOptions[i] = lettercount;
          if(input[i] != lettercount)
          count++;
          if(count = 6){
          throw GradeException();
          input[i] = "I";  
          count = 0;
        }
        }
      }
      catch(GradeException e){
        JOptionPane.showMessageDialog(null, "You have enterered an invalid letter please try again!");
        
      }
      for(int i = 0; i < input.length; i++ )
      output = output + "ID# "+ id[i] + " score "+ input[i] + "\n";
      JOptionPane.showMessageDialog(null, output);

  }
}
