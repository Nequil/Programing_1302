import javax.swing.*;
import java.io.*;
import java.nio.file.*;

public class GameWithPassword{
  public static void main(String[] args) {
    Path file = Paths.get("username.txt");
    String userid, password, line, delim = ",";
    String [] array = new String[2];
    boolean okToPlay = false;
    int guess, results, attempts = 1;
    String msg;
    userid = JOptionPane.showInputDialog(null, "Please enter your user ID");
    password = JOptionPane.showInputDialog(null, "Please enter your password");

    try{
      InputStream input = new BufferedInputStream(Files.newInputStream(file));
      BufferedReader reader = new BufferedReader(new InputStreamReader(input));
      line = reader.readLine();
      while(line != null){
        array = line.split(delim);
        if(array[0].equals(userid) && array[1].equals(password)){
          okToPlay = true;
          System.out.println("You have loged in");
        }else
          System.out.println("You have entered the wrong information");
        line = reader.readLine();

      }
      reader.close();
    }
    catch(Exception e){
      System.out.println("Message: " + e);
    }

    if(!okToPlay){
      JOptionPane.showMessageDialog(null, "Sorry - your ID or password was invalid");

    }else {
      results = (int) (Math.random() * 100) + 1;
      try{
      guess = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter a number from 1 to 100"));

      while(guess != results){
        if(guess < results)
          msg = "Your guess was to low";
        else
          msg = "Your guess was to high";

        guess = Integer.parseInt(JOptionPane.showInputDialog(null,msg + " Guess again! (enter a number from 1 to 100)"));
          attempts ++;

      }
      JOptionPane.showMessageDialog(null, "Correct! you got it in " + attempts + " trys");


      }
      catch(NumberFormatException e){
        System.out.println("Not a number" + e);
      }

    }


  }
}
