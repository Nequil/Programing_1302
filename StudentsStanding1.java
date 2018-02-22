import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;
import java.util.*;

public class StudentsStanding1
{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Path good = Paths.get("GoodStanding.txt");
    Path probation = Paths.get("Probation.txt");
    Path deansList = Paths.get("DeansList.txt");
    String s = "";
    String t = "";
    String v = "";
    String delim = ",";
    int id;
    String firstName = "";
    String lastName = "";
    double gpa;
    final int STOP = 000;

    try
    {
      OutputStream outputGood = new BufferedOutputStream(Files.newOutputStream(good, CREATE));
      OutputStream outputProbation = new BufferedOutputStream(Files.newOutputStream(probation, CREATE));
      BufferedWriter writerGood = new BufferedWriter(new OutputStreamWriter(outputGood));
      BufferedWriter writerProbation = new BufferedWriter(new OutputStreamWriter(outputProbation));
      OutputStream outputDeansList = new BufferedOutputStream(Files.newOutputStream(deansList, CREATE));
      BufferedWriter writerDeansList = new BufferedWriter(new OutputStreamWriter(outputDeansList));
      System.out.print("Enter Student ID: ");
      id = scan.nextInt();
      while(id != STOP)
      {
        System.out.print("Enter Student's First Name: ");
        firstName = scan.nextLine();
        System.out.print("Enter Student's Last Name: ");
        lastName = scan.nextLine();
        System.out.print("Enter GPA: ");
        gpa = scan.nextDouble();
        s = id + delim + firstName + delim + lastName + delim + gpa;
        if (gpa >= 3.5)
        {
          writerDeansList.write(s, 0, s.length());
          writerDeansList.newLine();
          // writerDeansList.close();
        }

        if (gpa < 2.0)
        {
          writerProbation.write(s, 0, s.length());
          writerProbation.newLine();
          // writerProbation.close();
        } else {
          writerGood.write(s, 0, s.length());
          writerGood.newLine();
          // writerGood.close();
        }
        System.out.print("Enter next Student ID or enter " + STOP + " to end the program: ");
        id = scan.nextInt();
      }
      writerDeansList.close();
      writerProbation.close();
      writerGood.close();
    } catch (Exception e) {
      System.out.println("Message: " + e);
    }

    // Reading In Progress

    try
    {
      InputStream inputDeansList = Files.newInputStream(deansList);
      BufferedReader deansListReader = new BufferedReader(new InputStreamReader(inputDeansList));
      InputStream input = Files.newInputStream(good);
      BufferedReader reader = new BufferedReader(new InputStreamReader(input));
      t = deansListReader.readLine();
      System.out.println("Dean's List: ");
      while (t != null)
      {
        System.out.println(t);
        t = deansListReader.readLine();
      }
      deansListReader.close();
      v = reader.readLine();
      System.out.println("Students in Good Standing: ");
      while (v != null)
      {
        System.out.println(v);
        v = reader.readLine();
      }
    } catch (Exception e) {
      System.out.println("Message: " + e);
    }
  }
}
