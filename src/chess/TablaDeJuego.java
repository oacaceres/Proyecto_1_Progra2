/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

/**
 *
 * @author Oscar
 */
public class TablaDeJuego {
    private Ficha tabla[][] = new Ficha[8][8];
    private String jugadorUno;
    private String jugadorDos;
    private static int piezasBlancas;
    private static int piezasNegras;
    private Ficha PN[] = new Peon[8];
    private Ficha PB[] = new Peon[8];
    
    
    public TablaDeJuego(String uno, String dos){
        jugadorUno = uno;
        jugadorDos = dos;
    }
    
    public void juegoNuevo(){
        //total de piezas en la tabla
        piezasBlancas = 16;
        piezasNegras = 16;
        tabla[6][0] = PB[0];
        /*
        //asigna a los peones sobre la tabla de juego
        for(int f = 0; f < tabla[1].length; f++){
            // tabla[1][f] = PN[f];
            tabla[6][f] = PB[f];
        }
        
        
        //Guardar posicion de peones en tabla
        //for(int i = 0; i < tabla.length; i++){
            //tabla[1][i].setPosicionTabla(1, i);
        //}
        
        //for(int i = 0; i < tabla[6].length; i++){
          //  tabla[6][i].setPosicionTabla(6, i);
        //}
        * 
        */
        
        
    }
    
    public boolean moverPeon(int f, int c, int filaDest, int colDest){
        if(tabla[f][c] != null){
            
            int fil = filaDest - f;
            int col = colDest - c;
            
            if(tabla[f][c].mover(fil, col)){
                Ficha peon = tabla[f][c];
                
                tabla[f][c] = null;
                tabla[filaDest][colDest] = peon;
                
                
                System.out.println("test: " + f + " " + c);
                return true;
            }
        
            System.out.println("Aqui es donde falla" + f + " " + c);
        }
        
        return false;
        
    }
    
    /*
     * private boolean movimientoValido(){
        
        return false;
    }
    */
    
}
