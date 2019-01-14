/** 
 *
 *@Author: Jacob Stockwell 
 *@Version: 11/09/18
 *
 *
 *Description: This is the child of the cardHolder file for the 
 *Cardholder project 
 *
**/

public class SapphireCardholder extends Cardholder {

   //constuctor 
   
   /** 
    *@param acctNumberIn for the account number  
    *@param nameIn for the name 
   **/
   public SapphireCardholder(String acctNumberIn, String nameIn) {
      
      // gets param from the parent
      super(acctNumberIn, nameIn); 
      category = "Saphire Cardholder";
   }
   
   /** 
    *@return bpurchasePoints to get purchase points 
   **/
   
   //methods 
   public int purchasePoints() {
   
      int purchaseP = (int) this.totalPurchases();
   
      return purchaseP;
   }
   
   
   
   

}