import java.io.FileNotFoundException;
/**
 *
 *@Author: Jacob Stockwell
 *@version: 11/16/18
 *
 *
 *Description: This is the Driver file for project 10
 *
 *
 * 
 **/
 
public class CardholdersPart2App {

  /** 
    *@param args used
    *@throws FileNotFoundException UwU
    **/
 
   public static void main(String[] args) throws FileNotFoundException {
   
   
      if (args.length == 0) { 
      
         System.out.print("File name expected as command line argument.");
         System.out.print("\nProgram ending.");
      }
      
      else {
      
         CardholderProcessor chp = new CardholderProcessor(); 
         chp.readCardholderFile(args[0]);
         System.out.print(chp.generateReport());
         System.out.print(chp.generateReportByName());
         System.out.print(chp.generateReportByCurrentBalance());
      
      }
   
   
   
   
   }
 
 
 
}