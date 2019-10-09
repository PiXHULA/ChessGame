package Board;

import ChessPieces.*;
import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {

    //CREATING THE BOARD WITH METHODS
    public static final Color white     = new Color(255, 255, 255);
    public static final Color black     = new Color(0, 0, 0);
    public void paintWhiteSquare(Graphics g, int coordX, int coordY, int sizeX, int sizeY){
        g.setColor(white);
        g.fillRect(coordX,coordY,sizeX,sizeY);
    }
    public void paintBlackSquare(Graphics g, int coordX, int coordY, int sizeX, int sizeY){
        g.setColor(black);
        g.fillRect(coordX,coordY,sizeX,sizeY);
    }

    public Board(){
        setName("CHESSGAME");
        setBackground(Color.gray);
        setPreferredSize(new Dimension(BoardSize.BOARDSIZE.getSizeX(), BoardSize.BOARDSIZE.getSizeY()));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        TileClass board = new TileClass();
        board.paintComponent(g);


        //WHITE CHESSPLAYER
        Pawn wP1 = new Pawn();
//        Piece wP2 = new Pawn();
//        Piece wP3 = new Pawn();
//        Piece wP4 = new Pawn();
//        Piece wP5 = new Pawn();
//        Piece wP6 = new Pawn();
//        Piece wP7 = new Pawn();
//        Piece wP8 = new Pawn();
//        Piece wB1 = new Bishop();
//        Piece wB2 = new Bishop();
//        Piece wKn1 = new Knight();
//        Piece wKn2 = new Knight();
//        Piece wR1 = new Rook();
//        Piece wR2 = new Rook();
//        Piece wQ1 = new Queen();
//        Piece wK1 = new King();
//
          wP1.paintWhitePiece(g, Squares.B1.getCoordX(),Squares.B1.getCoordY());
//        wP2.paintWhitePiece(g, Squares.B2.getCoordX(),Squares.B2.getCoordY());
//        wP3.paintWhitePiece(g, Squares.B3.getCoordX(),Squares.B3.getCoordY());
//        wP4.paintWhitePiece(g, Squares.B4.getCoordX(),Squares.B4.getCoordY());
//        wP5.paintWhitePiece(g, Squares.B5.getCoordX(),Squares.B5.getCoordY());
//        wP6.paintWhitePiece(g, Squares.B6.getCoordX(),Squares.B6.getCoordY());
//        wP7.paintWhitePiece(g, Squares.B7.getCoordX(),Squares.B7.getCoordY());
//        wP8.paintWhitePiece(g, Squares.B8.getCoordX(),Squares.B8.getCoordY());
//        wR1.paintWhitePiece(g, Squares.A1.getCoordX(),Squares.A1.getCoordY());
//        wR2.paintWhitePiece(g, Squares.A8.getCoordX(),Squares.A8.getCoordY());
//        wKn1.paintWhitePiece(g,Squares.A2.getCoordX(),Squares.A2.getCoordY());
//        wKn2.paintWhitePiece(g,Squares.A7.getCoordX(),Squares.A7.getCoordY());
//        wB1.paintWhitePiece(g,Squares.A3.getCoordX(),Squares.A3.getCoordY());
//        wB2.paintWhitePiece(g,Squares.A6.getCoordX(),Squares.A6.getCoordY());
//        wQ1.paintWhitePiece(g,Squares.A4.getCoordX(),Squares.A4.getCoordY());
//        wK1.paintWhitePiece(g,Squares.A5.getCoordX(),Squares.A5.getCoordY());

        //CLEARING THE PREVIOUS SQUARE BY PAINTING ANOTHER, WORKS ONLY WITH BLACK SQUARES. NEED A LOGIC FOR DRAWING THE
        //CORRECT COLOR DEPENDING ON ENUM.
        //ENUM LIST OF BLACK SQUARES ?
        //ENUM LIST OF WHITE SQUARES ?
        wP1.movetoLocation(g, Squares.B1, Squares.D2);
        wP1.movetoLocation(g, Squares.D2, Squares.D1);
        wP1.movetoLocation(g, Squares.D1, Squares.D4);
        wP1.movetoLocation(g, Squares.D4, Squares.E5);
        //BLACK CHESSPLAYER
//        Piece bP1 = new Pawn();
//        Piece bP2 = new Pawn();
//        Piece bP3 = new Pawn();
//        Piece bP4 = new Pawn();
//        Piece bP5 = new Pawn();
//        Piece bP6 = new Pawn();
//        Piece bP7 = new Pawn();
//        Piece bP8 = new Pawn();
//        Piece bB1 = new Bishop();
//        Piece bKn1 = new Knight();
//        Piece bR1 = new Rook();
//        Piece bQ1 = new Queen();
//        Piece bK1 = new King();

//        bP1.paintBlackPiece(g, Squares.G1.getCoordX(),Squares.G1.getCoordY());
//        bP2.paintBlackPiece(g, Squares.G2.getCoordX(),Squares.G2.getCoordY());
//        bP3.paintBlackPiece(g, Squares.G3.getCoordX(),Squares.G3.getCoordY());
//        bP4.paintBlackPiece(g, Squares.G4.getCoordX(),Squares.G4.getCoordY());
//        bP5.paintBlackPiece(g, Squares.G5.getCoordX(),Squares.G5.getCoordY());
//        bP6.paintBlackPiece(g, Squares.G6.getCoordX(),Squares.G6.getCoordY());
//        bP7.paintBlackPiece(g, Squares.G7.getCoordX(),Squares.G7.getCoordY());
//        bP8.paintBlackPiece(g, Squares.G8.getCoordX(),Squares.G8.getCoordY());
//        bR1.paintBlackPiece(g, Squares.H1.getCoordX(),Squares.H1.getCoordY());
//        bR1.paintBlackPiece(g, Squares.H8.getCoordX(),Squares.H8.getCoordY());
//        bKn1.paintBlackPiece(g,Squares.H2.getCoordX(),Squares.H2.getCoordY());
//        bKn1.paintBlackPiece(g,Squares.H7.getCoordX(),Squares.H7.getCoordY());
//        bB1.paintBlackPiece(g,Squares.H3.getCoordX(),Squares.H3.getCoordY());
//        bB1.paintBlackPiece(g,Squares.H6.getCoordX(),Squares.H6.getCoordY());
//        bK1.paintBlackPiece(g,Squares.H4.getCoordX(),Squares.H4.getCoordY());
//        bQ1.paintBlackPiece(g,Squares.H5.getCoordX(),Squares.H5.getCoordY());



    }
}

