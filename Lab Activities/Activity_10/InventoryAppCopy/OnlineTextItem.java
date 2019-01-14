/**
 *
 *@Author: Jacob Stockwell 
 *@version: 11/05/18
 *
 *
 *Description: This program is the child for Online text 
 *items inventory for avtivity 9.
 **/
 
 /** **/
 
public abstract class OnlineTextItem extends InventoryItem {

/** 
      @param nameIn for the name 
      @param priceIn for the price
   
   **/
 
   public OnlineTextItem(String nameIn, double priceIn) {
   
      super(nameIn, priceIn);
   
   }
   
   /** @return price for price  **/
   
   public double calculateCost() {
   
      return price; 
   }
 
}