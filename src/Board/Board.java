package Board;

import ChessPieces.*;
import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {

    public Board(){
        setName("CHESSGAME");
        setBackground(Color.white);
        setPreferredSize(new Dimension(BoardSize.BOARDSIZE.getSizeX()
                , BoardSize.BOARDSIZE.getSizeY()));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        TileClass board = new TileClass();
        board.paintComponent(g);

        //WHITE CHESSPLAYER
        System.out.println(Squares.emptySquares);
        Pawn wP1 = new Pawn(Squares.B1,ChessPieceColor.WHITE);
        System.out.println(Squares.emptySquares);
        System.out.println(Squares.occupiedSquares);



        wP1.paintPiece(g,wP1.getSquare(),wP1.getColor());

        wP1.moveToSquare(g,wP1.getColor(),wP1.getSquare(),Squares.A2);
        wP1.moveToSquare(g,wP1.getColor(),wP1.getSquare(),Squares.A5);
        System.out.println(Squares.emptySquares);
        System.out.println(Squares.occupiedSquares);



    }
}

