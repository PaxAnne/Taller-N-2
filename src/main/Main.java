package main;

import controlador.ControladorArbol;
import java.io.IOException;

/**
 *
 * @author Muñoz-Paz_Vásquez-Fernando
 */
public class Main {

    public static void main(String[] args) throws IOException {
        ControladorArbol controlador = new ControladorArbol();
        controlador.loadExamples();
        controlador.loadMenu();
    }      
}