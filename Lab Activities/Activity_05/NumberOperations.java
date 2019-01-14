/**
 *@Author: Jacob Stockwell 
 *
 *@version: 10/1/18
 *
 *Decription: this program is used to create classes for number operations. 
 */
public class NumberOperations 
{

/**
 *@param args not used. 
 */

   private int number;
   
   //constructor
    /**
    *@param numberIn for getting the number in 
    */
   
   public NumberOperations(int numberIn)
   {
      number = numberIn; 
   }  
   
   
   //methods 
   
   /**
    *@return output for odds under 
    */
   public String oddsUnder()
   {
      String output = "";
      
      int i = 0; 
      while (i < number) {
         if (i % 2 != 0) {
            output += i + "\t";
         }
         i++;
      }
   
      return output;
   }
   
    /**
    *@return number to get value 
    */
  
   
   public int getValue()
   {
      int getNumber = number;
      
      return number; 
   }
   
    /**
    *@return output for power of two under 
    */
   
   public String powersTwoUnder()
   {
      String output = ""; 
      int powers = 1;
      
      while (powers < number) {
         output += powers + "\t"; //concanate the output 
         powers = powers * 2; // gets next power of two 
      
      }
      
      
      return output;
   }
   
    /**
    *@return compareNumber to coompare the numbers
    *@param compareNumber to compare the numbers 
    */
   
   public int isGreater(int compareNumber)
   {
      if (number > compareNumber) {
         return 1;
      }
      
      else if (number < compareNumber) {
         return -1; 
      }
      
      else {
         return 0; 
      }
      
   }
   
    /**
    *@return number string 
    */
   
   public String toString()
   {
   
   
      return number + "";
   }
   
}