// Write a program that asks the user to enter the name of a file, and then asks the user to enter a character.
// The program should count and display the number of times that the specified character appears in the file.
// Be sure to include any exceptions needed for the program to run smoothly.

import java.util.*;
import java.io.*;
import java.nio.*;

class LetterCounter {

   public static void main (String [] args) throws IOException {
   
      char ch;
      char ch2;
      int counter = 0;
      boolean isSuccessful = false, isUpper = false;
      String fileName;
      Scanner user = new Scanner(System.in);
      
      while(!isSuccessful) {       
         try {
            System.out.println("Please enter the file name: ");
            fileName = user.nextLine();
            Scanner file = new Scanner(new File(fileName));
             
            System.out.println("Please enter the desired character or number :");
            ch = user.nextLine().charAt(0);
            
            if(Character.toUpperCase(ch) == ch) {
               isUpper = true;
            }
            ch = Character.toLowerCase(ch);
         
            while(file.hasNext()) {
               String line = file.nextLine().toLowerCase();
               for(int i = 0; i < line.length(); i++) {
                  ch2 = line.charAt(i);
                  if(ch2 == ch) {
                     counter++;
                  }   
               }
            }
            
            if(isUpper)
               System.out.println("You entered " + Character.toUpperCase(ch) + ", which was found " + counter + " time(s) in the file " + fileName);
            else
               System.out.println("You entered " + ch + ", which appears " + counter + " time(s) in the file " + fileName);
            
            isSuccessful = true;
            file.close();
         }
           catch(FileNotFoundException e) {
              System.out.println("File not found. Please try again");
           }
      }
   }
}