import java.util.*;
public class Test {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int number;
    try {

      System.out.println("Enter an integer");
      number = input.nextInt();
      System.out.println("You entered " + number);
    }
    catch (Exception e) {
     System.out.println("You entered an invalid number");
     System.out.println("Message: " + e.getMessage());

    }
  }
}
