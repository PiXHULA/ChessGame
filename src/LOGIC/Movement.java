package LOGIC;

import Board.SquaresEnum;
import ChessPieces.ChessPieceColor;
import ChessPieces.Piece;

import java.awt.*;

public interface Movement {
    void showLocation();
    void moveToSquare(Graphics g, Piece piece, ChessPieceColor CPC, Square from, Square to);
    void showMovement();
}
