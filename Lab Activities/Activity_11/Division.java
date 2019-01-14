/**
 *
 *
 *@Author: Jacob Stockwell
 *@Version" 11/26/18
 *
 *Description: This program is the 2 divsion methods 
 *
 *
 **/
 
public class Division {
 
 
   //fields 
   
   //methods
   
   /** 
    *@param nume for the numerator 
    *@param denom for the denominator 
    *
    *@return result for the result 
   **/
   
   public static int intDivide(int nume, int denom) {
      
      try {
      
         int result = (nume / denom); 
         return result; 
      }
      
      
      catch (ArithmeticException e) {
         return 0;
      }
   
   } 
   
   /** 
    *
    *@param nume for the numerator 
    *@param denom for the denominator 
    *
    *@return 0
   **/
  
   public static double decimalDivide(int nume, int denom) {
   
      if (denom == 0) {
         throw new IllegalArgumentException("The denominator "
            + "cannot be zero.");
      }
   
      return (double) nume / denom;
   }
 
 
 
 
 
}