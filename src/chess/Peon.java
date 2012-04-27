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
        this.setColumna(1);
        this.setFila(2);
        this.setPosicionGrid();
        this.setEspaciosValidos();
    }

    @Override
    public void setEspaciosValidos() {
        grid[0][1] = true;
        grid[1][1] = true;
    }

    @Override
    public boolean mover(int f, int c) {
        if(numMovimientos >=1){
            grid[0][1] = false;
        }
        numMovimientos++;
        return super.mover(f, c);
        
    }
    
    
    
    
}
