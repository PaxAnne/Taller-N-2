package controlador;

import modelo.Arbol;
import modelo.Nodo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Muñoz-Paz_Vásquez-Fernando
 */
public class ControladorArbol {
    
    private Arbol theTree;
    private int value;
    private String word;
    private String definition;
    private String clasification;

    public ControladorArbol() throws IOException{
        theTree = new Arbol();
    }
// -------------------------------------------------------------
    public static String getString() throws IOException {
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      String s = br.readLine();
      return s;
      }
// -------------------------------------------------------------
    public static char getChar() throws IOException {
      String s = getString();
      return s.charAt(0);
      }
//-------------------------------------------------------------
    public static int getInt() throws IOException {
      String s = getString();
      return Integer.parseInt(s);
      }
// -------------------------------------------------------------
    public void loadExamples() {
      theTree.insert("Bailar","hacer acto de baile","Verbo");
      theTree.insert("Abril","mes del año", "Sustantivo");
      theTree.insert("Azul","color","Sustantivo");
      theTree.insert("Disco","forma circular plana","Sustantivo");
      theTree.insert("Casa","edificio habitacional","Sustantivo");
      theTree.insert("Kilo","unidad de medida de la masa","Sustantivo");
      theTree.insert("Hervir","ebullir un liquido","Verbo");
      theTree.insert("Negro","color","Sustantivo");
      theTree.insert("Marte","Planeta","Sustantivo");
   }
// -------------------------------------------------------------
    public void loadMenu() throws IOException{
        while(true)
         {
         System.out.print("Enter first letter of show, ");
         System.out.print("insert, find, delete, or traverse: ");
         int choice = getChar();
         switch(choice)
            {
            case 's':
               theTree.displayTree();
               break;
            case 'i':
               System.out.print("Enter word to insert: ");
               word = getString();
               System.out.print("Enter word meaning to insert: ");
               definition = getString();
               System.out.print("Enter word clasification to insert: ");
               clasification = getString();
               theTree.insert(word, definition,clasification);
               break;
            case 'f':
               System.out.print("Enter value to find: ");
               word = getString();
               Nodo found = theTree.find(word);
               if(found != null)
                  {
                  System.out.print("Found: ");
                  found.displayNode();
                  System.out.print("\n");
                  }
               else
                  System.out.print("Could not find ");
                  System.out.print(word + '\n');
               break;
            case 'd':
               System.out.print("Enter value to delete: ");
               word = getString();
               boolean didDelete = theTree.delete(word);
               if(didDelete)
                  System.out.print("Deleted " + word + '\n');
               else
                  System.out.print("Could not delete ");
                  System.out.print(word + '\n');
               break;
            case 't':
               System.out.print("Enter type 1, 2 or 3: ");
               value = getInt();
               theTree.traverse(value);
               break;
            default:
               System.out.print("Invalid entry\n");
            }  // end switch
         }  // end while
    }
}

