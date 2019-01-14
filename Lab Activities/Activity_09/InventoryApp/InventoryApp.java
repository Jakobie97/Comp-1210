/**
*
*@Author: Jacob Stockwell 
*@version: 11/05/18
*
*
*Description: This program is the Driver inventory for avtivity 9.
**/


public class InventoryApp {

    /** args not used. 
      @param args yoooo
    **/

   public static void main(String[] args) {
      
      //set tax 
      InventoryItem.setTaxRate(0.05);
      
      //creating objects
      InventoryItem item1 = new InventoryItem("Oil change kit", 39);
      
      ElectronicsItem item2 = new ElectronicsItem("Cordless phone", 80, 1.8);
      
      OnlineArticle item3 = new OnlineArticle("Java News", 8.50);
      item3.setWordCount(700);
      
      OnlineBook item4 = new OnlineBook("Java for noobs", 13.37);
      item4.setAuthor("L. G. Jones");
      
      //output
      System.out.println(item1);
      System.out.println(item2);
      System.out.println(item3);
      System.out.println(item4);
      
   }

}