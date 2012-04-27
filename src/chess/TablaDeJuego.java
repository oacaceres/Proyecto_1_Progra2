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
    private int piezasBlancas;
    private int piezasNegras;
    private Ficha PN_0 = new Peon();
    private Ficha PN_1 = new Peon();
    private Ficha PN_2 = new Peon();
    private Ficha PN_3 = new Peon();
    private Ficha PN_4 = new Peon();
    private Ficha PN_5 = new Peon();
    private Ficha PN_6 = new Peon();
    private Ficha PN_7 = new Peon();
    private Ficha PB_0 = new Peon();
    private Ficha PB_1 = new Peon();
    private Ficha PB_2 = new Peon();
    private Ficha PB_3 = new Peon();
    private Ficha PB_4 = new Peon();
    private Ficha PB_5 = new Peon();
    private Ficha PB_6 = new Peon();
    private Ficha PB_7 = new Peon();
    
    public TablaDeJuego(String uno, String dos){
        jugadorUno = uno;
        jugadorDos = dos;
    }
    
    public void juegoNuevo(){
        //total de piezas en la tabla
        piezasBlancas = 16;
        piezasNegras = 16;
        
        //Guardar posicion de peones Negros en tabla
        tabla[1][0] = PN_0;
        tabla[1][1] = PN_1;
        tabla[1][2] = PN_2;
        tabla[1][3] = PN_3;
        tabla[1][4] = PN_4;
        tabla[1][5] = PN_5;
        tabla[1][6] = PN_6;
        tabla[1][7] = PN_7;
        for(int i = 0; i < tabla[1].length; i++){
            tabla[1][i].setPosicionTabla(1, i);
        }
        
        //Posicion de peones Blancos
        tabla[6][0] = PB_0;
        tabla[6][1] = PB_1;
        tabla[6][2] = PB_2;
        tabla[6][3] = PB_3;
        tabla[6][4] = PB_4;
        tabla[6][5] = PB_5;
        tabla[6][6] = PB_6;
        tabla[6][7] = PB_7;
        for(int i = 0; i < tabla[6].length; i++){
            tabla[6][i].setPosicionTabla(1, i);
        }
        
        
    }
    
    public boolean moverPeon(int fila, int columna, int filaDest, int colDest){
        if(tabla[fila][columna] != null){
            Ficha peon = tabla[fila][columna];
            tabla[fila][columna] = null;
            tabla[filaDest][colDest] = peon;
            return true;
        }
        return false;
        
    }
    
    /*
     * private boolean movimientoValido(){
        
        return false;
    }
    */
    
}
