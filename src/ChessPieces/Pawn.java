package ChessPieces;

import Board.SquareSize;
import Board.Squares;
import Board.TileClass;
import LOGIC.Movement;

import javax.swing.*;
import java.awt.*;

//BONDE

public class Pawn extends Piece {

    public Pawn(Squares square, ChessPieceColor CPC) {
        super(square, CPC);
    }

    @Override
    public void setSquare(Squares square) {
        super.setSquare(square);
    }

    @Override
    public void paintPiece(Graphics g, Squares squares, ChessPieceColor CPC) {
        if (CPC == ChessPieceColor.WHITE)
            paintWhitePiece(g, squares);
        if (CPC == ChessPieceColor.BLACK)
            paintWhitePiece(g, squares);

    }

    @Override
    public void paintWhitePiece(Graphics g, Squares square){
        g.setColor(Color.black);
        g.drawRect(square.getCoordX() + 10,square.getCoordY() + 10, SquareSize.SQUARESIZE.getSize() - 20
                ,SquareSize.SQUARESIZE.getSize() - 20);
        g.setColor(Color.white);
        g.fillRect(square.getCoordX() + 19,square.getCoordY() + 19, SquareSize.SQUARESIZE.getSize() / 2
                ,SquareSize.SQUARESIZE.getSize() / 2);
        g.setColor(Color.black);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("P", square.getCoordX() + 30, square.getCoordY() + 45);
    }

    @Override
    public void paintBlackPiece(Graphics g, Squares square){
        g.setColor(Color.white);
        g.drawRect(square.getCoordX() + 10,square.getCoordY() + 10, SquareSize.SQUARESIZE.getSize() - 20
                ,SquareSize.SQUARESIZE.getSize() - 20);
        g.setColor(Color.white);
        g.fillRect(square.getCoordX() + 19,square.getCoordY() + 19, SquareSize.SQUARESIZE.getSize() / 2
                ,SquareSize.SQUARESIZE.getSize() / 2);
        g.setColor(Color.black);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("P", square.getCoordX() + 30, square.getCoordY() + 45);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
    @Override
    public void showLocation() {
    }

    private void moveFromLocation(Graphics g, Squares from){
        TileClass.paintSquareAfterMovingPiece(g, from);
    }
    @Override
    public void movetoLocation(Graphics g, ChessPieceColor CPC, Squares from, Squares to) {
            moveFromLocation(g, from);
            paintPiece(g, to, CPC);
            setSquare(to);
    }

    @Override
    public void showMovement() {

    }

}

