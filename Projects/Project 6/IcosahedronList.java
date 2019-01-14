import java.util.ArrayList;
import java.text.DecimalFormat;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner; 

/**
 *
 *@Author: Jacob Stockwell 
 *@version: 10/05/18
 *
 * Description: This program is designed to create array list 
 * and class for the Icosahedron 
 */


public class IcosahedronList 
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
   
   private ArrayList<Icosahedron> icosahedronArray = 
      new ArrayList<Icosahedron>();
      
   // getList should be a method that returns the icosahedron array.
   //private ArrayList<Icosahedron> getList = 
     // new ArrayList<Icosahedron>();

   /**
    *@param myListIn to innput my list 
    *@param listIn for putting in the list  
    *
    */
   //constructor 
   public IcosahedronList(String myListIn, ArrayList<Icosahedron>listIn)
   {
      myList = myListIn;
      icosahedronArray = listIn;
   
   }
   
   /**
    *@return myList to get name 
    */
   
   //methods 
   public String getName()
   {
      return myList;    
         
   }
   
   /**
    *@return numOfIcos for the number of Icosahedrons 
    */
   
   public int numberOfIcosahedrons() 
   {
      int numOfIcos = icosahedronArray.size();
      return numOfIcos;
   
   }
   
   /**
    *@return sa for the surface area
    */
   
   public double totalSurfaceArea()
   {
      int index = 0; 
      double sa = 0;
      while (index < icosahedronArray.size()) {
         
         sa += icosahedronArray.get(index).surfaceArea();
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
      while (index < icosahedronArray.size()) {
      
         vol += icosahedronArray.get(index).volume();
         index++; 
      }
   
      return vol; 
   } 
   
   /**
    *@return totalSurfaceArea to get all of the surface area 
    */
   
   public double averageSurfaceArea()
   {
      if (icosahedronArray.size() == 0) {
         return 0;
      }
      return totalSurfaceArea() / icosahedronArray.size();
    /*
      int index = 0; 
      double avgSa = 0;
      while(index < icosahedronArray.size()) {
      
         avgSa += icosahedronArray.get(index).surfaceToVolumeRatio();
         index++; 
      }
   
      return avgSa;
    */
   }
   
   /**
    *@return totalVolume to get all the volume 
    */
   
   public double averageVolume() 
   {
      if (icosahedronArray.size() == 0) {
         return 0;
      }
      return totalVolume() / icosahedronArray.size();
   
   /*
      int index = 0; 
      double avgVol = 0;
      while(index < icosahedronArray.size()) {
      
         avgVol += icosahedronArray.get(index).surfaceToVolumeRatio();
         index++; 
      }
      */ 
   }
   
   /**
    *@return surfToVol 
    */
   
   public double averageSurfaceToVolumeRatio() 
   { 
      double surfToVol = 0;
      if (icosahedronArray.size() != 0)
      {
         int index = 0;
      
         while (index < icosahedronArray.size()) {
         
            surfToVol += icosahedronArray.get(index).surfaceToVolumeRatio();
            index++; 
         }
         //***************************************
         //modified
         return surfToVol / icosahedronArray.size();
         //end
         //***************************************
      }
      //***************************************
      //modified
      //return surfToVol; 
      return 0;
      //end 
      //***************************************
   }  
   
   /**
    *@return ouput for the output 
    */
   
   public String toString() 
   {
      String output = myList + "\n";
      int n = icosahedronArray.size(); 
      
      for (int i = 0; i < n; i++) {
         output += "\n" + icosahedronArray.get(i) + "\n";
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
      //Start of project 6 methodes 
      
      
 /**
     *
     *@return getList the array list.
     */
   
  
   public ArrayList<Icosahedron> getList()
   {
      //***************************************
      // modified
      //return getList;
      return icosahedronArray;
      // end
      //***************************************
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
      
   public IcosahedronList readFile(String fileNameIn)
                            throws FileNotFoundException {
   
      Scanner userInput = new Scanner(System.in);
      ArrayList<Icosahedron> myListIn = new ArrayList<Icosahedron>();
      String iListName = "";
              
      Scanner scanFile = new Scanner(new File(fileNameIn));
      
      String newIcosahedronListName = scanFile.nextLine();
      
      while (scanFile.hasNext()) {
      
         String labelIn = scanFile.nextLine();
         String colorIn = scanFile.nextLine();
         double edgeIn = Double.parseDouble(scanFile.nextLine());
         Icosahedron i = new Icosahedron(labelIn, colorIn, edgeIn);
         myListIn.add(i);           
      }
      scanFile.close();
      
      IcosahedronList iL = 
         new IcosahedronList(newIcosahedronListName, myListIn);
      
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
      //***************************************
      //modified
      //getList.add(i);
      icosahedronArray.add(i);
      // end
      //***************************************
   }
   
   
   /**
    *@return null
    *@param labelIn for the label
    */
   
   public Icosahedron findIcosahedron(String labelIn)
   {
      for (Icosahedron i : icosahedronArray) {
         if (i.getLabel().equalsIgnoreCase(labelIn)) {
            return i;
         }
      }
      return null;
   }
   
   /**
    * Deletes Icosahedrons.
    * 
    *@param labelIn 
    *@return result
    */
   
   public Icosahedron deleteIcosahedron(String labelIn) {
   
      for (Icosahedron i : icosahedronArray) {
         Icosahedron getListIn =  findIcosahedron(labelIn);
         //***************************************
         // modified
         //icosahedronArray.remove(getList);
         icosahedronArray.remove(getListIn);
         // end 
         //***************************************
         return getListIn;
      }
      return null;
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
      //***************************************
      //modified
      //if (getList != null) {
      if (getListIn != null) {
      //end
      //***************************************
         getListIn.setColor(color);
         getListIn.setEdge(edge);
         return true;
      }
      return false;
   }

}