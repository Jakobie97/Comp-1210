import javax.swing.JOptionPane;
/**
 *
 *
 *@Author: Jacob Stockwell
 *@Version" 11/26/18
 *
 *Description: This program is the driver for the 2 divsion methods 
 *
 *
 **/
 
public class DivisionDriver {
 
 /** @param args not used**/
 
   public static void main(String[] args) {
   
      //dialog box 
      
      String numInput = JOptionPane.showInputDialog("Enter the numerator: ");
      String denomInput = JOptionPane.showInputDialog(
                                                   "Enter the denominator: ");
      
      try {
         int num = Integer.parseInt(numInput);
         int denom = Integer.parseInt(denomInput);
      
         String result = "Integer division: \n"
                     + Division.intDivide(num, denom)
                     + "\n\n Floating point division: \n"
                     + Division.decimalDivide(num, denom);
      
      
         JOptionPane.showMessageDialog(null, result, 
            "result", JOptionPane.PLAIN_MESSAGE);
      }
      catch (NumberFormatException e) {
      
         JOptionPane.showMessageDialog(null, 
            "Invalid input: enter numerical integer value only.",
            "Error", JOptionPane.ERROR_MESSAGE);
      
      }
      catch (IllegalArgumentException e) {
         
         JOptionPane.showMessageDialog(null, 
            e, "Error", JOptionPane.ERROR_MESSAGE);
      
      }
   
   }
}