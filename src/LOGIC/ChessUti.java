package LOGIC;

import Board.SquaresEnum;
import ChessPieces.ChessPieceColor;
import ChessPieces.Piece;

import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class ChessUti {

    public static List<Square> Squares = new LinkedList<>();

    public static void checkSquare(Graphics g, Square square, Piece piece) {
        if (!square.getEmpty()) {
            if (square.getPiece().getColor().equals(piece.getColor())) {
                System.out.println("Cannot move to location since one of your own pieces is" +
                        " already there");
            } else if (!square.getPiece().getColor().equals(piece.getColor())) {
                piece.moveToSquare(g, piece, square);
            }
        } else {
            piece.moveToSquare(g, piece, square);
        }
    }

    public static Square getSquare(String square) {
        for (Square s : Squares) {
            if (s.getSquare().toString().equalsIgnoreCase(square))
                return s;
        }
        return ChessUti.getSquare(square);
    }

    public ChessUti() {
        //Creating Squares
        Square A1 = new Square(SquaresEnum.A1);
        Squares.add(A1);
        Square A2 = new Square(SquaresEnum.A2);
        Squares.add(A2);
        Square A3 = new Square(SquaresEnum.A3);
        Squares.add(A3);
        Square A4 = new Square(SquaresEnum.A4);
        Squares.add(A4);
        Square A5 = new Square(SquaresEnum.A5);
        Squares.add(A5);
        Square A6 = new Square(SquaresEnum.A6);
        Squares.add(A6);
        Square A7 = new Square(SquaresEnum.A7);
        Squares.add(A7);
        Square A8 = new Square(SquaresEnum.A8);
        Squares.add(A8);
        Square B1 = new Square(SquaresEnum.B1);
        Squares.add(B1);
        Square B2 = new Square(SquaresEnum.B2);
        Squares.add(B2);
        Square B3 = new Square(SquaresEnum.B3);
        Squares.add(B3);
        Square B4 = new Square(SquaresEnum.B4);
        Squares.add(B4);
        Square B5 = new Square(SquaresEnum.B5);
        Squares.add(B5);
        Square B6 = new Square(SquaresEnum.B6);
        Squares.add(B6);
        Square B7 = new Square(SquaresEnum.B7);
        Squares.add(B7);
        Square B8 = new Square(SquaresEnum.B8);
        Squares.add(B8);
        Square C1 = new Square(SquaresEnum.C1);
        Squares.add(C1);
        Square C2 = new Square(SquaresEnum.C2);
        Squares.add(C2);
        Square C3 = new Square(SquaresEnum.C3);
        Squares.add(C3);
        Square C4 = new Square(SquaresEnum.C4);
        Squares.add(C4);
        Square C5 = new Square(SquaresEnum.C5);
        Squares.add(C5);
        Square C6 = new Square(SquaresEnum.C6);
        Squares.add(C6);
        Square C7 = new Square(SquaresEnum.C7);
        Squares.add(C7);
        Square C8 = new Square(SquaresEnum.C8);
        Squares.add(C8);
        Square D1 = new Square(SquaresEnum.D1);
        Squares.add(D1);
        Square D2 = new Square(SquaresEnum.D2);
        Squares.add(D2);
        Square D3 = new Square(SquaresEnum.D3);
        Squares.add(D3);
        Square D4 = new Square(SquaresEnum.D4);
        Squares.add(D4);
        Square D5 = new Square(SquaresEnum.D5);
        Squares.add(D5);
        Square D6 = new Square(SquaresEnum.D6);
        Squares.add(D6);
        Square D7 = new Square(SquaresEnum.D7);
        Squares.add(D7);
        Square D8 = new Square(SquaresEnum.D8);
        Squares.add(D8);
        Square E1 = new Square(SquaresEnum.E1);
        Squares.add(E1);
        Square E2 = new Square(SquaresEnum.E2);
        Squares.add(E2);
        Square E3 = new Square(SquaresEnum.E3);
        Squares.add(E3);
        Square E4 = new Square(SquaresEnum.E4);
        Squares.add(E4);
        Square E5 = new Square(SquaresEnum.E5);
        Squares.add(E5);
        Square E6 = new Square(SquaresEnum.E6);
        Squares.add(E6);
        Square E7 = new Square(SquaresEnum.E7);
        Squares.add(E7);
        Square E8 = new Square(SquaresEnum.E8);
        Squares.add(E8);
        Square F1 = new Square(SquaresEnum.F1);
        Squares.add(F1);
        Square F2 = new Square(SquaresEnum.F2);
        Squares.add(F2);
        Square F3 = new Square(SquaresEnum.F3);
        Squares.add(F3);
        Square F4 = new Square(SquaresEnum.F4);
        Squares.add(F4);
        Square F5 = new Square(SquaresEnum.F5);
        Squares.add(F5);
        Square F6 = new Square(SquaresEnum.F6);
        Squares.add(F6);
        Square F7 = new Square(SquaresEnum.F7);
        Squares.add(F7);
        Square F8 = new Square(SquaresEnum.F8);
        Squares.add(F8);
        Square G1 = new Square(SquaresEnum.G1);
        Squares.add(G1);
        Square G2 = new Square(SquaresEnum.G2);
        Squares.add(G2);
        Square G3 = new Square(SquaresEnum.G3);
        Squares.add(G3);
        Square G4 = new Square(SquaresEnum.G4);
        Squares.add(G4);
        Square G5 = new Square(SquaresEnum.G5);
        Squares.add(G5);
        Square G6 = new Square(SquaresEnum.G6);
        Squares.add(G6);
        Square G7 = new Square(SquaresEnum.G7);
        Squares.add(G7);
        Square G8 = new Square(SquaresEnum.G8);
        Squares.add(G8);
        Square H1 = new Square(SquaresEnum.H1);
        Squares.add(H1);
        Square H2 = new Square(SquaresEnum.H2);
        Squares.add(H2);
        Square H3 = new Square(SquaresEnum.H3);
        Squares.add(H3);
        Square H4 = new Square(SquaresEnum.H4);
        Squares.add(H4);
        Square H5 = new Square(SquaresEnum.H5);
        Squares.add(H5);
        Square H6 = new Square(SquaresEnum.H6);
        Squares.add(H6);
        Square H7 = new Square(SquaresEnum.H7);
        Squares.add(H7);
        Square H8 = new Square(SquaresEnum.H8);
        Squares.add(H8);
    }

}
