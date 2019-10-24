package ChessPieces;

import Board.SquareSize;
import Board.SquaresEnum;
import Board.TileClass;
import LOGIC.Square;

import java.awt.*;

//BONDE

public class Pawn extends Piece {
    String name;
    public Pawn(Graphics g,Square square, ChessPieceColor CPC, String name) {
        super(square, CPC);
        this.name = name;
        paintPiece(g,square,CPC);

    }

    @Override
    public void setSquare(Square square) {
       super.setSquare(square);
    }

    @Override
    public void paintPiece(Graphics g, Square square, ChessPieceColor CPC) {
        if (CPC == ChessPieceColor.WHITE) {
            paintWhitePiece(g, square);
        }
        if (CPC == ChessPieceColor.BLACK){
            paintBlackPiece(g, square);
        }
    }

    @Override
    public void paintWhitePiece(Graphics g, Square square){
        g.setColor(Color.white);
        g.fillRect(square.getSquare().getCoordX() + 19,square.getSquare().getCoordY() + 19, SquareSize.SQUARESIZE.getSize() / 2
                ,SquareSize.SQUARESIZE.getSize() / 2);
        g.setColor(Color.black);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("P", square.getSquare().getCoordX() + 30, square.getSquare().getCoordY() + 45);
    }

    @Override
    public void paintBlackPiece(Graphics g, Square square){
        g.setColor(Color.black);
        g.fillRect(square.getSquare().getCoordX() + 19,square.getSquare().getCoordY() + 19, SquareSize.SQUARESIZE.getSize() / 2
                ,SquareSize.SQUARESIZE.getSize() / 2);
        g.setColor(Color.white);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("P", square.getSquare().getCoordX() + 30, square.getSquare().getCoordY() + 45);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
    @Override
    public void showLocation() {
    }

    private void moveFromLocation(Graphics g, Square from){
        TileClass.paintSquareAfterMovingPiece(g, from);
        from.setHasPiece(true);
        repaint();
    }
    @Override
    public void moveToSquare(Graphics g, Piece piece, ChessPieceColor CPC, Square from, Square to) {
        moveFromLocation(g, from);
        to.setPieceToSquare(piece);
        paintPiece(g, to, CPC);

    }

    @Override
    public void showMovement() {

    }

    @Override
    public String getName() {
        return name;
    }
}

