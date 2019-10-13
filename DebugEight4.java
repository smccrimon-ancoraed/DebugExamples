// DebugEight4.java
// Allows user to enter a series of words
// and displays them in reverse order
import javax.swing.*;
public class DebugEight4
{
   public static void main(String[] args)
   {
      int x = 0, y;
      String array[] = new String[100];
      String entry;
      final String STOP = "XXX";
      StringBuffer message = 
          StringBuffer("The words in reverse order are\n");
     
      entry = JOptionPane.showInputDialog(null,
        "Enter any word\n" +
        "Enter " + STOP + " when you want to stop"); 
      while(!(entry.equals(stop)))
      {
         array[x] = entry;
         ++x;
         entry = JOptionPane.showInputDialog(null,
           "Enter another word\n" +
           "Enter " STOP " when you want to stop"); 
      }
      for(y = x; y > 0; --y)
      {
         message.append(array[x]);
         message.append("\n");
      }
      JOptionPane.showMessageDialog(null, message);
   }
}

