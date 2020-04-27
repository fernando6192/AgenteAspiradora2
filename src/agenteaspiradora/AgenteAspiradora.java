package agenteaspiradora;
import jade.core.Agent;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AgenteAspiradora extends Agent{
    Scanner leer = new Scanner(System.in);
    String posicion;
    boolean derecha;
    boolean izquierda;
    int numPosicion;
        
    // Inicialización del agente
    public void setup(){
        System.out.println("\n             **** Hola soy el agente " + getLocalName() + " ****");
        System.out.print("---> Posicion inicial: ");
        posicion = leer.next();
        System.out.print("---> El lado Izquierdo esta limpio: ");
        izquierda = leer.nextBoolean();
        System.out.print("---> El lado Derecho esta limpio: ");
        derecha = leer.nextBoolean();
        if(posicion.equals("izquierda")){
            numPosicion = 0;
        }else{
            numPosicion = 1;
        }
        System.out.println("\n");
        ComportamientoAgenteAspiradora agente = new ComportamientoAgenteAspiradora();
        agente.parametros(numPosicion, derecha, izquierda);
        doDelete();
    }
    
    // Método para finzalizar la ejecución del agente
    public void takeDow(){
        System.out.println("---> Finalizando la ejecución del agente " + getLocalName());    
    }
}
