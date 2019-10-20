package ChessPieces;

import Board.Squares;
import LOGIC.Movement;

import javax.swing.*;
import java.awt.*;

public abstract class Piece extends JPanel implements Movement {

    Squares square;
    ChessPieceColor CPC;
    public Piece(Squares square, ChessPieceColor CPC){
        this.square = square;
        this.CPC = CPC;
    }
    public static final Color white = new Color(255, 255, 255);
    public static final Color black = new Color(0, 0, 0);

    public abstract void paintPiece(Graphics g, Squares square, ChessPieceColor CPC);
    public abstract void paintWhitePiece(Graphics g, Squares square);
    public abstract void paintBlackPiece(Graphics g, Squares square);

    public void setSquare(Squares square) {
        this.square = square;
    }

    public ChessPieceColor getColor() {
        return CPC;
    }
    public Squares getSquare() {
        return square;
    }
}
