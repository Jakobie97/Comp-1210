import java.text.DecimalFormat;
/**
 *
 * @Author: Jacob Stockwell
 * @version: 09/21/18
 *
 * Description: This program is designed to create classes for 
 * the Isahedron App that stores the label, color and edge 
 */
 
public class Icosahedron 
{
 /**
  *
  * @param args not used 
  * 
  */
   
   //feilds
   private String label = "";
   private String color = "";
   private double edge = 0;

   
   // contructor 
   
   /**
     *Template for creating a new Icosahedron.
     *@param labelIn  for setLabel 
     *@param colorIn for setColor
     *@param edgeIn for setEdge
   */
   
   public Icosahedron(String labelIn, String colorIn, double edgeIn)
   {
      setLabel(labelIn);
      setColor(colorIn);
      setEdge(edgeIn);
    
      
   }
   
   //methods 
   
   /**
    *@return label to get label 
   */
   public String getLabel()
   {
   
      return label;
   }
   
   /**
    *@return isSet to make sure label is set
    *@param labelIn to get new label 
   */
   
   public boolean setLabel(String labelIn) 
   {
      boolean isSet = false; 
      if (labelIn != null) 
      {
         label = labelIn.trim(); 
         isSet = true; 
      
      }
      return isSet; 
   
   }
   
   /**
    *@return color to get color 
   */
   
   public String getColor()
   {
     
      
      return color;
   }
   
   /**
    *@return isSet to make sure color is set 
    *@param colorIn to get new color
   */
   
   public boolean setColor(String colorIn)
   {
      boolean isSet = false; 
      if (colorIn != null) 
      {
         color = colorIn.trim(); 
         isSet = true; 
      
      }
      return isSet; 
   }
   
   /**
    *@return edge to retrieve number of edges  
   */
   
   public double getEdge()
   {
     
      
      return edge; 
   } 
   
   /**
    *@return isSet to make sure edge is set 
    *@param edgeIn to set the edge
   */
   
   public boolean setEdge(double edgeIn)
   {
      boolean isSet = false; 
      if (edgeIn > 0) 
      {
         edge = edgeIn; 
         isSet = true; 
      
      }
      return isSet; 
   
   }
   
   /**
    *@return sA to calculate the Surface Area  
   */
   
   public double surfaceArea()
   {
      double sA = (5 * Math.sqrt(3) * Math.pow(edge, 2));
   
      return sA; 
   }
   
   /**
    *@return volume to calculate the volume 
   */

   public double volume()
   {
      double volume = (5 * (3 + Math.sqrt(5)) / 12) * Math.pow(edge, 3);
   
      return volume;
   }
   
   /**
    *@return surfaceToVolumeRatio to caclulate Surface to volume 
   */
   
   public double surfaceToVolumeRatio()
   {
      
      double surfaceToVolume = surfaceArea() / volume();
   
      return surfaceToVolume; 
   } 
   
   /**
    * @return output of the user info
    *
    */
   
   public String toString()
   {
      DecimalFormat df = new DecimalFormat("#,##0.0#####");
      
      String output = "Icosahedron \"" + label.trim() + "\" is \"" 
         //***************************************
         //modified
         //+ color.trim() + "\"  with 30" + " edges of length " 
         + color.trim() + "\" with 30" + " edges of length " 
         //end
         //***************************************
         + df.format(edge) + " units.\n"
         + "\tsurface area = " + df.format(surfaceArea()) + " square units\n"
         + "\tvolume = " + df.format(volume()) + " cubic units\n"
         + "\tsurface/volume ratio = " + df.format(surfaceToVolumeRatio());
   
   
      return output;
   }
 
}