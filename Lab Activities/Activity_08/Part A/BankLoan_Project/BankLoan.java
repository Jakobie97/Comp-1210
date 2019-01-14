/**
 *@Author: Jacob Stockwell
 *@version: 10/22/18
 *
 *
 *Description: this program is designed to cal bank loan
 */


public class BankLoan {
	// constant fields
   private static final int MAX_LOAN_AMOUNT = 100000;
   private static int loansCreated = 0;

   // instance variables (can be used within the class)
   private String customerName;
   private double balance, interestRate;
   
   /**
    *@param customerNameIn for customerName
    *@param interestRateIn for interest rate 
    */

   public BankLoan(String customerNameIn, double interestRateIn) { 
      customerName = customerNameIn;
      interestRate = interestRateIn;
      balance = 0;
      loansCreated++; 
   }
   
   /**
    *@return wasLoanMade to check to see if loan was made
    *@param amount for the amount 
    */

   public boolean borrowFromBank(double amount) {
      
      boolean wasLoanMade = false;
      
      if (balance + amount < MAX_LOAN_AMOUNT) {
         wasLoanMade = true;
         balance += amount;
      }
   
      return wasLoanMade;
   }
   
   /**
    *@param amountPaid to see if amount was paid
    *@return newBalance for the new balance
    */

   public double payBank(double amountPaid) {
      double newBalance = balance - amountPaid;
      if (newBalance < 0) {
         balance = 0;
         // paid too much, return the overcharge
         return Math.abs(newBalance);
      }
      else {
         balance = newBalance;
         return 0;
      }
   }
   
   /**
    *@return balance to get balance
    */
   
   public double getBalance() {
      return balance;
   }
   
   /**
    *@param interestRateIn for the interest
    *@return interestRate
    */
   
   public boolean setInterestRate(double interestRateIn) {
   
      if (interestRateIn >= 0 && interestRateIn <= 1) {
         interestRate = interestRateIn;
         return true;
      }
      else {
         return false;
      }
   }
   
   /**
    *@return interestRate
    */
   
   public double getInterestRate() {
      return interestRate;
   }
   
   /**
    *
    */
   
   public void chargeInterest() {
      balance = balance * (1 + interestRate);
   }
   
   /**
    *@return output
    */
   
   public String toString() {
      String output = "Name: " + customerName + "\r\n" 
         + "Interest rate: " + interestRate + "%\r\n" 
         + "Balance: $" + balance + "\r\n";
      return output;
   }
   
   //------------------------------------------------
      // Activity 08A Methods Start
      
   /**
    *@param amount for the amount 
    *@return amount for the amount 
    */
   
   public static boolean isAmountValid(double amount)
   {
      if (amount >= 0) {
         return true;
      }
   
      return false; 
   }
   
   /**
    *@param loan for the loan 
    *@return loan for the loan 
    */
   
   public static boolean isInDebt(BankLoan loan) 
   {
      if (loan.getBalance() > 0) {
         return true;
      
      }
      return false;
   
   }
   
   /**
    *@return loansCReated
    */
   
   public static int getLoansCreated() 
   {
   
      return loansCreated; 
   }
   
   /**
    *@return loansCreated
    */
   
   public static int resetLoansCreated()
   {
      int reset = 0;
      loansCreated = reset;
      
      return loansCreated;   
   
   }
}
