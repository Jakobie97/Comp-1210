  /** 
 *
 *@Author: Jacob Stockwell 
 *@Version: 11/09/18
 *
 *
 *Description: This is the Child file for the Cardholder project 
 *
**/

public class DiamondCardholder extends Cardholder {

   //feilds 
   protected double discountRate = 0.05;
   
   /** 
    *@param acctNumberIn for the account number  
    *@param nameIn for the name 
   **/
   
   //constructor 
   public DiamondCardholder(String acctNumberIn, String nameIn) {
      
      //from parent 
      super(acctNumberIn, nameIn);
      category = "Diamond Cardholder";
   }
   
   //methods 
   
   /** 
    *@return discountRate for getting the discount 
   **/
   
   public double getDiscountRate() {
   
      return discountRate; 
   
   }
   
   /** 
    *@param discountRateIn to set the discount 
   **/
   
   public void setDiscountRate(double discountRateIn) {
   
      discountRate = discountRateIn;
   
   }
   
   /** 
    *@return purchasePoints for points times 3
   **/
   
   public int purchasePoints() {
   
      return (int) (3 * totalPurchases());
   
   }
   
   /** 
    *@return numberOfPurchases for the number of purchases
   **/
   public double totalPurchases() {
   
      double numberOfPurchases = purchase.length;
      
      return numberOfPurchases;
   
   }
   
   /** 
    *@return ""
   **/
   public String toString() {
   
      return ""; 
   }
}