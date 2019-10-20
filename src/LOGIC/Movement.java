package LOGIC;

import Board.Squares;
import ChessPieces.ChessPieceColor;

import java.awt.*;

public interface Movement {
    void showLocation();
    void moveToSquare(Graphics g, ChessPieceColor CPC, Squares from, Squares to);
    void showMovement();
}
