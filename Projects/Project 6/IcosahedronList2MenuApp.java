import java.util.Scanner;
import java.io.FileNotFoundException;

/**
 *
 *@Author: Jacob Stockwell 
 *@version: 10/19/18
 *
 * Description: this program is designed as the driver for the 
 * Icosahedron App menu 
 */
 
public class IcosahedronList2MenuApp
{

/**
 *@param args not used 
 **@throws FileNotFoundException error for file not found.
 */
   public static void main(String[] args) throws FileNotFoundException 
   {
      //decloration of Arrays and prompt for no files found
      String iListName = "no list name";
      Icosahedron[] myList = new Icosahedron[20];
      IcosahedronList2 myIList = new IcosahedronList2(iListName, myList, 0);
      String fileName = "no file name";
      
      String code = "";
   
      //String label, color, edge; 
      
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Icosahedron List System Menu\n"
                       + "R - Read File and Create Icosahedron List\n"
                       + "P - Print Icosahedron List\n"
                       + "S - Print Summary\n"
                       + "A - Add Icosahedron\n"
                       + "D - Delete Icosahedron\n"
                       + "F - Find Icosahedron\n"
                       + "E - Edit Icosahedron\n"
                       + "Q - Quit");
         //-----------------------------------------------------------
      // Start of do while loop  
                      
      do {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         code = scan.nextLine();
         if (code.length() == 0) {
            continue;
         }
         code = code.toUpperCase();
         char codeChar = code.charAt(0);
         switch(codeChar) {
            case 'R': // Read in File and Create TriangleList
               System.out.print("\tFile name: ");
               fileName = scan.nextLine();
            
               myIList = myIList.readFile(fileName);
               //***************************************
               //modified
               // System.out.println("\tFile read in and "
                  //             + "IcosahedronList object created\n");
               System.out.print("\tFile read in and "
                               + "Icosahedron List created\n");
               //end
               //***************************************
                              
               System.out.println();
               break;
               
            case 'P': // Print TriangleList
               System.out.print(myIList.toString() + "\n");
               break;
               
            case 'S': // Print Summary
               System.out.println("\n" + myIList.summaryInfo() + "\n");
               break;
               
               
            case 'A': // Add Icosahedron Object
               String labelIn = "";
               String colorIn = "";
               double edgeIn = 0;
               System.out.print("\tLabel: ");
               labelIn = scan.nextLine();
               System.out.print("\tColor: ");
               colorIn = scan.nextLine();
               System.out.print("\tEdge: ");
               edgeIn = scan.nextDouble();
               myIList.addIcosahedron(labelIn, colorIn, edgeIn);
               System.out.println("\t*** Icosahedron added ***");
               
               break;
               
            case 'D': // Delete Icosahedron Object 
               String label = "";
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               if (myIList.findIcosahedron(label) != null) {
                  myIList.deleteIcosahedron(label);
                  label = label.toUpperCase();
                  char c = label.charAt(0);
                  label = label.substring(1).toLowerCase();
                  label = c + label;
                  System.out.println("\t\"" + label + "\" deleted\n");
               }
               else {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               break;   
         
            case 'F': // Find Icosahedron Object 
               System.out.print("\tLabel: ");
               String myILabelIn = scan.nextLine();
               //***************************************
               // modifies
               // if (myIList.findIcosahedron(myILabelIn) != null) 
               // {
               //    
                  // System.out.println(myIList.findIcosahedron(myILabelIn 
                     // + "\n"));
               // }
               //***************************************
               Icosahedron find = myIList.findIcosahedron(myILabelIn);
               if (find != null) 
               {
                   
                  System.out.println(find + "\n");
               }
               //end
               else 
               {
                  System.out.println("\t\"" + myILabelIn + "\" not found\n");
               
               }
               
               
               break;
         
            case 'E': //edit Icosahedron
               System.out.print("\tLabel: ");
               String newLabel = new String(scan.nextLine());
               System.out.print("\tColor: ");
               String newColor = new String(scan.nextLine());
               System.out.print("\tEdge: ");
               double newEdge = scan.nextDouble();
               if (myIList.editIcosahedron(newLabel, newColor, newEdge)) {
                  myIList.editIcosahedron(newLabel, newColor, newEdge);
                  System.out.println("\t\"" + newLabel + "\"" 
                     + " successfully edited\n");
               }
               else {
                  System.out.println("\"" + newLabel + "\" not found\n");
               }
               break;
         
            case 'Q': // Quit
               break;
               
            default:  // no match, loop again
            //***************************************
            // modfied
               System.out.println("\t*** invalid code ***\n");
            // end
            //***************************************
               break; 
         
         } 
         
      } while (!code.equalsIgnoreCase("Q")); 
   }
}