import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class BlueDiamondCardholderTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** All getter and setter Test.**/
   @Test public void allGettersTest() {
   
      BlueDiamondCardholder bdc = new BlueDiamondCardholder("10003", "King, Kelly");
      bdc.addPurchases(34.5, 100.0, 63.50, 300.0, 100.0);
      bdc.setPrevBalance(1200.0);
      System.out.println(bdc + "\n"); 
   
   }
}
