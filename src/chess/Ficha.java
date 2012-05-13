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
    protected int fila = 0;
    protected int columna = 0;
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
    
    public int getFilaGrid() {
        return posicionGrid[0];
    }
    
    public int getColGrid(){
        return posicionGrid[1];
    }
    
    public void setPosicionGrid(int f, int c){
        fila = f;
        columna = c;
        posicionGrid[0] = fila;
        posicionGrid[1] = columna;
    }
    
    public void setPosicionTabla(int f, int c){
        //posicionTabla[0] = f;
        //posicionTabla[1] = c;
    }
    
    public int getPosFilaTabla(){
        return posicionTabla[0];
    }
    
    public int getPosColTabla(){
        return posicionTabla[1];
    }
    
    protected void setEspaciosValidos(){
        
    }
    
    public int getFilaPieza(){
        return fila;
    }
    
    public int getColumnaPieza(){
        return columna;
    }
    
    public boolean mover(int f, int c){
        int fi = f + this.fila;
        int co = c + this.columna;
        return grid[fi][co];
    }

}


