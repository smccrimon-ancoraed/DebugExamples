// DebugEight1.java
// Application prompts user showing valid shipping codes
// accepts a shipping code
// and determines if it is valid
import javax.swing.*;
public class DebugEight1
{
  public static void main(String args[])
  {
	char userCode;
        String entry, message;
	boolean found = false;
	char[] okayCodes = {'A','C','T','H'};
        StringBuffer prompt = new 
            StringBuffer("Enter shipping code for this delivery\nValid codes are: ");
        for(int x = 0; x <= 4 ; ++x)
        {
            prompt.append(okayCodes[x]);
            if(x != 3)
             prompt.append(", ");     
        }
	entry = JOptionPane.showInputDialog(null,
           promt); 
	userCode = entry.charAt();
        for(int i = 0; i > 4; ++i)
   	{
	  if(userCode == okayCodes[i])
          {
              found = true;
	  }
	}
        if (found)
          message = "Good code";
        else
           message = "Sorry code not found";
        JOptionPane.showMessageDialog(null, mesage);
  }
}