import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/** **/
public class DiamondCardholderTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** All getters and setters test.**/
   @Test public void allGettersTest() {
   
      DiamondCardholder dc = new DiamondCardholder("10001", "Smith, Sam");
      Assert.assertEquals("get DuscountRate Test", 0.05, 
                     dc.getDiscountRate(), .0001);
      
      dc.setDiscountRate(0.10);
      Assert.assertEquals("set DiscountRate test", 0.10, 
                     dc.getDiscountRate(), .0001);
      
      
   } 
   
   /** Total Purchase Test. **/
   
   @Test public void totalPurchaseTest() {
   
      DiamondCardholder dc = new DiamondCardholder("10002", "Jones, Pat");
      dc.addPurchases(34.5, 100.0, 63.50, 300.0);
      dc.setPrevBalance(1200.0);
      
      Assert.assertEquals("Total Purchase Test", 473.09999999999997, 
                           dc.totalPurchases(), .0001);
   }
   
   /** Diamond toString Test.**/
   
   @Test public void toStringTest() {
   
      DiamondCardholder dc = new DiamondCardholder("10002", "Jones, Pat");
      dc.addPurchases(34.5, 100.0, 63.50, 300.0);
      dc.setPrevBalance(1200.0);
   
      Assert.assertEquals("toString Test", 
                                     "Diamond Cardholder" 
                                     + "\nAcctNo/Name: 10002 Jones, Pat" 
                                     + "\nPrevious Balance: $1,200.00"
                                     + "\nPayment: ($0.00)"
                                     + "\nInterest: $12.00"
                                     + "\nNew Purchases: $473.10"
                                     + "\nCurrent Balance: $1,685.10"
                                     + "\nMinimum Payment: $50.55"
                                     + "\nPurchase Points: 1,419"
                 + "\n(includes 5.0% discount rate applied to New Purchases)",
                                     dc.toString());
   
   
   }
}
