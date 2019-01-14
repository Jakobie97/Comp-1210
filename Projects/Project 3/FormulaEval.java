import java.util.Scanner; 
import java.text.DecimalFormat;
/**
 *
 * @Author: Jacob Stockwell 
 * @version: 09/14/18
 *
 * Description: This program evaluates a formula 
 */
 
public class FormulaEval 
{

/**
 *
 * @param args - Command line Arguments (not used). 
 */
   
   public static void main(String[] args)
   {
     //declaring x as a the dummy variable for the calculation and user input 
      Scanner userInput = new Scanner(System.in);
      double x = 0;
      
      //Prompt
      System.out.print("Enter a value for x: ");
      x = userInput.nextDouble();
     
     //calculating the formula 
      double topHalf = (1000 * x + Math.sqrt(Math.abs(3.9 * Math.pow(x, 5) 
         - Math.pow(x, 3) + 1))); 
         
      double bottomHalf = (((1.6 * Math.pow(x, 2) + 2.7 * x + 3.8)));
      double result = topHalf / bottomHalf;
      
      //coverting from double to string 
      String newResult = Double.toString(result);
      
      //decloration for rounding 
      DecimalFormat df = new DecimalFormat("#,##0.0####");
      String resultRound = df.format(result);
       
      
      
      //index calculation 
      int indexLeft = newResult.indexOf('.');
      int indexRight = newResult.length() - indexLeft - 1;
      
     
     //output 
      System.out.println("Result: " + result);
      System.out.println("# of characters to left of decimal point: " 
         + indexLeft);
         
      System.out.println("# of characters to right of decimal point: " 
         + indexRight);  
         
      System.out.println("Formatted Result: " + resultRound);
      
      
      
    
   }    
}