import java.io.FileNotFoundException;
/**
 *
 *@Author: Jacob Stockwell
 *@version: 12/5/18
 *
 *
 *Description: This is the Driver file for project 11
 *
 *
 * 
 **/
 
public class CardholdersPart3App {
 
 /** @param args used**/
 
   public static void main(String[] args) {
   
      
      
      
      
      try {
         CardholderProcessor card = new CardholderProcessor();
                     
         if (args.length == 0) {
         
            System.out.println("File name expected as command line argument." 
                           + "\nProgram ending."); 
                          
            return;
         }
         else {
         
            String fileName = args[0];
         
         
            card.readCardholderFile(args[0]);
         
            System.out.print(card.generateReport());
            System.out.print(card.generateReportByName());
            System.out.print(card.generateReportByCurrentBalance());
            System.out.print(card.generateInvalidRecordsReport());
         }
      }
      catch (FileNotFoundException e) {
      
         System.out.println("*** Attempted to read file: " 
                           + e.getMessage());
      }
   
   }
}