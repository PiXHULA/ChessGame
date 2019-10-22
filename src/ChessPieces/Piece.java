package ChessPieces;

import Board.SquaresEnum;
import LOGIC.Movement;
import LOGIC.Square;

import javax.swing.*;
import java.awt.*;

public abstract class Piece extends JPanel implements Movement {

    Square square;
    ChessPieceColor CPC;
    public Piece(Square square, ChessPieceColor CPC){
        this.square = square;
        this.CPC = CPC;
    }
    public static final Color white = new Color(255, 255, 255);
    public static final Color black = new Color(0, 0, 0);

    public abstract void paintPiece(Graphics g, Square square, ChessPieceColor CPC);
    public abstract void paintWhitePiece(Graphics g, Square square);
    public abstract void paintBlackPiece(Graphics g, Square square);

    public void setSquare(Square square) {
        this.square = square;
    }

    public ChessPieceColor getColor() {
        return CPC;
    }
    public Square getSquare() {
        return square;
    }
}
