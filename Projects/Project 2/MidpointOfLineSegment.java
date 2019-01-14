import java.util.Scanner; 
/**
 *
 * @Author: Jacob Stockwell
 * @Version: 09/07/18
 *
 * Description:This program determines the midpoint of a line 
 */
 
public class MidpointOfLineSegment
{
 /**
  *
  *@param args - Command line Arguments (not used).
  */
 
   public static void main(String[] args)
   {
   
   //decloration of inputs 
      Scanner userInput = new Scanner(System.in);
      double inputX1, inputX2, inputY2 = 0;
      double inputY1 = 0;
    
    //prompt for the user 
      System.out.println("Enter the coordinates for endpoint 1:");
      System.out.print("\tx1 = "); 
      inputX1 = userInput.nextDouble();
      System.out.print("\ty1 = "); 
      inputY1 = userInput.nextDouble();
      
      System.out.println("Enter the coordinates for endpoint 2:");
      System.out.print("\tx2 = "); 
      inputX2 = userInput.nextDouble();
      System.out.print("\ty2 = "); 
      inputY2 = userInput.nextDouble();
      
    //midpint calculation 
      double newInputX = (inputX1 + inputX2) / 2;
      double newInputY = (inputY1 + inputY2) / 2;
      
    //ouput
      System.out.println();
      System.out.print("For endpoints " + "(" + inputX1 + ", " + inputY1 
         + ") and " + "(" + inputX2 + ", " + inputY2 + ")");
      System.out.print(", the midpoint is " 
         + "(" + newInputX + ", " + newInputY + ").");
    
    
    
    
   
   
   
   }
}