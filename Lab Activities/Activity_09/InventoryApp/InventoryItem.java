/**
 *
 *@Author: Jacob Stockwell 
 *@version: 11/05/18
 *
 *
 *Description: This program is the parent for Item inventory for avtivity 9.
 **/
 
public class InventoryItem {
 
 //fields
   protected String name;
   protected double price;
   private static double taxRate = 0;

   /**
      @param nameIn for the name 
      @param priceIn for price
    **/

   //constructor 
   public InventoryItem(String nameIn, double priceIn) {
   
   
      name = nameIn;
      price = priceIn; 
   
   }
   
   /** @return name for name.**/
   
   //methods 
   public String getName() {
   
      return name;
   }
   
   /** @return newPrice for price.**/
   public double calculateCost() {
   
      double newPrice = price * (1 + taxRate); 
      return newPrice;
   }
   
   /** sets tax rate. 
       @param taxRateIn for the tax rate
    **/ 
   
   public static void setTaxRate(double taxRateIn) {
   
      taxRate = taxRateIn;
   }
   
   /** @return name for toString.**/
   
   public String toString() {
   
      return name + ": $" + calculateCost(); 
   }
   
}