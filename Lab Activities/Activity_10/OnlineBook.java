/**
 *
 *@Author: Jacob Stockwell 
 *@version: 11/05/18
 *
 *
 *Description: This program is the child for 
 *Online Book inventory for avtivity 9.
 **/
 
public class OnlineBook extends OnlineTextItem {
 
   //feilds 
   protected String author; 
   
   /** 
      @param nameIn for the name 
      @param priceIn for the price
   
   **/
   
   //contructor 
   public OnlineBook(String nameIn, double priceIn) {
   
      super(nameIn, priceIn); 
      author = "Author Not Listed";
   }
   
   /**@param authorIn for author **/
   
   //methods 
   public void setAuthor(String authorIn) {
   
      author = authorIn;
   
   }
   
   /** @return name for name
         
   **/
   
   public String toString() {
   
      return name + " - " + author + ": $" + price;
   }
 
}