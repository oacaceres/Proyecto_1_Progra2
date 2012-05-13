/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

/**
 *
 * @author Oscar
 */
public class Peon extends Ficha{
    private int numMovimientos = 0;
    
    public Peon(){
        super(3,3);
        
        this.setPosicionGrid(2,1);
        this.setEspaciosValidos();
    }
    
    // esto asignara los espacios donde es valido moverse
    // comparandolo con el grid. 
    @Override
    protected void setEspaciosValidos() {
        grid[0][1] = true;
        grid[1][1] = true;
    }
    
    @Override
    public boolean mover(int f, int c) {
        if(numMovimientos > 1){
            grid[0][1] = false;
        }
        numMovimientos++;
        return super.mover(f, c);
        
    }
    
    
    
    
}
