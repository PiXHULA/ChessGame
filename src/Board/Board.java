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
        ChessUti uti = new ChessUti();

        //WHITE CHESSPLAYER
        Piece wP1 = new Pawn(g, ChessUti.getSquare("B1"),ChessPieceColor.WHITE);
        Piece wP2 = new Pawn(g, ChessUti.getSquare("B2"),ChessPieceColor.WHITE);
        Piece wP3 = new Pawn(g, ChessUti.getSquare("B3"),ChessPieceColor.WHITE);
        Piece wP4 = new Pawn(g, ChessUti.getSquare("B4"),ChessPieceColor.WHITE);
        Piece wP5 = new Pawn(g, ChessUti.getSquare("B5"),ChessPieceColor.WHITE);
        Piece wP6 = new Pawn(g, ChessUti.getSquare("B6"),ChessPieceColor.WHITE);
        Piece wP7 = new Pawn(g, ChessUti.getSquare("B7"),ChessPieceColor.WHITE);
        Piece wP8 = new Pawn(g, ChessUti.getSquare("B8"),ChessPieceColor.WHITE);

        //BLACK CHESSPLAYER
        Piece bP1 = new Pawn(g, ChessUti.getSquare("G1"),ChessPieceColor.BLACK);
        Piece bP2 = new Pawn(g, ChessUti.getSquare("G2"),ChessPieceColor.BLACK);
        Piece bP3 = new Pawn(g, ChessUti.getSquare("G3"),ChessPieceColor.BLACK);
        Piece bP4 = new Pawn(g, ChessUti.getSquare("G4"),ChessPieceColor.BLACK);
        Piece bP5 = new Pawn(g, ChessUti.getSquare("G5"),ChessPieceColor.BLACK);
        Piece bP6 = new Pawn(g, ChessUti.getSquare("G6"),ChessPieceColor.BLACK);
        Piece bP7 = new Pawn(g, ChessUti.getSquare("G7"),ChessPieceColor.BLACK);
        Piece bP8 = new Pawn(g, ChessUti.getSquare("G8"),ChessPieceColor.BLACK);
        ChessUti.checkSquare(g,ChessUti.getSquare("B2"),wP1);





    }
}

