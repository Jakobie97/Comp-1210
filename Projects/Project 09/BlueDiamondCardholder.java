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
   
   public void setbonusPurchasePoints(int bonusPurchasePointsIn) {
   
      bonusPurchasePoints = bonusPurchasePointsIn;  
   }
   
   /** *
    *@return purchasePoints for 5 times the points 
   */
   
   public int purchasePoints() {
   
      return (int) (5 * totalPurchases());
   
   }
   
   /** 
     *@return ""
   **/
   
   public String toString() {
   
   
      return super.toString() + " ";
   }
   
   
}