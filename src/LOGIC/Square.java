package LOGIC;

import Board.SquaresEnum;
import ChessPieces.Piece;

import java.util.LinkedList;
import java.util.List;

public class Square {
    SquaresEnum squareEnum;
    Piece piece;
    boolean hasPiece;
    public Square(SquaresEnum squaresEnum){
        this.squareEnum = squaresEnum;
        this.hasPiece = false;
    }

    public SquaresEnum getSquare() {
        return squareEnum;
    }

    public void setSquare(SquaresEnum square) {
        this.squareEnum = square;
    }

    public Piece getPiece() {
        return piece;
    }

    public void  setPieceToSquare(Piece piece) {
        this.piece = piece;
        setHasPiece(true);
    }


    public void setHasPiece(boolean hasPiece) {
        this.hasPiece = hasPiece;
    }
    public boolean getHasPiece(){
        return this.hasPiece;
    }
}
