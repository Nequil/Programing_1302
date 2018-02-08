import javax.swing.*;
public class GradeException extends Exception{
  public static String [] validOptions = {"A", "B", "C", "D", "F", "I"};
  public GradeException(){
  super("You have entered and invalid letter and ID is set to i");
   }
}
