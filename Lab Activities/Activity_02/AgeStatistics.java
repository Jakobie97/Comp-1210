import java.util.Scanner;

/**
 * @Author: Jacob Stockwell 
 * @version: 09/05/18
 *
 * Description: this program is designed to give stats on age.
  */
  

     
public class AgeStatistics 
{
    
   /**
   * 
   *@param args - Command line Arguments (not used).
   */

   
   public static void main(String[] args) 
   {
      //Declaring starting varriables for prompt  
      Scanner userInput = new Scanner(System.in);
      String name = "";
      int ageInYears = 0; 
      
      // 1 = female. 0 = male 
      int gender = 0;
      double maxHeartRate = 0;
      
      //Prompts the user for their name
      System.out.println("Enter your name: ");
      name = userInput.nextLine();
      
      //Prompts the user for their age 
      System.out.println("Enter your age in years: ");
      ageInYears = userInput.nextInt(); 
      
      //Prompts user to input their gender. 
      System.out.println("Enter your gender " 
         + "(1 for female and 0 for male): ");
      gender = userInput.nextInt();
      
      //---------------------------------------------------------
      //outputs 
      System.out.println("Enter your name: " + name);
      System.out.println("Enter your age in years: " + ageInYears);
      System.out.println("Enter your gender " 
         + "(1 for female and 0 for male): " + gender);
      
      
      //converts age into minutes 
      System.out.println("\tYour age in minutes is "
         + ageInYears * 525600 + " minutes.");
      
      //converts age in centuries 
      System.out.println("\tYour age in centuries is "
         + (double) ageInYears / 100 + " centuries.");
      
      //Sart of if Statement 
      if (gender == 1) { //Calculate Female MHR
         maxHeartRate = 209 - (0.7 * ageInYears);
      }
      else { // calculate Male MHR
         maxHeartRate = 214 - (0.8 * ageInYears);
      }
      //End of if statement 
      
      System.out.println("Your max heart rate is " 
         + maxHeartRate + " beats per minute.");
   
   }
}