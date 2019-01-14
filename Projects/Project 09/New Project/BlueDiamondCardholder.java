
/** 
 *
 *@Author: Jacob Stockwell 
 *@Version: 11/09/18
 *
 *
 *Description: This is the Child file for the Cardholder project 
 *
**/

public class BlueDiamondCardholder extends DiamondCardholder {

   //fields 
   protected int bonusPurchasePoints = 2500;
   
   /** 
    *@param acctNumberIn for the account number  
    *@param nameIn for the name 
   **/
   
   //constructor 
   public BlueDiamondCardholder(String acctNumberIn, String nameIn) {
   
      super(acctNumberIn, nameIn);
      category = "Blue Diamond Cardholder";
      discountRate = 0.10;
   }
   
   //methods 
   
   /** 
    *@return bonusPurchasePoints to get the bonus points 
   **/
  
   public int getBonusPurchasePoints() {
   
      return bonusPurchasePoints;
   }
   
   /** 
    *@param bonusPurchasePointsIn for setting the purchase points
   **/
   
   public void setBonusPurchasePoints(int bonusPurchasePointsIn) {
   
      bonusPurchasePoints = bonusPurchasePointsIn;  
   }
   
   /** *
    *@return purchasePoints for 5 times the points 
   */
   
   public int purchasePoints() {
   
      int purchaseP =  (int) (totalPurchases()) * 3;
      if (totalPurchases() > 2500) {
         return purchaseP + bonusPurchasePoints;
      }
      return purchaseP;
   }
   
   /** 
     *@return ""
   **/
   
   public String toString() {
   
      if (totalPurchases() > 2500) {
         return super.toString() 
                  + "\n(includes 2,500 bonus points added to Purchase Points)";
      }
      else {
         return super.toString();
      } 
         
   }
   
   
}