import java.util.Comparator; 
/** 
 *
 *@Author: Jacob 
 *@Version: 11/16/18
 *
 *
 *Description: comparator file 
 *
**/

public class CurrentBalanceComparator implements Comparator<Cardholder> {

/** 
 *@param c1 for the first 
 *@param c2 for the second
 *@return 0
**/

   public int compare(Cardholder c1, Cardholder c2) {
   
      if (c1.currentBalance() < c2.currentBalance())
      {
         return -1;
      }
      else if (c1.currentBalance() > c2.currentBalance())
      {
         return 1;
      }
      else
      {
         return 0;
      }
   }
}