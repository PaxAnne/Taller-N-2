package modelo;

/**
 *
 * @author Muñoz-Paz_Vásquez-Fernando
 */
public class Nodo {
    public String iData;              // data item (key)
    public String significado;           // data item
    public String clasificacion;
    public Nodo leftChild;         // this node's left child
    public Nodo rightChild;        // this node's right child

    public void displayNode(){      // display ourself
        
    System.out.print('{');
    System.out.print(iData);
    System.out.print(", ");
    System.out.print(significado);
    System.out.print(", ");
    System.out.print(clasificacion);
    System.out.print("} ");
    }
}
