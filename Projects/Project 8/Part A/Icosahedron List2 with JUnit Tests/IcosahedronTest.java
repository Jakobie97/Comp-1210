import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/** Tests for the Icosahedrons. **/
public class IcosahedronTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   // /** A test that always fails. **/
   // @Test public void defaultTest() {
      // Assert.assertEquals("Default test added by jGRASP. Delete "
         //    + "this test once you have added your own.", 0, 1);
   // }
   
   /** Tests the getters. **/
   @Test public void gettersTest() {
      
      Icosahedron.resetCount();
      
      Icosahedron i = new Icosahedron("Small", "Green", 3.0);
      
      Assert.assertEquals("getLabel test",
                          "Small", i.getLabel());
      
      Assert.assertEquals("getColor test",
                          "Green", i.getColor());
                          
      Assert.assertEquals("getEdge test",
                          3.0, i.getEdge(), .000001);
      
      Assert.assertEquals("getCount test", 1, i.getCount());
                          
   }
   
   /** Tests the setters. **/ 
   @Test public void settersTest() {
      
      Icosahedron.resetCount();
      
      Icosahedron i = new Icosahedron("Small", "Green", 3.0);
      
      Assert.assertEquals("getLabel test",
                          "Small", i.getLabel());
      
      Assert.assertEquals("getColor test",
                          "Green", i.getColor());
                          
      Assert.assertEquals("getEdge test",
                          3.0, i.getEdge(), .000001);
                          
      Assert.assertEquals("getCount test", 1, i.getCount());
      
      Assert.assertEquals("setLabel false test",
                          false, i.setLabel(null));
                          
      Assert.assertEquals("setColor falsetest",
                          false, i.setColor(null));
                          
      Assert.assertEquals("setEdge false test",
                          false, i.setEdge(0));
   }
   
   /** Tests the surface area.  **/
   @Test public void surfaceAreaTest() {
   
      Icosahedron i = new Icosahedron("Small", "Green", 3.0);
      
      i.surfaceArea();
      Assert.assertEquals("surfaceArea test", 
                           77.942286, i.surfaceArea(), .000001);
   
   }
  
   /** Tests the volume. **/
   @Test public void volumeTest() {
   
      Icosahedron i = new Icosahedron("Small", "Green", 3.0);
      
      i.volume();
      Assert.assertEquals("volume test", 
                           58.905764, i.volume(), .000001);
   
   }
   
   /** Tests the surface to volume ratio. **/
   @Test public void surfaceToVolumeRatio() {
   
      Icosahedron i = new Icosahedron("Small", "Green", 3.0);
      
      i.surfaceToVolumeRatio();
      Assert.assertEquals("surfaceToVolumeRatio test", 
                           1.323169, i.surfaceToVolumeRatio(), .000001);
   
   }
   
   /** Tests the toString. **/
   @Test public void toStringTest() {
        
      Icosahedron i = new Icosahedron("Small", "Blue", 2.0);
        
      Assert.assertEquals("toString test", 
                      true,
                      i.toString().contains("Icosahedron \"Small\" is \"Blue\"" 
                      + " with 30 edges of length 2.0 units."));
   
   } 
   
   /** Test The equals obj. **/
   @Test public void equalsTest() {
      
      Icosahedron i1 = new Icosahedron("Test", "Blue", 4.0);
      Icosahedron i2 = new Icosahedron("Test", "Blue", 4.0);
      Assert.assertEquals("equals test",
                        true, i1.equals(i2));
                        
      i2 = new Icosahedron("Small", "Red", 2.0);
      Assert.assertEquals("equal false test",
                        false, i1.equals(i2));
      
      i2 = new Icosahedron("Test", "orange", 3.0);
      Assert.assertEquals("equal false test",
                        false, i1.equals(i2));
   
      i2 = new Icosahedron("Test", "Blue", 5.0);
      Assert.assertEquals("equal false test",
                        false, i1.equals(i2));
                        
      Assert.assertEquals("equals false test",
                        false, i1.equals("obj"));
      
      Assert.assertEquals("equals false test",
                    0, i1.hashCode());
      
   }
   
   
   
   
   
}
