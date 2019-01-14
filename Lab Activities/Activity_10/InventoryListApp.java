/** 
 *
 *@Author: Jacob Stockwell 
 *@Version: 11/12/18
 *
 *Description: This is the Driver java file for Activity 10.
 *
 *
**/

public class InventoryListApp {

   /** 
    *@param args used
   **/
   public static void main(String[] args) {
      
      ItemsList myItems = new ItemsList();
      
      InventoryItem.setTaxRate(0.05);
      
      myItems.addItem(new ElectronicsItem("laptop", 1234.56, 10));
      myItems.addItem(new InventoryItem("motor oil", 9.80));
      myItems.addItem(new OnlineBook("All Things Java", 12.30));
      myItems.addItem(new OnlineArticle("Useful Acronyms", 3.40));
      
      System.out.println(myItems.toString());
      System.out.println("Total: " + myItems.calculateTotal(2.0));
   
   }
}