import java.util.Arrays;
import java.text.DecimalFormat;
  /** 
 *
 *@Author: Jacob Stockwell 
 *@Version: 11/09/18
 *
 *
 *Description: This is the parent file for the Cardholder project 
 *
**/

public abstract class Cardholder {

//feilds 
   protected String category, acctNumber, name;
   protected double prevBalance, payment; 
   protected double[] purchase; 
   
   /** **/
   public static final double INTEREST_RATE = 0.01;
   
   
   /** 
    *@param acctNumberIn for the account number  
    *@param nameIn for the name 
   **/
   
   //constructor 
   public Cardholder(String acctNumberIn, String nameIn) {
      
      acctNumber = acctNumberIn; 
      name = nameIn;
      purchase = new double[0];
      
   }
   
   //methods 
   
   /** 
    *@return acctNumber for getting the account Number 
   **/
   public String getAcctNumber() {
   
      return acctNumber; 
   }
   
   /** 
    *@param acctNumberIn Setting the account number. 
   **/
   
   public void setAcctNumber(String acctNumberIn) {
   
      acctNumber = acctNumberIn; 
      
   }
   
   /** 
    *@return name for getting the name.
   **/
   
   public String getName() {
   
      return name; 
      
   }
   
   /** 
    *@param nameIn to set the name 
   **/
   
   public void setName(String nameIn) {
   
      name = nameIn; 
   }
   
   /** 
    *@return prevBalance to get the blance 
   **/
   
   public double getPrevBalance() {
   
   
      return prevBalance; 
   }
   
   /** 
    *@param prevBalanceIn to set the previous balance 
   **/
   
   public void setPrevBalance(double prevBalanceIn) {
   
      prevBalance = prevBalanceIn; 
   }
   
   /** 
    *@return payment to get the purchase 
   **/
   
   public double getPayment() {
   
      return payment; 
   }
   
   /** 
    *@param paymentIn to set the payment
   **/
   
   public void setPayment(double paymentIn) {
   
      payment = paymentIn; 
      
   }
   
   /** 
    *@return purchase to get the purchase
   **/
   
   public double[] getPurchases() {
   
      return purchase;
   }
   
   /** 
    *@param purchaseIn to set the purchase
   **/
   
   public void setPurchases(double[] purchaseIn) {
   
   
      purchase = purchaseIn;
   }
   
   /** 
    *@param purchaseIn for adding the purchase 
   **/
   
   public void addPurchases(double... purchaseIn) {
   
      for (int i = 0; i < purchaseIn.length; i++) {
      
         purchase = Arrays.copyOf(purchase, 
                  purchase.length + 1); //adds a space in the array 
         purchase[purchase.length - 1] = purchaseIn[i];
      }
   }
   
   /** 
    *@param purchaseIn for deleting the purchase 
   **/
   
   public void deletePurchases(double... purchaseIn) {
      
      
      for (int i = 0; i <= purchase.length; i++) { //goes through the array
         for (double a : purchaseIn) { //goes through the new array
         
            if (purchase[i] == a) { //checks to see if they are equal
               for (int b = 0; b + i < purchase.length - 1; i++) {
                  purchaseIn[b + i] = purchase[b + i + 1];
               }
               
               purchase = Arrays.copyOf(purchase, 
                           purchase.length - 1); //takes space away
            }
         }
      }
   }
   
   /**  
    *@return interest to get the cal
   **/
   
   public double interest() {
   
      double interest = (prevBalance - payment) * INTEREST_RATE;
   
      return interest; 
   } 
   
   /** 
    *@return sum to get total purchases
   **/
   
   public double totalPurchases() {
       
      double sum = 0; 
      
      for (double i : purchase) { 
      
         sum += i;
      }
      
      return sum;
   
   }
   
   /** 
    *@return balance to get balance with interest and purchases
   **/
   
   public double balance() {
      
      double balance = interest() + totalPurchases();
      return balance;
   
   }
   
   /** 
    *@return currentBalance to get current balance
   **/
   
   public double currentBalance() {
      
      
      double currentBalance = (prevBalance - payment + interest() 
                                           + totalPurchases());
      
      return currentBalance;
   }
   
   /** 
    *@return minPayment to get the minimum payment due 
   **/
   
   public double minPayment() {
   
      double minPayment = (currentBalance() * 0.03); 
      return minPayment; 
   
   }
   
   /**
     @return output for the output 
    **/
   
   public String toString() {
      // format dor dollar and purchase points
      DecimalFormat dfDollar = new DecimalFormat("$#,##0.00");
      DecimalFormat dfPoints = new DecimalFormat("#,##0");
      
      String output = category
                    + "\nAcctNo/Name: " + getAcctNumber() + " " + getName()
                    + "\nPrevious Balance: " + dfDollar.format(getPrevBalance())
                    + "\nPayment: " + "(" + dfDollar.format(getPayment()) + ")" 
                    + "\nInterest: " + dfDollar.format(interest()) 
                    + "\nNew Purchases: " + dfDollar.format(totalPurchases())
                    + "\nCurrent Balance: " + dfDollar.format(currentBalance())
                    + "\nMinimum Payment: " + dfDollar.format(minPayment())
                    + "\nPurchase Points: " + dfPoints.format(purchasePoints());
      
      
      
      return output;
   }
   
   /** 
    *@return purchasePoints to get purchase points 
   **/
   
   public abstract int purchasePoints();
    
   
}