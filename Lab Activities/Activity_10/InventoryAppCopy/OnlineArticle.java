/**
 *
 *@Author: Jacob Stockwell 
 *@version: 11/05/18
 *
 *
 *Description: This program is the child for Online Article 
 *inventory for avtivity 9.
 **/
 
 /** **/ 
 
public class OnlineArticle extends OnlineTextItem {
   
   //feilds 
   private int wordCount;
   
   /** 
      @param nameIn for the name 
      @param priceIn for the price
      
   
   **/
   
   //constructor 
   public OnlineArticle(String nameIn, double priceIn) {
   
      super(nameIn, priceIn); 
      wordCount = 0;
   }
   
   /** @param wordCountIn for the wordcount**/
   
   //Methods 
   public void setWordCount(int wordCountIn) {
   
      wordCount = wordCountIn;
   }
 
}