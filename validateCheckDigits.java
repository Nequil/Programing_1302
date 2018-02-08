import java.io.*;
import java.nio.*;
import java.nio.file.*;
import java.nio.channels.*;
import java.nio.file.StandardOpenOption.*;


public class validateCheckDigits{
  public static void main(String[] args) {
    Path fileIn = Paths.get("Accountnum.txt");
    Path fileOut = Paths.get("AcctNumsout.txt");
    String acct;
    int acctNum, digit, lastDigit, sum;
    InputStream input = null;
    OutputStream output = null;

    
    try {
      input = Files.newInputStream(fileIn);
        BufferedReader reader = new BufferedReader(new InputStreamReader(input));
        output = Files.newOutputStream(fileOut);
       acct = reader.readLine();
        while (acct != null) {
            sum = 0;
            acctNum = Integer.parseInt(acct);
            lastDigit = acctNum % 10;
            acctNum = acctNum / 10;

            for (int i = 0; i < acct.length(); i++ ) {
                digit = acctNum % 10;
                sum += digit;
                acctNum = acctNum / 10;
              }
          sum = sum %10;
          if(sum == lastDigit){
            System.out.println(acct + " is valid");
            acct = acct + "\n";
            byte [] data = acct.getBytes();
            output.write(data);
          } else
          System.out.println(acct + " Is not valid");
          acct = reader.readLine();
      }
      input.close();
      output.close();
    }
    catch (IOException e){
      System.out.println(e);
    }
  }
}
