/**
 *@author: Jacob Stockwell
 *@version: 10/15/18
 *
 *Description: This program is designed create a class 
 *called Scores that will hold an array of numerical values and
 *provide methods that allow users to interact with the Scores class
 */
 
public class Scores {
 
   /**
    *@param args not used 
    */
   private int [] numbers;
   
   /**
    *@param numbersIn for numbers 
    */
    
    //constructor 
   
   public Scores(int[] numbersIn)
   {
      numbers = numbersIn;
      
   }
   
   //methods------------------------------ 
   
   /**
    *@return evens for getting even numbers
    */
   
   public int [] findEvens() 
   {
      int numberEvens = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            numberEvens++; 
         }
      }
      
      int [] evens = new int[numberEvens];
      
      int count = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            evens[count] = numbers[i];
            count++;
         }
      }
   
      return evens;
   }
   
   /**
    *@return odds to get aall the odds 
    */
   
   public int [] findOdds() 
   {
      int numberOdds = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 1) {
            numberOdds++; 
         }
      }
      
      int [] odds = new int[numberOdds];
   
      int count = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 1) {
            odds[count] = numbers[i];
            count++;
         }
      }
   
      return odds; 
   }
   
   /**
    *@return sum numbers.length to get average
    */
   
   public double calculateAverage() 
   {
      int sum = 0;
      for (int i = 0; i < numbers.length; i++) {
         sum +=  numbers[i];
      }
      return sum / numbers.length; 
   }
   
   /**
    *@return result to print the result
    */
   
   public String toString()
   {
      String result = "";
     
      for (int i = 0; i < numbers.length; i++) {
         result += numbers[i] + "\t";
      
      }
     
      return result;
   }
   
   /**
    *@return result to print the result
    */
   
   public String toStringInReverse()
   {
      String result = "";
      
      for (int i = numbers.length - 1; i >= 0; i--) {
         result += numbers[i] + "\t"; 
      }
   
      return result; 
   }
}