import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;

/** 
 *@Author: Jacob Stockwell
 *@Version: 11/2/18
 *
 *
 *Description: part B test cases 
**/

public class IcosahedronList2Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /** Get Name Test. **/
   @Test public void getNameTest() {
      
      Icosahedron [] iArray = new Icosahedron[20]; 
      
      iArray[0] = new Icosahedron("test1", "blue", 1);
      iArray[1] = new Icosahedron("test2", "red", 2);
      iArray[2] = new Icosahedron("test3", "pink", 3);
      
      IcosahedronList2 iList2 = new IcosahedronList2("test1", iArray, 3);
      Assert.assertEquals("getListName test1", 
                         "test1", iList2.getName());
   
   }
   
   /** Total Surface Area Test. **/
   @Test public void totalSurfaceAreaTest() {
      Icosahedron [] iArray = new Icosahedron[20]; 
      
      iArray[0] = new Icosahedron("test1", "blue", 1);
      iArray[1] = new Icosahedron("test2", "red", 2);
      iArray[2] = new Icosahedron("test3", "pink", 3);
      
      IcosahedronList2 iList2 = new IcosahedronList2("Test List", iArray, 3);
      Assert.assertEquals("totalSurfaceArea Test",
                           121.243556, iList2.totalSurfaceArea(), .000001);
   
   
   }
   
   /** Total volume Test. **/
   @Test public void totalVolumeTest() {
   
      Icosahedron [] iArray = new Icosahedron[20]; 
      
      iArray[0] = new Icosahedron("test1", "blue", 1);
      iArray[1] = new Icosahedron("test2", "red", 2);
      iArray[2] = new Icosahedron("test3", "pink", 3);
      
      IcosahedronList2 iList2 = new IcosahedronList2("Test List", iArray, 3);
      Assert.assertEquals("totalVolume Test",
                           78.541019, iList2.totalVolume(), .000001);
   
   }
   
   /** Average Surface Area Test. **/
   
   @Test public void averageSurfaceAreaTest() {
   
      Icosahedron [] iArray = new Icosahedron[20]; 
      
      iArray[0] = new Icosahedron("test1", "blue", 1);
      iArray[1] = new Icosahedron("test2", "red", 2);
      iArray[2] = new Icosahedron("test3", "pink", 3);
      
      IcosahedronList2 iList2 = new IcosahedronList2("Test List", iArray, 3);
      
      
      
      Assert.assertEquals("averageSurfaceArea Test", 
                           40.414518, iList2.averageSurfaceArea(), .000001);
      
      Assert.assertEquals("averageSurfaceToVolumeRatio Test",
                      2.425809, iList2.averageSurfaceToVolumeRatio(), .000001);
       
      IcosahedronList2 iList3 = new IcosahedronList2("Test List", iArray, 0); 
      Assert.assertEquals(0, iList3.averageSurfaceArea(), .000001);
      
      Assert.assertEquals("averageSurfaceToVolumeRatio Test",
                          0, iList3.averageSurfaceToVolumeRatio(), .000001);
   
   }
   
   /** Average Volume Test. **/
   
   @Test public void averageVolumeTest() {
   
      Icosahedron [] iArray = new Icosahedron[20]; 
      
      iArray[0] = new Icosahedron("test1", "blue", 1);
      iArray[1] = new Icosahedron("test2", "red", 2);
      iArray[2] = new Icosahedron("test3", "pink", 3);
      
      IcosahedronList2 iList2 = new IcosahedronList2("Test List", iArray, 3);   
      Assert.assertEquals("averagevolume Test", 
                           26.180339, iList2.averageVolume(), .000001);
                           
      IcosahedronList2 iList3 = new IcosahedronList2("Test List", iArray, 0); 
      Assert.assertEquals(0, iList3.averageVolume(), .000001);
   
   }
   
   /** ToString Test. **/
   
   @Test public void toStringTest() {
   
      Icosahedron [] iArray = new Icosahedron[20]; 
      
      iArray[0] = new Icosahedron("test1", "blue", 1);
      iArray[1] = new Icosahedron("test2", "red", 2);
      iArray[2] = new Icosahedron("test3", "pink", 3);
      
      IcosahedronList2 iList2 = new IcosahedronList2("Test List", iArray, 3); 
      Assert.assertEquals("toString Test",
                           true, 
                           iList2.toString().
                              contains("Icosahedron \"test1\" is \"blue\"" 
                      + " with 30 edges of length 1.0 units."));
      
      Assert.assertEquals("toString Test",
                           true, 
                           iList2.toString().
                              contains("Icosahedron \"test2\" is \"red\"" 
                      + " with 30 edges of length 2.0 units."));
      
      Assert.assertEquals("toString Test",
                           true, 
                           iList2.toString().
                              contains("Icosahedron \"test3\" is \"pink\"" 
                      + " with 30 edges of length 3.0 units."));
   
   }
   
   /** SummeryInfo Test.**/
   
   @Test public void summeryInfoTest() {
   
      Icosahedron [] iArray = new Icosahedron[20]; 
      
      iArray[0] = new Icosahedron("test1", "blue", 1);
      iArray[1] = new Icosahedron("test2", "red", 2);
      iArray[2] = new Icosahedron("test3", "pink", 3);
      
      IcosahedronList2 iList2 = new IcosahedronList2("Test List", iArray, 3); 
      Assert.assertEquals("summary Test",
                           true, 
                           iList2.summaryInfo().
                              contains("Number of Icosahedrons: 3"));
   
      
   }
   
   /** 
    *Read File Test. 
    *@throws FileNotFoundException 
   **/
   
   @Test public void readFileTest() throws FileNotFoundException {
   
      Icosahedron [] iArray = new Icosahedron[20]; 
      
      iArray[0] = new Icosahedron("test1", "blue", 1);
      iArray[1] = new Icosahedron("test2", "red", 2);
      iArray[2] = new Icosahedron("test3", "pink", 3);
      
      IcosahedronList2 iList2 = new IcosahedronList2("Test List", iArray, 3); 
   
      iList2 = iList2.readFile("Icosahedron_data_1.txt");
      
      Assert.assertEquals("readFile Test",
                           "Icosahedron Test List", 
                           iList2.getName());
                           
      iList2 = iList2.readFile("Icosahedron_data_0.txt");
      
      Assert.assertEquals("readFile Test",
                           "Icosahedron Empty Test List", 
                           iList2.getName());
                           
   }
   
   
   
   /** Add Icosahedron Test.**/
   
   @Test public void addIcosahedronTest() {
   
      Icosahedron[] iArray = new Icosahedron[20];
      iArray[0] = new Icosahedron("small", "blue", 1);
      iArray[1] = new Icosahedron("medium", "red", 2);
      iArray[2] = new Icosahedron("large", "pink", 3);
      
      IcosahedronList2 iList = new IcosahedronList2("Test List", iArray, 3);
      
      Icosahedron i = new Icosahedron("big", "orange", 7);
      iArray[3] = i;
      iList.addIcosahedron("big", "orange", 7);
      Icosahedron[] iA = iList.getList();
         
      Assert.assertArrayEquals("addIcosahedron Test",
                           iArray, iA);
   
   }
   
   /** Delete Icosahedron Test. **/
   
   @Test public void deleteIcosahedronTest() {
   
      Icosahedron [] iArray = new Icosahedron[20]; 
      
      iArray[0] = new Icosahedron("test1", "blue", 1);
      iArray[1] = new Icosahedron("test2", "red", 2);
      iArray[2] = new Icosahedron("test3", "pink", 3);
      
      IcosahedronList2 iList2 = new IcosahedronList2("Test List", iArray, 3);
      
      iList2.deleteIcosahedron("test1");
      
      Assert.assertEquals("deleteIcosahedron Test",
                           null, iList2.deleteIcosahedron(null));   
                              
   
   
   
   }
   
   /** Find Icosahedron Test. **/
   @Test public void findIcosahedronTest() {
   
      Icosahedron [] iArray = new Icosahedron[20]; 
      
      iArray[0] = new Icosahedron("test1", "blue", 1);
      iArray[1] = new Icosahedron("test2", "red", 2);
      iArray[2] = new Icosahedron("test3", "pink", 3);
      
      IcosahedronList2 iList2 = new IcosahedronList2("Test List", iArray, 3);
      iList2.findIcosahedron("test1");
      
      
      Assert.assertEquals("findIcosahedron test", 
                          null, iList2.findIcosahedron("small"));
   
   
   
   
   
   } 
   
   /** Edit Icosahedron Test. **/
   @Test public void editIcosahedron() {
   
      Icosahedron [] iArray = new Icosahedron[20]; 
      
      iArray[0] = new Icosahedron("test1", "blue", 1);
      iArray[1] = new Icosahedron("test2", "red", 2);
      iArray[2] = new Icosahedron("test3", "pink", 3);
      
      IcosahedronList2 iList2 = new IcosahedronList2("Test List", iArray, 3);
      Assert.assertTrue(iList2.editIcosahedron("test1", "red", 5));
      
      Assert.assertEquals("findIcosahedron test", 
                          true, iList2.editIcosahedron("test1", "red", 1));
   
      
   }
   //------------------------------------------------------------------------
   
   
   /** Smallest edge test.**/
   @Test public void findIcosahedronWithShortestEdgeTest() {
   
      Icosahedron [] iArray = new Icosahedron[20]; 
      
      iArray[0] = new Icosahedron("test1", "blue", 1);
      iArray[1] = new Icosahedron("test2", "red", 2);
      iArray[2] = new Icosahedron("test3", "pink", 3);
      
      IcosahedronList2 iList = new IcosahedronList2("Test List", 
                                                      iArray, 3); 
      
      Assert.assertEquals("smallestEdge Test",
                           iArray[0], iList.findIcosahedronWithShortestEdge());
   
      // IcosahedronList2 iList2 = new IcosahedronList2("Test List", null, 0);
      // // Assert.assertEquals("smallestEdge Test",
         // //                   0, 
         // //                   iList2.findIcosahedronWithSmallestEdge());
   // // 
   }
   
   /** Longest edge test. **/
   @Test public void findIcosahedronWithLongestEdgeTest() {
   
      Icosahedron [] iArray = new Icosahedron[20]; 
      
      iArray[0] = new Icosahedron("test1", "blue", 1);
      iArray[1] = new Icosahedron("test2", "red", 2);
      iArray[2] = new Icosahedron("test3", "pink", 3);
      
      IcosahedronList2 iList = new IcosahedronList2("Test List", iArray, 3); 
      
      Assert.assertEquals("LongestEdge Test",
                           iArray[2], iList.findIcosahedronWithLongestEdge());
                           
      IcosahedronList2 iList3 = new IcosahedronList2("Test List", iArray, 0);
      Assert.assertEquals("numberOfIcosahedrons is less than 0",
                           null, iList3.findIcosahedronWithLongestEdge());
   
      // IcosahedronList2 iList2 = new IcosahedronList2("Test List", null, 0);
      // // Assert.assertEquals("LongestEdge Test",
         // //                   0, iList2.findIcosahedronWithLongestEdge());
   
   
   }
   
   /** Smallest Volume Test. **/
   
   @Test public void findIcosahedronWithSmallestVolumeTest() {
   
      Icosahedron [] iArray = new Icosahedron[20];
      
      iArray[0] = new Icosahedron("test1", "blue", 1);
      iArray[1] = new Icosahedron("test2", "red", 2);
      iArray[2] = new Icosahedron("test3", "pink", 3);
      
      IcosahedronList2 iList = new IcosahedronList2("Test List", iArray, 3); 
      
      Assert.assertEquals("SmallestVolume Test",
                           iArray[0], 
                           iList.findIcosahedronWithSmallestVolume());
                           
      IcosahedronList2 iList3 = new IcosahedronList2("Test List", iArray, 0);
      Assert.assertEquals("numberOfIcosahedrons is less than 0",
                           null, iList3.findIcosahedronWithSmallestVolume());
   
   }
   
   /** Largest Volume Test. **/
   @Test public void findIcosahedronWithLargestVolumeTest() {
   
      Icosahedron [] iArray = new Icosahedron[20]; 
      
      iArray[0] = new Icosahedron("test1", "blue", 1);
      iArray[1] = new Icosahedron("test2", "red", 2);
      iArray[2] = new Icosahedron("test3", "pink", 3);
      
      IcosahedronList2 iList = new IcosahedronList2("Test List", iArray, 3); 
      
      Assert.assertEquals("LargestVolume Test",
                           iArray[2], 
                           iList.findIcosahedronWithLargestVolume());
                           
      IcosahedronList2 iList3 = new IcosahedronList2("Test List", iArray, 0);
      Assert.assertEquals("numberOfIcosahedrons is less than 0",
                           null, iList3.findIcosahedronWithLargestVolume());
   
   }
}
