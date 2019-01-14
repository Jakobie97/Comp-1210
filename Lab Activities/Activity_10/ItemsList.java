/** 
 *
 *@Author: Jacob Stockwell 
 *@Version: 11/12/18
 *
 *Description: This is the java file for Activity 10.
 *
 *
**/

public class ItemsList {
   
   //feilds
   private InventoryItem[] inventory;
   private int count;
   
   /** **/
   
  //constructor 
   public ItemsList() {
      inventory = new InventoryItem[20];
      count = 0;
   }
  
  //Methods 
  
  /** 
   *@param itemIn fot items in 
  **/
   public void addItem(InventoryItem itemIn) {
   
      inventory[count] = itemIn;
      count++;
   
   }
  
  /** 
   *@return total for the total
   *@param electronicSurcharge for the surcharge
  **/
   public double calculateTotal(double electronicSurcharge) {
   
      double total = 0;
      for (int i = 0; i < count; i++) {
         if (inventory[i] instanceof ElectronicsItem) {
            total += inventory[i].calculateCost() + electronicSurcharge;
         }
         
         else {
         
            total += inventory[i].calculateCost();
         }
      
      }
      
   
      return total;
   }
   
   /** 
    *@return output for toString
   **/
   
   public String toString() {
   
      String output = "All inventory: \n\n";
      
      for (int i = 0; i < count; i++) {
         
         output += inventory[i] + "\n"; 
      
      }
      
      return output; 
   
   }
}