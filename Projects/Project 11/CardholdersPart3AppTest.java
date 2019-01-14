import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/** **/
public class CardholdersPart3AppTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /** Test for all of cardholder part 3.**/
   
   @Test public void part3MainTest() {
   
      CardholdersPart3App app = new CardholdersPart3App();
      String[] args1 = {"cardholder_data_3_exceptions.txt"};
      CardholdersPart3App.main(args1);
      Assert.assertEquals(0.011, Cardholder.INTEREST_RATE, 0.01);
      
      CardholdersPart3App app2 = new CardholdersPart3App();
      String[] args2 = {};
      CardholdersPart3App.main(args2);
      Assert.assertEquals(0.011, Cardholder.INTEREST_RATE, 0.01);
   
   }
   
}
