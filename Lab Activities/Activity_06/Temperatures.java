import java.util.ArrayList;
/**
 *
 *@Author: Jacob Stockwell 
 *@version: 10/08/18
 *
 *Description: creating classes that give information on the weather 
 */
 
public class Temperatures {
 
   /**
    *@param args not used 
    */  
    
    //feild 
   private ArrayList<Integer> temperatures;
   
   //constructor
   /**
    *@param temperaturesIn to get temps in 
    */ 
   public Temperatures(ArrayList<Integer> temperaturesIn) {
      
      temperatures = temperaturesIn;
   } 
   
   //methods 
   
   /**
    *@return low to get the low temp
    */  
   public int getLowTemp()
   {
      if (temperatures.isEmpty()) {
         return 0; 
      }  
      
      int low = temperatures.get(0);
      for (int i = 1; i < temperatures.size(); i++)
      {
         if (temperatures.get(i) < low) {
         
            low = temperatures.get(i);
         }
      }
      
      
      return low;
   }
   
   /**
    *@return high to get high temp    
    */
   
   public int getHighTemp() 
   {
      if (temperatures.isEmpty()) {
         return 0; 
      }  
      
      int high = temperatures.get(0);
      for (Integer temp : temperatures)
      {
         if (temp > high) {
         
            high = temp;
         }
      }
      
      
      return high;
   }
   
   /**
    *@param lowIn to input the low 
    *@return lowIn to get the minimum lower temp 
    */
   
   public int lowerMinimum(int lowIn) 
   {
   
      return lowIn < getLowTemp() ? lowIn : getLowTemp(); 
   } 
   
    /**
    *@param highIn to input the low 
    *@return highIn to get the maximum high temp 
    */
   
   public int higherMaximum(int highIn)
   {
   
   
      return highIn > getHighTemp() ? highIn : getHighTemp();
   }
   
   /**
    *@return String output 
    */
 
   public String toString()
   {
   
      return "\tTemperatures: " + temperatures 
         + "\n\tLow: " + getLowTemp() 
         + "\n\tHigh: " + getHighTemp();
   }
}