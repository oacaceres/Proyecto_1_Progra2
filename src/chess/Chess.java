/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

/**
 *
 * @author Oscar
 */
public class Chess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TablaDeJuego tj = new TablaDeJuego("Oski", "Nom");
        
        tj.juegoNuevo();
        
        if(tj.moverPeon(6, 0, 6, 1)){
            System.out.println("Se Movio!");
        }else{
            System.out.println("Nope");
        }
    }
}
