/**
 *
 * @Author: Jacob Stockwell
 * @version: 09/17/18
 *
 * Description: This program is designed to create classes to 
 * display user info
 */
 
public class UserInfo 
{
 /**
  *
  * @param args not used 
  * 
  */
 
   // instance variables 
   private String firstName; 
   private String lastName;
   private String location; 
   private int age = 0;
   private int status = 0; 
  
   
   //constructor 
   private static final int OFFLINE = 0, ONLINE = 1;
   
   
   
   /**
    * templete for creating a new user.
     
    * @param firstNameIn gets user first name
    * @param lastNameIn gets user last name 
    * This should include full name 
    */
   public UserInfo(String firstNameIn, String lastNameIn)
   {
      firstName = firstNameIn;
      lastName = lastNameIn; 
      
      location = "Not specified";
      age = 0;
      status = OFFLINE; 
   
   
   
   }
   
   //methods
   /**
    * @return output of the user info
    *
    */
   
   public String toString() 
   {
      String output = "Name: " + firstName + " " 
         + lastName + "\n";
      
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      if (status == OFFLINE)
      {
         output += "Offline";
      
      }
      else 
      {
         output += "Online";
      
      }
      
      return output;  
   }
   
   /**
    * 
    * @param locationIn the users new location 
    */
   
   public void setLocation(String locationIn) 
   {
      location = locationIn;
   
   
   }
   
   /**
    * @param ageIn sets the users age to a new int  
    * @return isSet that the new age is set 
    */
   
   public boolean setAge(int ageIn) 
   {
      boolean isSet = false; 
      if (ageIn > 0) 
      {
         age = ageIn; 
         isSet = true; 
      
      }
      return isSet; 
   }
   
   /**
    * @return age upon request  
    *
    */
   
   public int getAge() 
   {
   
      int getAge = age;
      return age; 
   }
   
   /**
    * @return location of the user
    *
    */
   
   public String getLocation()
   {
      
      return location; 
   } 
   
   /**
    *  
    *
    */
   
   public void logOff() 
   {
      status = OFFLINE; 
   }
   
   /**
    * 
    *
    */
   
   public void logOn()
   {
      status = ONLINE; 
   }
}
