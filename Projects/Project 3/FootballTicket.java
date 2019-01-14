import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;
/**
 *
 * @Author: Jacob Stockwell 
 * @version: 09/14/18
 *
 * Description: The purpose of this program is to accept coded 
 * football ticket information as
 * input that includes the ticket price, category, time, date, 
 * seat, row, section, followed by the
 * description of the game.
 */
 
public class FootballTicket
{

   static final double STUDENT_DISCOUNT = 0.67;
   static final double FACULTY_STAFF_DISCOUNT = 0.20;
/**
 *
 *@param args - Command line Arguments (not used).
 */
 
 
   public static void main(String[] args)
   {
   
   
      //Declaration of variables
      Scanner userInput = new Scanner(System.in);
      DecimalFormat fPrice = new DecimalFormat("$0.00");
      DecimalFormat fCost = new DecimalFormat("$0.00");
      DecimalFormat fRandom = new DecimalFormat("0000000");
      
      String ticketCode;
      String game;
      String month;
      String date;
      String year; 
      String time;
      String section; 
      String row;
      String seat;
      String price;
      String cost;
      
      
      
      
       
      
      Random generator = new Random();
      int randomNum1;
      randomNum1 = generator.nextInt(10000000 ) + 1;
    
    
      
      
      
      //prompt for user 
      System.out.print("Enter your ticket code: ");
      ticketCode = userInput.nextLine(); 
      ticketCode = ticketCode.trim();
      System.out.println();
      
      
      
      
      //error message 
      if (ticketCode.length() < 25)
      {
         
         System.out.println("Invalid Ticket Code.");
         System.out.println("Ticket code must have at least 25 characters.");
      }
      else
      {
      //grabbing data from input
         char catigory = ticketCode.charAt(0);
         
         price = ticketCode.substring(1, 4);
            
         cost = ticketCode.substring(1, 4);
         
         String hours = ticketCode.substring(6, 8);
         
         String minutes = ticketCode.substring(8, 10);
         
         month = ticketCode.substring(10, 12);
         
         date = ticketCode.substring(12, 14);
         
         year = ticketCode.substring(14, 18);
         
         seat = ticketCode.substring(18, 20);
         
         row = ticketCode.substring(20, 22);
         
         section = ticketCode.substring(23, 24);
         
         game = ticketCode.substring(24, 37);
         
         double priceDouble = Double.parseDouble(price);
         double costDouble = Double.parseDouble(cost);
         
         String dateString = month + "/" + date + "/" + year;
         String timeString = hours + ":" + minutes;
         
         //Student and Staff price calculation 
         if (catigory == ('s'))
         {
            /* 
            double priceDouble = Double.parseDouble(price);
            double costDouble = Double.parseDouble(cost);
            */
            costDouble = priceDouble - (priceDouble * STUDENT_DISCOUNT); 
            
               
         }
         else if (catigory == 'f')
         {
            //cost = price - (price * FACULTY_STAFF_DISCOUNT + 1);
            costDouble = priceDouble - (priceDouble * FACULTY_STAFF_DISCOUNT); 
            
         } 
         
      
      //output 
         System.out.println(("Game: " + game + "   Date: " 
            + dateString + "   Time: " + timeString));
         System.out.println("Section: " + section 
            + "   Row: " + row + "   Seat: " + seat);
            
         System.out.println("Price: " + fPrice.format(priceDouble) 
            + "   Category: " + catigory + "   Cost: " 
            + fCost.format(costDouble));
         System.out.println("Prize Number: " + fRandom.format(randomNum1));
      }
   }
}