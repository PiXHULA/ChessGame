package Board;

import ChessPieces.*;
import LOGIC.ChessUti;
import LOGIC.Square;

import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {

    public Board(){
        setBackground(Color.white);
        setPreferredSize(new Dimension(BoardSize.BOARDSIZE.getSizeX()
                , BoardSize.BOARDSIZE.getSizeY()));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        TileClass board = new TileClass();
        board.paintComponent(g);
        ChessUti.addSquareToList(ChessUti.squareList);

        //WHITE CHESSPLAYER
        Piece wP1 = new Pawn(g, ChessUti.getSquare("B1"),ChessPieceColor.WHITE, "White pawn 1");
        ChessUti.getSquare("B1").setPieceToSquare(wP1);
        Piece wP2 = new Pawn(g, ChessUti.getSquare("B2"),ChessPieceColor.WHITE, "White pawn 2");
        ChessUti.getSquare("B2").setPieceToSquare(wP2);
        Piece wP3 = new Pawn(g, ChessUti.getSquare("B3"),ChessPieceColor.WHITE,"White pawn 3");
        ChessUti.getSquare("B3").setPieceToSquare(wP3);
        Piece wP4 = new Pawn(g, ChessUti.getSquare("B4"),ChessPieceColor.WHITE, "White pawn 4");
        ChessUti.getSquare("B4").setPieceToSquare(wP4);

        //BLACK CHESSPLAYER
        Piece bP1 = new Pawn(g, ChessUti.getSquare("G1"),ChessPieceColor.BLACK, "Black pawn 1");
        ChessUti.getSquare("G1").setPieceToSquare(bP1);

       // System.out.println("B2 " + ChessUti.getSquare("B2").getEmpty());
        System.out.println("C3 " + ChessUti.getSquare("C3").getHasPiece());
        System.out.println("WP1's  ruta som den är på : " + wP1.getSquare().getSquare());
        System.out.println("Vilken piece B1 har: " + ChessUti.getSquare("B1").getPiece().getName());

        //ChessUti.checkSquare(g,ChessUti.getSquare("B2"),bP1);
        ChessUti.checkSquare(g,ChessUti.getSquare("C3"),wP1);



    }
}

