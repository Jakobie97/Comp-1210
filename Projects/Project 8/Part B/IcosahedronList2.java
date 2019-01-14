import java.text.DecimalFormat;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner; 

/**
 *
 *@Author: Jacob Stockwell 
 *@version: 10/19/18
 *
 * Description: This program is designed to create array list 
 * and class for the Icosahedron 
 */


public class IcosahedronList2 
{
   /**
    *
    *@param args nout used 
    *@param myList is string for something 
    *@param icosahedronArray for the array list 
    */

   //feilds 
   // Problem 1
   // There should be only 2 flieds in this project
   private String myList = "";
   private Icosahedron[] iList; 
   private int numberOfIcosahedrons;

   /**
    *@param myListIn to innput my list 
    *@param iListIn for list
    *@param numberOfIcosahedronsIn for the number of Icosahedrons
    */
   //constructor 
   public IcosahedronList2(String myListIn, Icosahedron[] iListIn,
                           int numberOfIcosahedronsIn)
   {
      myList = myListIn;
      iList = iListIn;
      numberOfIcosahedrons = numberOfIcosahedronsIn;
   }
   
   /**
    * Getter of list name.
    *@return myList to get name 
    */
   
   //methods 
   public String getName()
   {
      return myList;    
         
   }
   
   /**
    *@return numberOfIcosahedrons for the number of Icosahedrons in iList 
    */
   
   public int numberOfIcosahedrons() 
   {
      
      return numberOfIcosahedrons;
   
   }
   
   /**
    *@return sa for the surface area
    */
   
   public double totalSurfaceArea()
   {
      int index = 0; 
      double sa = 0;
      while (index < numberOfIcosahedrons) {
         
         sa += iList[index].surfaceArea();
         index++; 
      }
   
      return sa;
   }
   
   /**
    *@return vol to get the volume
    */
   
   public double totalVolume()
   {
      int index = 0; 
      double vol = 0.0;
      while (index < numberOfIcosahedrons) {
      
         vol += iList[index].volume();
         index++; 
      }
   
      return vol; 
   } 
   
   /**
    *@return totalSurfaceArea to get all of the surface area 
    */
   
   public double averageSurfaceArea()
   {
      if (numberOfIcosahedrons == 0) {
         return 0;
      }
      return totalSurfaceArea() / numberOfIcosahedrons;
   }
   
   /**
    *@return totalVolume to get all the volume 
    */
   
   public double averageVolume() 
   {
      if (numberOfIcosahedrons == 0) {
         return 0;
      }
      return totalVolume() / numberOfIcosahedrons;
   }
   
   /**
    *@return surfToVol 
    */
   
   public double averageSurfaceToVolumeRatio() 
   { 
      double surfToVol = 0;
      if (numberOfIcosahedrons != 0)
      {
         int index = 0;
      
         while (index < numberOfIcosahedrons) {
         
            surfToVol += iList[index].surfaceToVolumeRatio();
            index++; 
         }
         
         return surfToVol / numberOfIcosahedrons;
      }
      
      return 0;
   }  
   
   /**
    *@return ouput for the output 
    */
   
   public String toString() 
   {
      String output = myList + "\n";
      int n = numberOfIcosahedrons; 
      
      for (int i = 0; i < n; i++) {
         output += "\n" + iList[i] + "\n";
      }
   
   
      return output; 
   } 
   
   /**
    *@return output to see output 
    */
   
   public String summaryInfo()
   {
      String output = ""; 
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      output += "----- Summary for " + myList + " -----\n";
      output += "Number of Icosahedrons: " + numberOfIcosahedrons();
      output += "\nTotal Surface Area: " 
         + df.format(totalSurfaceArea());
      output += "\nTotal Volume: " + df.format(totalVolume()); 
      output += "\nAverage Surface Area: " + df.format(averageSurfaceArea()); 
      output += "\nAverage Volume: " + df.format(averageVolume());
      output += "\nAverage Surface/Volume Ratio: "
         + df.format(averageSurfaceToVolumeRatio()); 
      
   
      return output; 
   }
   
   //----------------------------------------
      //Start of project 6 & 7 methodes 
      
      
 /**
     *
     *@return getList the array list.
     */
   
  
   public Icosahedron[] getList()
   {
      return iList;
   }
   
      
  /**  
   * Reads in Icosahedron data from file and creates a 
   * TriangleList object.
   *
   *@param fileNameIn to read
   *@return iL 
   *@throws FileNotFoundException if the file cannot be opened.
   param label for the label
   */  
      
   public IcosahedronList2 readFile(String fileNameIn)
                            throws FileNotFoundException {
   
      Scanner userInput = new Scanner(System.in);
      Icosahedron[] myListIn = new Icosahedron[20];
      String iListName = "";
      int numIcosahedrons = 0;
              
      Scanner scanFile = new Scanner(new File(fileNameIn));
      
      String newIcosahedronListName = scanFile.nextLine();
      
      while (scanFile.hasNext()) {
      
         String labelIn = scanFile.nextLine();
         String colorIn = scanFile.nextLine();
         double edgeIn = Double.parseDouble(scanFile.nextLine());
         Icosahedron i = new Icosahedron(labelIn, colorIn, edgeIn);
         myListIn[numIcosahedrons] = i;
         numIcosahedrons++;           
      }
      scanFile.close();
      
      IcosahedronList2 iL = 
         new IcosahedronList2(newIcosahedronListName, 
                                    myListIn, numIcosahedrons);   
      return iL; 
   
   }
   
   /**
    *Adds Icosahedrons object to the list.
    *@param label for label in 
    *@param color for color in
    *@param edge for edge in
    */
   
   public void addIcosahedron(String label, String color, double edge) {
       
      Icosahedron i = new Icosahedron(label, color, edge);
      iList[numberOfIcosahedrons] = i;
      numberOfIcosahedrons++;
      
   }
   
   
   /**
    *@return null
    *@param labelIn for the label
    */
   
   public Icosahedron findIcosahedron(String labelIn)
   {
      Icosahedron result = null;
      for (int i = 0; i < numberOfIcosahedrons; i++) {
         if (iList[i].getLabel().equalsIgnoreCase(labelIn)) {
            result = iList[i];
            break;
         }
      }
      return result;
   }
   
   /**
    * Deletes Icosahedrons.
    * 
    *@param labelIn 
    *@return result
    */
   
   public Icosahedron deleteIcosahedron(String labelIn) {
      
      Icosahedron result = null;
      int index = -1;
      
      for (int i = 0; i < numberOfIcosahedrons; i++) 
      {
         if (iList[i].getLabel().equalsIgnoreCase(labelIn)) {
            for (int j = i; j < numberOfIcosahedrons; j++) {
               result = iList[i];
               index = i;
               break;
            }
            if (result != null) 
            {
               for (i = index; i < numberOfIcosahedrons - 1; i++) {
                  iList[i] = iList[i + 1];
               }
               iList[numberOfIcosahedrons - 1] = null;
               numberOfIcosahedrons--;
            }
         }
         
      }
         
      return result;
   }
   
   /**
    *@return resultIcos for the edit
    *@param label for label 
    *@param color for color 
    *@param edge for edge
    */
   
   public boolean editIcosahedron(String label, String color, double edge) {
      label = label.trim();
      color = color.trim();
      Icosahedron getListIn = findIcosahedron(label);
      
      if (getListIn != null) {
      
         getListIn.setColor(color);
         getListIn.setEdge(edge);
         return true;
      }
      return false;
   }
   
   //----------------------------------------------------------------------------
   // Start of Project 08B
   
   /** **/
   
   public double findIcosahedronWithSmallestEdge() {
   
   
      if (numberOfIcosahedron <= 0) {
         return null;
      }
      
      double smallest = iList[0].Edge();
      int index = 0;
      while (index < numberOfIcosahedrons) {
         if (!(smallest < iList[index].getEdge())) {
            smallest = tList[index].getEdge();
         }
         index++;  
      }   
      
      return smallest;
   }
   
   /** **/
   
   public double findIcosahedronWithLongestEdge() {
   
   
      return 0;
   }
   
   /** **/
   
   public double findIcosahedronWithSmallestVolume() {
   
   
   
      return 0;
   }
   
   /** **/
   
   public double findIcosahedronWithLargestVolume() {
   
      return 0;
   }

}