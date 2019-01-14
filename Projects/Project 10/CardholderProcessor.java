import java.util.Arrays;
import java.io.FileNotFoundException;
import java.util.Scanner; 
import java.io.File;
/** 
 *
 *@Author: Jacob 
 *@Version: 11/16/18
 *
 *
 *Description: reading in the data file and
 *generating the monthly reports. 
 *
 *
**/

public class CardholderProcessor {

/** **/

   //Feilds
   private Cardholder[] cArray; 
   private String[] fileArray; 

/** **/

   // Constructor 
   public CardholderProcessor() {
   
      cArray = new Cardholder[0];
      fileArray = new String[0];
    
   
   }
   
   /** 
    *@return cArray
   **/
   
   public Cardholder[] getCardholdersArray() {
   
   
      return cArray; 
   }
   
   /** 
    *@return fileArray
    **/
    
   public String[] getInvalidRecordsArray() {
    
      return fileArray;
   }
   
   /** 
    *@param cObject for the cardholder Object
   **/
   
   public void addCardholder(Cardholder cObject) {
     
     
      
      cArray = Arrays.copyOf(cArray, 
               cArray.length + 1); // adds a space in the array
      
      cArray[cArray.length - 1] =  cObject; // adds at the end of the array
   
   }
   
   /** 
    *@param invalidRecord for the String Array
   **/
   
   public void addInvalidRecord(String invalidRecord) {
   
      fileArray = Arrays.copyOf(fileArray, 
               fileArray.length + 1);
               
       
      fileArray[fileArray.length - 1] =  invalidRecord;
   
   }
   
   /** 
    *@param fileNameIn to read in the file 
    *@throws FileNotFoundException UwU
   **/
   
   public void readCardholderFile(String fileNameIn) 
                                   throws FileNotFoundException {
   
      Cardholder sch = null;
      Scanner fileScan = new Scanner(new File(fileNameIn));
      
      String category, acctNumber, name = "";
      double prevBalance, payment = 0; 
      double[] newPurchase = {0}; 
      double purchase;
      //name = fileScan.nextLine(); 
      
      while (fileScan.hasNext()) {
      
         String line = fileScan.nextLine();
         Scanner scanLine = new Scanner(line).useDelimiter(";");
        // while (scanLine.hasNext()) {
            //scanLine.useDelimiter(";");
         category = scanLine.next();
         acctNumber = scanLine.next();
         name = scanLine.next();
         prevBalance = Double.parseDouble(scanLine.next());
         
         payment = Double.parseDouble(scanLine.next());
         
         
         if (category.equals("1")) {
         //switch (category.toUpperCase().charAt(0)) {
           // case '1':
            sch = new SapphireCardholder(acctNumber, name);
              // addCardholder(sch);
               //sch.setPrevBalance(prevBalance);
               //sch.setPayment(payment);
            while (scanLine.hasNext()) {
               
               purchase = Double.parseDouble((scanLine.next()));
               sch.addPurchases(purchase);
            }
               //break;
         }
            
         else if (category.equals("2")) {
           // case '2':
            sch = new DiamondCardholder(acctNumber, name);
               //addCardholder(sch);
               
            while (scanLine.hasNext()) {
               
               purchase = Double.parseDouble((scanLine.next()));
               sch.addPurchases(purchase);
            }
               //break;
         }
            
         else if (category.equals("3")) {
            //case '3':
            sch = new BlueDiamondCardholder(acctNumber, name);
               //addCardholder(sch);
               
            while (scanLine.hasNext()) {
               
               purchase = Double.parseDouble((scanLine.next()));
               sch.addPurchases(purchase);
            }
              // break;
         }
         else {   
            //default:
            addInvalidRecord(line);             
            continue;
         }
               //break;
         
         //}
         sch.setPrevBalance(prevBalance);
         sch.setPayment(payment);
         addCardholder(sch);
      }
    
      
   }

   /** 
    *Gerates a report unsorted.
    *@return output for the output 
   **/
   public String generateReport() {
   
      String output = "";
      output += "----------------------------";
      output += "\nMonthly Cardholder Report";
      output += "\n----------------------------";
     
      
     
      for (int i = 0; i < cArray.length; i++) {
         output += cArray[i ].toString() + "\n\n";
      }
   
      return output;
   } 
   
   /** 
    *Generates a report sorted by name.
    *@return output for the output 
   **/
   
   public String generateReportByName() {
   
      
      String output = "";
      output += "----------------------------";
      output += "\nMonthly Cardholder Report (by Name)";
      output += "\n----------------------------";
     
      Arrays.sort(cArray);
     
      for (Cardholder name : cArray) {
         output += "\n\n" + (name);
      }
   
      return output;
   
   
   }
   
   /** 
    *Generates a report sorted by vurrent balance.
    *@return output for the output 
   **/
   
   public String generateReportByCurrentBalance() {
   
      String output = "";
      output += "\n\n----------------------------";
      output += "\nMonthly Cardholder Report (by Current Balance)";
      output += "\n----------------------------";
     
      Arrays.sort(cArray, new CurrentBalanceComparator());
     
      for (Cardholder currentBalance : cArray) {
         output += "\n\n" + (currentBalance);
      }
   
      return output;
   
   }
   




}