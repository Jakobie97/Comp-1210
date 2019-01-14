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
   */
 
   // instance variables 
   private String firstName; 
   private String lastName;
   private String location; 
   private int age = 0;
   private int status = 0; 
  
   
   //constructor 
   private static final int OFFLINE = 0, ONLINE = 1;
   
   //methods
   public UserInfo(String firstNameIn, String lastNameIn)
   {
      firstName = firstNameIn;
      lastName = lastNameIn; 
      
      location = "Not Specified";
      age = 0;
      status = OFFLINE; 
   
   
   
   }
   
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
   
   public void setLocation(String locationIn) 
   {
      location = locationIn;
   
   
   }
   
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
   
   public int getAge() 
   {
   
      int getAge = age;
      return age; 
   }
   
   public String getLocation()
   {
      String getLocation = location;
      
      return location; 
   } 
   
   public void logOff() 
   {
      status = OFFLINE; 
   }
   
   public void logOn()
   {
      status = ONLINE; 
   }
}
