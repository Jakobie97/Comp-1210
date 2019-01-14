/**
 *
 * @Author: Jacob Stockwell
 * @version: 09/17/18
 *
 * Description: This program is designed to create classes to 
 * display user info
 */
public class UserInfoDriver 
{
/**
 *
 * @param args not used 
 */

   public static void main(String [] args)
   {
      UserInfo user1 = new UserInfo("Pat", "Doe");
      System.out.println("\n" + user1);
      user1.setLocation("Auburn");
      user1.setAge(19);
      user1.logOn();
      System.out.println("\n" + user1);
      
      UserInfo user2 = new UserInfo("Sam", "Jones");
      System.out.println("\n" + user2);
      user2.setLocation("Atlanta");
      user2.setAge(21);
      user2.logOn();
      System.out.println("\n" + user2);
   
   }
}