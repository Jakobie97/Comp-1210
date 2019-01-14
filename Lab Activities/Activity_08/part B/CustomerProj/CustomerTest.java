import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/** **/

public class CustomerTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /** Set Location Test 1. **/
   
   @Test public void setLocationTest1() {
   
      Customer c = new Customer("Stockwell, Jacob");
      c.setLocation("Austin, TX");
      Assert.assertEquals("Austin, TX", c.getLocation());
   
   
   }  
   
   /** Set Location Test 2. **/
   
   @Test public void setLocationTest2() {
   
      Customer c = new Customer("Stockwell, Jacob");
      c.setLocation("Tampa, FL");
      Assert.assertEquals("Tampa, FL", c.getLocation());
   
   
   }  
   
   /** Change Balance test.  **/
   
   @Test public void changeBalanceTest() {
      
      Customer c = new Customer("Stockwell, Jacob");
      c.changeBalance(100);
      Assert.assertEquals(100, c.getBalance(), 0.000001);
   
   }
   
   /** toString test. **/
   
   @Test public void toStringTest() {
   
      Customer c = new Customer("Stockwell, Jacob");
      c.setLocation("Seattle, WA");
      c.changeBalance(999);
      Assert.assertEquals("Stockwell, Jacob\nSeattle, WA\n$999.0", 
         c.toString());
   
   }
   
   /** compareTo test 1. **/
   
   @Test public void compareToTest1() {
   
      Customer c1 = new Customer("Stockwell, Jacob");
      c1.changeBalance(500);
      
      Customer c2 = new Customer("Bond, James");
      c2.changeBalance(500);
      
      Assert.assertTrue(c1.compareTo(c2) == 0);
   
   
   }
   
   /** compareTo test 2. **/
   
   @Test public void compareToTest2() {
   
      Customer c1 = new Customer("Stockwell, Jacob");
      c1.changeBalance(100);
      
      Customer c2 = new Customer("Bond, James");
      c2.changeBalance(500);
      
      Assert.assertTrue(c1.compareTo(c2) < 0);
   
   
   }
   
   /** compareTo test 3. **/
   
   @Test public void compareToTest3() {
   
      Customer c1 = new Customer("Stockwell, Jacob");
      c1.changeBalance(1000);
      
      Customer c2 = new Customer("Bond, James");
      c2.changeBalance(500);
      
      Assert.assertTrue(c1.compareTo(c2) > 0);
   
   
   }
}
