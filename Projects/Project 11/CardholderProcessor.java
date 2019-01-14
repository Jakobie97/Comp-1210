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
   //private int fileArrayCount;

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
         
         
         category = scanLine.next();
         acctNumber = scanLine.next();
         name = scanLine.next();
      
         
         try {
            prevBalance = Double.parseDouble(scanLine.next());
         
            payment = Double.parseDouble(scanLine.next());
            if (category.equals("1")) {
            
               sch = new SapphireCardholder(acctNumber, name);
               while (scanLine.hasNext()) {
               
                  purchase = Double.parseDouble((scanLine.next()));
                  sch.addPurchases(purchase);
               }
              
            } 
            
            else if (category.equals("2")) {
            
               sch = new DiamondCardholder(acctNumber, name);
               
               
               while (scanLine.hasNext()) {
               
                  purchase = Double.parseDouble((scanLine.next()));
                  sch.addPurchases(purchase);
               }
               
            }
            
            else if (category.equals("3")) {
            
               sch = new BlueDiamondCardholder(acctNumber, name);
               
               
               while (scanLine.hasNext()) {
               
                  purchase = Double.parseDouble((scanLine.next()));
                  sch.addPurchases(purchase);
               }
             
            }
            else {   
               throw new InvalidCategoryException();
            }
               
         
         
            sch.setPrevBalance(prevBalance);
            sch.setPayment(payment);
            addCardholder(sch);
         
         } //try catch 
         catch (NumberFormatException e) {
         
            addInvalidRecord(line + " *** invalid numeric value ***");
         
         }
         
         catch (InvalidCategoryException e) {
         
            addInvalidRecord(line + " " + e.getMessage());
         }
      }
         //End of while loop 
      
   } // End of method -------------------------------------------------

   /** 
    *Gerates a report unsorted.
    *@return output for the output 
   **/
   public String generateReport() {
   
      String output = "";
      output += "----------------------------\n";
      output += "Monthly Cardholder Report\n";
      output += "----------------------------\n";
     
      
     
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
      output += "--------------------------------------\n";
      output += "Monthly Cardholder Report (by Name)\n";
      output += "--------------------------------------";
     
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
      output += "\n\n---------------------------------------\n";
      output += "Monthly Cardholder Report (by Current Balance)\n";
      output += "---------------------------------------";
     
      Arrays.sort(cArray, new CurrentBalanceComparator());
     
      for (Cardholder currentBalance : cArray) {
         output += "\n\n" + (currentBalance);
      }
   
      return output;
   
   }
   
   /** @return output for the output **/
   
   public String generateInvalidRecordsReport() {
   
      String output = "";
      output += "\n\n----------------------\n";
      output += "Invalid Records Report\n";
      output += "----------------------\n";
     
     
      for (int i = 0; i < fileArray.length; i++) {
         output += fileArray[i] + "\n\n";
      }
   
      return output;
   } 
   
   
   
   
   
   




}