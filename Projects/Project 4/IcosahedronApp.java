import java.util.Scanner;   
/**
 * @Author: Jacob Stockwell
 * @version: 09/21/18
 *
 * Description: This program is designed to create classes for 
 * the Isahedron App that stores the label, color and edge 
 */

public class IcosahedronApp
{
   /**
    *
    * @param args not used.
    */

   public static void main(String[] args)
   {
      //decloration for user input  
      String label, color;
      double edge = 0;  
      Scanner userInput = new Scanner(System.in);
      
      
      //input 
      System.out.print("Enter label, color, and edge" 
         + " length for an icosahedron.\n"
         + "\tlabel: ");
      label = userInput.nextLine();
     
      
      System.out.print("\tcolor: ");
      color = userInput.nextLine();
      
      System.out.print("\tedge: ");
      edge = userInput.nextDouble(); 
      
      if (edge <= 0)
      {
         System.out.println("Error: edge must be greater than 0.");
      
      }
      else
      {
         Icosahedron i = new Icosahedron(label, color, edge);
      
         System.out.println("\n" + i);
      
      }
   }
}