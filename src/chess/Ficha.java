/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

/**
 *
 * @author Oscar
 */
public class Ficha {
    protected int fila;
    protected int columna;
    protected boolean grid[][];
    protected int posicionGrid[] = new int[2];
    protected int posicionTabla[] = new int[2];
    
    
    public Ficha(int fil, int col){
        grid = new boolean[fil][col];
        for(int f = 0; f < grid.length; f++){
            for(int c = 0; c < grid[f].length; c++){
                grid[f][c] = false;
            }
        }
        
    }
    
    public void setPosicionGrid(){
        posicionGrid[0] = fila;
        posicionGrid[1] = columna;
    }
    
    public void setPosicionTabla(int f, int c){
        posicionTabla[0] = f;
        posicionTabla[1] = c;
    }
    
    public void setEspaciosValidos(){
        
    }
    
    public int getFilaPieza(){
        return fila;
    }
    
    public int getColumnaPieza(){
        return columna;
    }
    
    public boolean mover(int f, int c){
        return grid[f][c];
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }
    
    
    
}


