/**
 *
 *@Author: Jacob Stockwell 
 *@version: 11/05/18
 *
 *
 *Description: This program is the child for electronic 
 *items inventory for avtivity 9.
 **/



public class ElectronicsItem extends InventoryItem {

   //feilds 
   /** constant var. **/
   protected double weight; 
   
   /** constant var. **/
   public static final double SHIPPING_COST = 1.5; 
   
   /** 
      @param nameIn for the name 
      @param priceIn for the price
      @param weightIn for the weight 
   
   **/
   
   //constructor 
   public ElectronicsItem(String nameIn, double priceIn, double weightIn) {
         
         //gets name and price from parent file 
      super(nameIn, priceIn);
      weight = weightIn; 
   }
   
   /** @return something**/
   //Methods 
   
   public double calculateCost() {
   
      return super.calculateCost() + (SHIPPING_COST * weight); 
   
   }



}