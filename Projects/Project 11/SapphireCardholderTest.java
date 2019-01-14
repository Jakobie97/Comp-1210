import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/** **/
public class SapphireCardholderTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /** All the getter and setters test. **/
   @Test public void saphiresSettersTest() {
      
      SapphireCardholder sc = new SapphireCardholder("10001", "Smith, Sam");
      
      
      double[] purchase1 = {34.5, 100.0, 63.50, 350.0};
      sc.setPurchases(purchase1);
      
      sc.setPrevBalance(1200.0);
      sc.setPayment(200);
     
      
      
                        
      Assert.assertArrayEquals("Add Purchases Test", purchase1, 
                        sc.getPurchases(), .0001);
                        
      Assert.assertEquals("getAcctNumber Test", "10001", sc.getAcctNumber());
      Assert.assertEquals("getName Test ", "Smith, Sam", sc.getName());
      Assert.assertEquals("getPrevBalance Test", 
                        1200.0, sc.getPrevBalance(), .0001);
      Assert.assertEquals("getPayment Test", 200, sc.getPayment(), .0001);
     
      
      sc.setAcctNumber("12345");
      Assert.assertEquals("setAcctNumber Test", "12345", sc.getAcctNumber());
      
      sc.setName("Stockwell, Jacob"); 
      Assert.assertEquals("setName Test", "Stockwell, Jacob", sc.getName());
      
   
   }
   
   /** Adds a purchase to the array.  **/
   
   @Test public void addPuchasesTest() {
   
      SapphireCardholder sc = new SapphireCardholder("10001", "Smith, Sam");
      
      double[] purchase1 = {34.5, 100.0, 63.50, 350.0};
      
      double[] purchase2 = {34.5, 100.0, 63.50, 350.0, 9.0, 10.0};
   
      sc.addPurchases(34.5, 100.0, 63.50, 350.0, 9.0, 10.0);
               
      Assert.assertArrayEquals("Add Purchases Test", 
                        purchase2, purchase2, .0001);
      
   }
   
   /** Delete purchase test. **/
   
   @Test public void deletePurchaseTest() {
   
      SapphireCardholder sc = new SapphireCardholder("10001", "Smith, Sam");
      double[] purchase1 = {34.5, 100.0, 63.50, 350.0};
      
      double[] purchase2 = {34.5, 100.0, 63.50, 350.0, 9.0, 10.0};
   
      sc.addPurchases(34.5, 100.0, 63.50, 350.0, 9.0, 10.0);
      sc.deletePurchases(10.0);
      
      Assert.assertArrayEquals("Delete purchases test", 
                                 purchase1, purchase1, .0001);
   
   
   }
   
   /** calculate interest test. **/
   @Test public void interestTest() {
      SapphireCardholder sc = new SapphireCardholder("10001", "Smith, Sam");
      double[] purchase1 = {34.5, 100.0, 63.50, 350.0};
      sc.setPurchases(purchase1);
      
      sc.setPrevBalance(1200.0);
      sc.setPayment(200);
      
      Assert.assertEquals("Interest test", 10, sc.interest(), .0001);
      
            
   }
   
   /** Total Purchase Test. **/
   @Test public void totalPurchaseTest() {
   
      SapphireCardholder sc = new SapphireCardholder("10001", "Smith, Sam");
      double[] purchase1 = {34.5, 100.0, 63.50, 350.0};
      sc.setPurchases(purchase1);
      
      sc.setPrevBalance(1200.0);
      sc.setPayment(200);
      
      Assert.assertEquals("Total purchase test", 548, 
                              sc.totalPurchases(), .0001);
      
   }
   
   
   /** Calculate current balance Test. **/
   @Test public void currentBalanceTest() {
   
      SapphireCardholder sc = new SapphireCardholder("10001", "Smith, Sam");
      double[] purchase1 = {34.5, 100.0, 63.50, 350.0};
      sc.setPurchases(purchase1);
      
      sc.setPrevBalance(1200.0);
      sc.setPayment(200);
      
      Assert.assertEquals("current balance test", 1558, 
                              sc.currentBalance(), .0001);
      Assert.assertEquals("balance test", 558, sc.balance(), .0001);
   
   }
   
   /** Minimum payment Test. **/
   
   @Test public void minPaymentTest() {
   
      SapphireCardholder sc = new SapphireCardholder("10001", "Smith, Sam");
      double[] purchase1 = {34.5, 100.0, 63.50, 350.0};
      sc.setPurchases(purchase1);
      
      sc.setPrevBalance(1200.0);
      sc.setPayment(200);
      
      Assert.assertEquals("minPayment Test", 46.74, sc.minPayment(), .0001);
      
   }
   
   /** toString Test.   **/
   @Test public void toStringTest() {
   
   
      SapphireCardholder sc = new SapphireCardholder("10001", "Smith, Sam");
      double[] purchase1 = {34.5, 100.0, 63.50, 350.0};
      sc.setPurchases(purchase1);
      
      sc.setPrevBalance(1200.0);
      sc.setPayment(200);
      
      Assert.assertEquals("toString Test", 
                                     "Sapphire Cardholder" 
                                     + "\nAcctNo/Name: 10001 Smith, Sam" 
                                     + "\nPrevious Balance: $1,200.00"
                                     + "\nPayment: ($200.00)"
                                     + "\nInterest: $10.00"
                                     + "\nNew Purchases: $548.00"
                                     + "\nCurrent Balance: $1,558.00"
                                     + "\nMinimum Payment: $46.74"
                                     + "\nPurchase Points: 548",
                                     sc.toString());
   
   
   }
}
