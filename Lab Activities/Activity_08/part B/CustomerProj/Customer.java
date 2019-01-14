/**
 *
 *@Author: Jacob Stockwell 
 *@version: 10/29/18
 *
 *Decription: this program is designed for written methods 
 *obtaing info about a customer.
 */
 
 
public class Customer 
{
 
   private String customerName;
   private String customerLocation;
   private double customerBalance;
 
 /** 
  *@param nameIn to get customer name 
  * 
 **/
 
   public Customer(String nameIn)
   {
   
      customerName = nameIn; // sets the name 
      customerLocation = ""; // sets the location 
      customerBalance = 0; // sets balance to 0
   
   }
   
   /** 
    *
    *@param locationIn sor setting the location 
   **/
 
   public void setLocation(String locationIn)
   {
      customerLocation = locationIn;
   
      
   } 
   
   /** 
    *
    *@param amount for changing the balance 
    *
   **/
 
   public void changeBalance(double amount)
   {
   
      customerBalance += amount; 
   }
   
   /** 
    *
    *@return output fot geting the location string
   **/
   
   public String getLocation() 
   {
      String output = customerLocation;
      
      return output; 
   }
   
   /** 
    *@return CustomerBalance to see the balance 
   **/
   
   public double getBalance()
   {
   
   
   
      return customerBalance;
   }
   
   /** 
    *@param city for setting the city
    *@param state for setting the state
   **/
   
   public void setLocation(String city, String state) 
   {
      customerLocation = city + ", " + state;
   
   
   }
   
   /** 
    *toString Method.
    *@return output  
    *
   **/
   
   public String toString() 
   {
      String output = customerName + "\n"
                     + customerLocation + "\n"
                     + "$" + customerBalance; 
      
      return output;
   
   }
   
   /** 
    *@param obj for customer object
    *@return obj for object 
   **/
   
   public int compareTo(Customer obj) 
   {
   
      if (Math.abs(this.customerBalance - obj.getBalance()) < 0.000001) {
      
         return 0; // they are equal 
      }
      else if (this.customerBalance < obj.getBalance()) {
         return -1; // negative  
      }
      else {
      
         return 1; // positive 
      }
   
   
   }
 
 
 
 
}
