// DebugSeven2.java
// Phone number conversion
// User enters 10 digitd, for example 8005551212
// Output is nicely formatted as (800) 555-1212
import javax.swing.*; 
public class DebugSeven2
{
  public static void main(String[] args) 
  {
     String inputString;
     String newString
     inputString = JOptionPane.showInputDialog(null,
         "Enter an area code and phone number" +
         "\nas a series of 10 digits" +
         "\nand I will display it in a nice format" +
         "\nEnter 999 to quit");
     while(inputString.equals("999"))
     {
        newString = "(" + inputString.substring(0,3) + ") " +
           inputString.substring(3,6) + "-" +
           inputString.substring(6, inputString.length());
        inputString = JOptionPane.showInputDialog(null,
         The number is " + newstring + 
         "\n\nEnter an area code and phone number" +
         "\nas a series of 10 digits" +
         "\nand I will display it in a nice format" +
         "\nEnter 999 to quit");
      
     }
  }
}