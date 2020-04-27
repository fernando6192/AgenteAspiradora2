package agenteaspiradora;
import jade.core.behaviours.Behaviour;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ComportamientoAgenteAspiradora extends Behaviour{
    public int numPosicion;
    public boolean derecha;
    public boolean izquierda;
    
    
    // Método para almacenar el número de estado y la posición del agente
    public void parametros(int numPosicion, boolean derecha, boolean izquierda){
        this.numPosicion = numPosicion;
        this.derecha = derecha;
        this.izquierda = izquierda;
        this.action();
    }
    
    @Override
    public void action() {
        switch(numPosicion){
            case 0:
                if(this.izquierda == true && this.derecha == true){
                    this.itt();
                    this.moviendoLugar();
                    this.dtt();
                }
                if(this.izquierda == true && this.derecha == false){
                    this.itf();
                    this.moviendoLugar();
                    this.dft();
                    this.limpiar();
                    this.dtt();
                }
                if(this.izquierda == false && this.derecha == true){
                    this.ift();
                    this.limpiar();
                    this.itt();
                    this.moviendoLugar();
                    this.dtt();
                }
                if(this.izquierda == false && this.derecha == false){
                    this.iff();
                    this.limpiar();
                    this.itf();
                    this.moviendoLugar();
                    this.dft();
                    this.limpiar();
                    this.dtt();
                }
                this.repetirDerecha();
                break;
                
            case 1:
                if(this.izquierda == true && this.derecha == true){
                    this.dtt();
                    this.moviendoLugar();
                    this.itt();
                }
                if(this.izquierda == true && this.derecha == false ){
                    this.dft();
                    this.limpiar();
                    this.dtt();
                    this.moviendoLugar();
                    this.itt();
                }
                if(this.izquierda == false && this.derecha == true ){
                    this.dtf();
                    this.moviendoLugar();
                    this.ift();
                    this.limpiar();
                    this.itt();
                }
                if(this.izquierda == false && this.derecha == false ){
                    this.dff();
                    this.limpiar();
                    this.dtf();
                    this.moviendoLugar();
                    this.ift();
                    this.limpiar();
                    this.itt();
                }
                this.repetirIzquierda(); 
                break;
        }
    }

    @Override
    public boolean done() {
        return true;
    }
    
    public void limpiar(){
        System.out.println(" ");
        for(int i=0; i<2; i++){
            System.out.println("---> Limpiando..........................");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ComportamientoAgenteAspiradora.class.getName()).log(Level.SEVERE, null, ex);
            }
        }      
        System.out.println(" "); 
    }
    
    public void moviendoLugar(){  
        for(int i=0; i<2; i++){
            System.out.println("---> Moviendo de lugar..................");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ComportamientoAgenteAspiradora.class.getName()).log(Level.SEVERE, null, ex);
            }
        }      
        System.out.println(" ");             
    }
       
    public void itt(){
        System.out.println("------------------------|-------------------");
        System.out.println("      Lado izquierdo         Lado derecho");
        System.out.println("------------------------|-------------------");
        System.out.println("          \\             |                   ");
        System.out.println("           \\___         |                   ");
        System.out.println("------------------------|-------------------");

        System.out.println("\n---> No hay nada que limpiar en el lado izquierdo.\n");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex){
            Logger.getLogger(ComportamientoAgenteAspiradora.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void itf(){
        System.out.println("------------------------|-------------------");
        System.out.println("      Lado izquierdo         Lado derecho");
        System.out.println("------------------------|-------------------");
        System.out.println("          \\             | *        *     *  ");
        System.out.println("           \\___         |  *    *       *   ");
        System.out.println("------------------------|-------------------");

        System.out.println("\n---> No hay nada que limpiar en el lado izquierdo.\n");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ComportamientoAgenteAspiradora.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void ift(){
        System.out.println("------------------------|-------------------");
        System.out.println("      Lado izquierdo         Lado derecho");
        System.out.println("------------------------|-------------------");
        System.out.println("  *   *    \\       *    |                   ");
        System.out.println("   *   *    \\___  *     |                   ");
        System.out.println("------------------------|-------------------");
    }
    
    public void iff(){
        System.out.println("------------------------|-------------------");
        System.out.println("      Lado izquierdo         Lado derecho");
        System.out.println("------------------------|-------------------");
        System.out.println("  *   *    \\       *    |    *     * * *  * ");
        System.out.println("   *   *    \\___  *     | *   ***   *       ");
        System.out.println("------------------------|-------------------");
    }
    
    public void dtt(){
        System.out.println("------------------------|-------------------");
        System.out.println("      Lado izquierdo         Lado derecho");
        System.out.println("------------------------|-------------------");
        System.out.println("                        |        \\          ");
        System.out.println("                        |         \\__       ");
        System.out.println("------------------------|-------------------");

        System.out.println("\n---> No hay nada que limpiar en el lado derecho.\n");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ComportamientoAgenteAspiradora.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void dtf(){
        System.out.println("------------------------|-------------------");
        System.out.println("      Lado izquierdo         Lado derecho");
        System.out.println("------------------------|-------------------");
        System.out.println("    ***        **       |        \\          ");
        System.out.println("  ***    *        *     |         \\__       ");
        System.out.println("------------------------|-------------------");

        System.out.println("\n---> No hay nada que limpiar en el lado derecho.\n");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ComportamientoAgenteAspiradora.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void dft(){
        System.out.println("------------------------|-------------------");
        System.out.println("      Lado izquierdo         Lado derecho");
        System.out.println("------------------------|-------------------");
        System.out.println("                        |  *  *   \\   ***   ");
        System.out.println("                        |  *  ***  \\__   ** ");
        System.out.println("------------------------|-------------------");
    }
    
    public void dff(){
        System.out.println("------------------------|-------------------");
        System.out.println("      Lado izquierdo         Lado derecho");
        System.out.println("------------------------|-------------------");
        System.out.println("    ***        **       |    **  \\  **   ** ");
        System.out.println("  ***    *        *     | **  *   \\__   *   ");
        System.out.println("------------------------|-------------------");
    }
    
    public void repetirIzquierda(){
        this.moviendoLugar();
        this.dtt();
        this.moviendoLugar();
        this.itt();
        this.repetirIzquierda();
    }
    
    public void repetirDerecha(){
        this.moviendoLugar();
        this.itt();
        this.moviendoLugar();
        this.dtt();
        this.repetirDerecha();
    }
}
