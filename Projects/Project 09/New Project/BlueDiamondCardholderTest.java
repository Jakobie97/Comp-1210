import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/** **/
public class BlueDiamondCardholderTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** All getter and setter Test.**/
   @Test public void allGettersTest() {
   
      BlueDiamondCardholder bdc = 
                  new BlueDiamondCardholder("10003", "King, Kelly");
      bdc.addPurchases(34.5, 100.0, 63.50, 300.0, 100.0);
      bdc.setPrevBalance(1200.0);
      
      
      Assert.assertEquals("Get Bonus points test", 2500, 
                           bdc.getBonusPurchasePoints(), .0001);
      
      bdc.setBonusPurchasePoints(3000);
      Assert.assertEquals("Get Bonus points test", 3000, 
                           bdc.getBonusPurchasePoints(), .0001);
   
   }
   
   /** Purchase Points Test.**/
   @Test public void purchasePointsTest() {
   
      BlueDiamondCardholder bdc = 
                     new BlueDiamondCardholder("10003", "King, Kelly");
                     
      bdc.addPurchases(34.5, 100.0, 63.50, 300.0, 100.0);
      bdc.setPrevBalance(1200.0);
      
      Assert.assertEquals("Purchase Points Test", 1614, 
                     bdc.purchasePoints(), .0001);
   
   }
   
   /** toString Test.   **/
   @Test public void toStringTest() {
   
   
      BlueDiamondCardholder bdc = 
                    new BlueDiamondCardholder("10003", "King, Kelly");
      bdc.addPurchases(34.5, 100.0, 63.50, 300.0, 100.0);
      bdc.setPrevBalance(1200.0);
      
      Assert.assertEquals("toString Test", 
                                     "Blue Diamond Cardholder"
                                     + "\nAcctNo/Name: 10003 King, Kelly" 
                                     + "\nPrevious Balance: $1,200.00"
                                     + "\nPayment: ($0.00)"
                                     + "\nInterest: $12.00"
                                     + "\nNew Purchases: $538.20"
                                     + "\nCurrent Balance: $1,750.20"
                                     + "\nMinimum Payment: $52.51"
                                     + "\nPurchase Points: 1,614"
                  + "\n(includes 10.0% discount rate applied to New Purchases)",
                                     bdc.toString());
   
      BlueDiamondCardholder bdc2 = 
                  new BlueDiamondCardholder("10004", "Jenkins, Jordan");
      bdc2.addPurchases(5000.0, 1000.0, 4000.0);
      bdc2.setPrevBalance(1200.0);
      
      Assert.assertEquals("toString if Test",
                           "Blue Diamond Cardholder"
                                     + "\nAcctNo/Name: 10004 Jenkins, Jordan" 
                                     + "\nPrevious Balance: $1,200.00"
                                     + "\nPayment: ($0.00)"
                                     + "\nInterest: $12.00"
                                     + "\nNew Purchases: $9,000.00"
                                     + "\nCurrent Balance: $10,212.00"
                                     + "\nMinimum Payment: $306.36"
                                     + "\nPurchase Points: 29,500"
                  + "\n(includes 10.0% discount rate applied to New Purchases)"
                  + "\n(includes 2,500 bonus points added to Purchase Points)",
                                     bdc2.toString());
      
      
   }
}
