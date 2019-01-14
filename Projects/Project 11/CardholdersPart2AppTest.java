import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;


/** **/

public class CardholdersPart2AppTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   
   /** 
    *@throws FileNotFoundException UWU
   **/
   @Test public void cardholderpart2MainTest() 
                            throws FileNotFoundException {
   
      // // CardholdersPart2App cardPt2 = new CardholdersPart2App(); 
      // test constructor
      // String[] args = {"cardholder_data_1.txt"};
      // // CardholdersPart2App.main(args);
   // Assert.assertEquals(4, CardholderProcessor.getCardholdersArray().length);
   // // 
   
      CardholdersPart2App app = new CardholdersPart2App();
      String[] args1 = {};
      CardholdersPart2App.main(args1);
      Assert.assertEquals(0.011, Cardholder.INTEREST_RATE, 0.01);
   
   }
   
   /** The first test method. 
     *@throws FileNotFoundException UWU
     **/
   @Test public void part2AppTest1()
      throws FileNotFoundException {
      CardholdersPart2App app = new CardholdersPart2App();
      String[] args1 = {"cardholder_data_1.txt"};
      CardholdersPart2App.main(args1);
      Assert.assertEquals(0.011, Cardholder.INTEREST_RATE, 0.01);
   }
  
}
