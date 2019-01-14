import java.util.Scanner;
/**
 *
 * @Author: Jacob Stockwell
 * @version: 09/07/18
 *
 * Description: this program takes senconds and turns it 
 *               into other time measurements 
 */ 
 
public class TimeConverter 
{
 
    /** 
     * @param args - Command line Arguments (not used).
     */
   public static void main(String[] args)
   {
   
      //decloration for user input
      int seconds = 0;
      Scanner userInput = new Scanner(System.in);
      
      //prompt for user 
      System.out.print("Enter the raw time measurement in seconds: ");
      seconds = userInput.nextInt(); 
      if (seconds < 0)
      {
         System.out.println("Measurement must be non-negative!");
      }
      else
      {
      
      //Time calculation 
         int minutes = (seconds % 3600) / 60; 
         int hours = (seconds % 86400) / 3600;
         int days = seconds / 86400;
         int newSeconds = seconds % 60;
      
      //output 
         System.out.println();
         System.out.println("Measurement by combined " 
            + "days, hours, minutes, seconds:");
         System.out.println("\tdays: " + days);
         System.out.println("\thours: " + hours);
         System.out.println("\tminutes: " + minutes);
         System.out.println("\tseconds: " + newSeconds);
         System.out.println();
         System.out.println(seconds + " seconds = " 
            + days + " days, " + hours + " hours, " 
            + minutes + " minutes, " + newSeconds + " seconds");
      }
      
      
   
   
   
   }
}