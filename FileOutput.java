import java.io.*;
import java.util.*;
public class FileOutput {
  public static void main(String[ ] args) throws IOException{
    String name;
    int grade = 0;
    PrintWriter listOut = new PrintWriter("List.txt");
    Scanner input = new Scanner(System.in);
    System.out.println("Tpe in the name of your student");
    name = input.nextLine();
    listOut.println(name);
     for(int i = 0; i < 3; i++){
      System.out.println("Type in grade " + (i+1));
      grade = input.nextInt();
    listOut.println(grade);
    }

    
    listOut.close( );
  }
}
