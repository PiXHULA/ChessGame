package LOGIC;

import Board.SquaresEnum;
import ChessPieces.Piece;

import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class ChessUti {

    public static List<Square> squareList = new LinkedList<>();

    public static void checkSquare(Graphics g, Square square, Piece piece) {
        if (square.getHasPiece()){
            //if (square.getPiece().getColor().equals(piece.getColor())) {
            if (false) {
                System.out.println("Cannot move to location since one of your own pieces is" +
                        " already there");
            } else if (true)
                piece.moveToSquare(g, piece, piece.getColor(), piece.getSquare(),square);
        }
        else
            piece.moveToSquare(g, piece, piece.getColor(), piece.getSquare(),square);
    }
    public static Square getSquare (String square){
        for(Square s: squareList){
            if (s.getSquare().toString().equalsIgnoreCase(square))
                return s;
        }
        return ChessUti.squareList.get(0);
    }
    public static void addSquareToList(List<Square> squareList){
        Square A1 = new Square(SquaresEnum.A1);
        squareList.add(A1);
        Square A2 = new Square(SquaresEnum.A2);
        squareList.add(A2);
        Square A3 = new Square(SquaresEnum.A3);
        squareList.add(A3);
        Square A4 = new Square(SquaresEnum.A4);
        squareList.add(A4);
        Square A5 = new Square(SquaresEnum.A5);
        squareList.add(A5);
        Square A6 = new Square(SquaresEnum.A6);
        squareList.add(A6);
        Square A7 = new Square(SquaresEnum.A7);
        squareList.add(A7);
        Square A8 = new Square(SquaresEnum.A8);
        squareList.add(A8);
        Square B1 = new Square(SquaresEnum.B1);
        squareList.add(B1);
        Square B2 = new Square(SquaresEnum.B2);
        squareList.add(B2);
        Square B3 = new Square(SquaresEnum.B3);
        squareList.add(B3);
        Square B4 = new Square(SquaresEnum.B4);
        squareList.add(B4);
        Square B5 = new Square(SquaresEnum.B5);
        squareList.add(B5);
        Square B6 = new Square(SquaresEnum.B6);
        squareList.add(B6);
        Square B7 = new Square(SquaresEnum.B7);
        squareList.add(B7);
        Square B8 = new Square(SquaresEnum.B8);
        squareList.add(B8);
        Square C1 = new Square(SquaresEnum.C1);
        squareList.add(C1);
        Square C2 = new Square(SquaresEnum.C2);
        squareList.add(C2);
        Square C3 = new Square(SquaresEnum.C3);
        squareList.add(C3);
        Square C4 = new Square(SquaresEnum.C4);
        squareList.add(C4);
        Square C5 = new Square(SquaresEnum.C5);
        squareList.add(C5);
        Square C6 = new Square(SquaresEnum.C6);
        squareList.add(C6);
        Square C7 = new Square(SquaresEnum.C7);
        squareList.add(C7);
        Square C8 = new Square(SquaresEnum.C8);
        squareList.add(C8);
        Square D1 = new Square(SquaresEnum.D1);
        squareList.add(D1);
        Square D2 = new Square(SquaresEnum.D2);
        squareList.add(D2);
        Square D3 = new Square(SquaresEnum.D3);
        squareList.add(D3);
        Square D4 = new Square(SquaresEnum.D4);
        squareList.add(D4);
        Square D5 = new Square(SquaresEnum.D5);
        squareList.add(D5);
        Square D6 = new Square(SquaresEnum.D6);
        squareList.add(D6);
        Square D7 = new Square(SquaresEnum.D7);
        squareList.add(D7);
        Square D8 = new Square(SquaresEnum.D8);
        squareList.add(D8);
        Square E1 = new Square(SquaresEnum.E1);
        squareList.add(E1);
        Square E2 = new Square(SquaresEnum.E2);
        squareList.add(E2);
        Square E3 = new Square(SquaresEnum.E3);
        squareList.add(E3);
        Square E4 = new Square(SquaresEnum.E4);
        squareList.add(E4);
        Square E5 = new Square(SquaresEnum.E5);
        squareList.add(E5);
        Square E6 = new Square(SquaresEnum.E6);
        squareList.add(E6);
        Square E7 = new Square(SquaresEnum.E7);
        squareList.add(E7);
        Square E8 = new Square(SquaresEnum.E8);
        squareList.add(E8);
        Square F1 = new Square(SquaresEnum.F1);
        squareList.add(F1);
        Square F2 = new Square(SquaresEnum.F2);
        squareList.add(F2);
        Square F3 = new Square(SquaresEnum.F3);
        squareList.add(F3);
        Square F4 = new Square(SquaresEnum.F4);
        squareList.add(F4);
        Square F5 = new Square(SquaresEnum.F5);
        squareList.add(F5);
        Square F6 = new Square(SquaresEnum.F6);
        squareList.add(F6);
        Square F7 = new Square(SquaresEnum.F7);
        squareList.add(F7);
        Square F8 = new Square(SquaresEnum.F8);
        squareList.add(F8);
        Square G1 = new Square(SquaresEnum.G1);
        squareList.add(G1);
        Square G2 = new Square(SquaresEnum.G2);
        squareList.add(G2);
        Square G3 = new Square(SquaresEnum.G3);
        squareList.add(G3);
        Square G4 = new Square(SquaresEnum.G4);
        squareList.add(G4);
        Square G5 = new Square(SquaresEnum.G5);
        squareList.add(G5);
        Square G6 = new Square(SquaresEnum.G6);
        squareList.add(G6);
        Square G7 = new Square(SquaresEnum.G7);
        squareList.add(G7);
        Square G8 = new Square(SquaresEnum.G8);
        squareList.add(G8);
        Square H1 = new Square(SquaresEnum.H1);
        squareList.add(H1);
        Square H2 = new Square(SquaresEnum.H2);
        squareList.add(H2);
        Square H3 = new Square(SquaresEnum.H3);
        squareList.add(H3);
        Square H4 = new Square(SquaresEnum.H4);
        squareList.add(H4);
        Square H5 = new Square(SquaresEnum.H5);
        squareList.add(H5);
        Square H6 = new Square(SquaresEnum.H6);
        squareList.add(H6);
        Square H7 = new Square(SquaresEnum.H7);
        squareList.add(H7);
        Square H8 = new Square(SquaresEnum.H8);
        squareList.add(H8);
    }

}
