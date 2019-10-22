package Board;

import ChessPieces.*;
import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {
    JPanel jpl = new JPanel();
    public Board(){
        setBackground(Color.white);
        setPreferredSize(new Dimension(BoardSize.BOARDSIZE.getSizeX()
                , BoardSize.BOARDSIZE.getSizeY()));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //TileClass board = new TileClass();
        //board.paintComponent(g);

        //WHITE CHESSPLAYER
        Pawn wP1 = new Pawn(Squares.B1,ChessPieceColor.WHITE);
        /*
        System.out.println(Squares.emptySquares);
        System.out.println(Squares.occupiedSquares);
        Squares.FromEmptyToOccupied(wP1.getSquare());
        System.out.println(Squares.emptySquares);
        System.out.println(Squares.occupiedSquares);
        Squares.FromOccupiedToEmpty(wP1.getSquare());
        System.out.println(Squares.emptySquares);
        System.out.println(Squares.occupiedSquares);

         */
        System.out.println("från ledig: " + Squares.emptySquares);
        System.out.println("-------------------");
        System.out.println("från upptagen: " + Squares.occupiedSquares);
        wP1.paintPiece(g,wP1.getSquare(),wP1.getColor());
        wP1.moveToSquare(g,wP1.getColor(),wP1.getSquare(),Squares.A2);
        System.out.println("från ledig: " + Squares.emptySquares);
        System.out.println("-------------------");
        System.out.println("från upptagen: " + Squares.occupiedSquares);
        wP1.moveToSquare(g,wP1.getColor(),wP1.getSquare(),Squares.A5);
        System.out.println("från ledig: " + Squares.emptySquares);
        System.out.println("-------------------");
        System.out.println("från upptagen: " + Squares.occupiedSquares);
    }
}

