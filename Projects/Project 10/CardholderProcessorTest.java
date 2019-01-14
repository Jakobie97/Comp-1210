import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;
//import java.util.Arrays;

/** 
 *
 *@Author: Jacob Stockwell 
 *@Version: 11/16/18
 *
**/


public class CardholderProcessorTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /** All Getters and setters test.**/
   
   @Test public void allGettersAndSettersTest() {
   
      CardholderProcessor card = new CardholderProcessor();
      SapphireCardholder sch = new SapphireCardholder("10001", "Smith, Sam");
      DiamondCardholder dch = new DiamondCardholder("10002", "Jones, Pat"); 
      BlueDiamondCardholder bdch = 
                        new BlueDiamondCardholder("10003", "King, Kelly"); 
      
      card.addCardholder(sch);
      card.addCardholder(dch);
      card.addCardholder(bdch);
      
      Cardholder[] cardList = new Cardholder[3];
      cardList[0] = sch;
      cardList[1] = dch;
      cardList[2] = bdch; 
      
      Assert.assertArrayEquals(cardList, card.getCardholdersArray());
      
      /** getInvalidRecordsArray Test **/
      
      String invalid = new String("Test");
      card.addInvalidRecord(invalid);
      String[] invalidRecords = new String[1];
      invalidRecords[0] = invalid;
      
      Assert.assertArrayEquals(invalidRecords, card.getInvalidRecordsArray());
      
   
      
      
   }
   
   /** ReadFile method test. 
     *@throws FileNotFoundException uWu
   **/
   
   @Test public void readCardholderFileTest() throws FileNotFoundException {
   
   
      CardholderProcessor card = new CardholderProcessor();
      card.readCardholderFile("cardholder_data_1.txt");
      Assert.assertEquals(4, card.ge  ().length);
   
   
   
   
   }
   
   /** All Report Tests.
     *@throws FileNotFoundException uWu
   **/ 
   @Test public void allReportsTest() throws FileNotFoundException {
   
      CardholderProcessor card = new CardholderProcessor();
      card.readCardholderFile("cardholder_data_1.txt");
      Assert.assertTrue(card.generateReport().contains(
                              "Monthly Cardholder Report"));
      Assert.assertTrue(card.generateReportByName().contains(
                              "Monthly Cardholder Report (by Name)"));
      Assert.assertTrue(card.generateReportByCurrentBalance().contains(
                             "Monthly Cardholder Report (by Current Balance)"));
   
   
   }
}