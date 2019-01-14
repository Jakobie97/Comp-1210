import java.util.Scanner; 
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 *
 *@Author: Jacob Stockwell 
 *@version: 10/05/18
 *
 *Description: this program is designed to drive both of the icosahedron information 
 */
   
public class IcosahedronListApp 
{

   /**
    *
    *@param args not used 
    *@throws FileNotFoundException for file 
    */

   public static void main(String [] args) throws FileNotFoundException
   {
      
      ArrayList<Icosahedron> myList = new ArrayList<Icosahedron>();
   
      Scanner userInput = new Scanner(System.in);
      System.out.print("Enter file name: ");
      String fileName = userInput.nextLine();
      
      Scanner scanFile = new Scanner(new File(fileName));
      
      String newIcosahedronListName = scanFile.nextLine();
      System.out.println();
      
      while (scanFile.hasNext()) {
      
         String label = scanFile.nextLine();
         String color = scanFile.nextLine();
         String tempEdge = scanFile.nextLine();
         
         double edge = Double.parseDouble(tempEdge);
         
         Icosahedron i = new Icosahedron(label, color, edge);
         myList.add(i);           
      }
      scanFile.close();
      
      IcosahedronList myIcosahedronList = 
         new IcosahedronList(newIcosahedronListName, myList);
   
      System.out.println(myIcosahedronList);
      System.out.println();
      System.out.println();
      
      System.out.println(myIcosahedronList.summaryInfo());  
   
   }
}