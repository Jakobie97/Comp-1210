import java.util.ArrayList;
import java.text.DecimalFormat;

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
   private String myList = "";
   private ArrayList<Icosahedron> icosahedronArray = 
      new ArrayList<Icosahedron>();

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
      }
   
      return surfToVol;  
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

}