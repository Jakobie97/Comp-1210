public class NumberOperations 
{

   private int number;
   
   public NumberOperations(int numberIn)
   {
      number = numberIn; 
   }  
   
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
   
   public int getValue()
   {
      int getNumber = number;
      
      return number; 
   }
   
   public String powerTwoUnder()
   {
      String output = ""; 
      int powers = 1;
      
      while (powers < number){
         output += powers + "\t"; //concanate the output 
         powers = powers * 2; // gets next power of two 
      
      }
      
      
      return output;
   }
   
   public String powersTwoUnder()
   {
      //String output;
      
      
      return ""; 
   }
   
   public int isGreater(int compareNumber)
   {
      if (number > compareNumber){
         return 1;
      }
      
      else if (number < compareNumber){
         return -1; 
      }
      
      else {
         return 0; 
      }
      
   }
   
   public String toString()
   {
   
   
      return number + "";
   }
   
}