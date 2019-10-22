package LOGIC;

import Board.SquaresEnum;
import ChessPieces.Piece;

import java.util.LinkedList;
import java.util.List;

public class Square {
    SquaresEnum squareEnum;
    Piece piece;
    boolean empty;
    public Square(SquaresEnum squaresEnum){
        this.squareEnum = squaresEnum;
        this.empty = true;
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

    public void setPieceToSquare(Piece piece) {
        this.piece = piece;
        setEmpty(false);
    }


    public void setEmpty(boolean empty) {
        this.empty = empty;
    }
    public boolean getEmpty(){
        return this.empty;
    }
}
