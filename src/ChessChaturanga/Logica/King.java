/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChessChaturanga.Logica;

/**
 *
 * @author KenyStev
 */
public class King extends Piece{

    public King(Color color, int row, int col) {
        super("Rey", color, row, col);
    }

    @Override
    protected Piece genereMovementsValid(Board b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected boolean validMovement(int row, int col) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected boolean mover(Board b, int row, int col) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}