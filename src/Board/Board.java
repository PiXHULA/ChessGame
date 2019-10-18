package Board;

import ChessPieces.*;
import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {

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
        Pawn wP1 = new Pawn(Squares.B1,ChessPieceColor.WHITE);
        wP1.paintPiece(g,wP1.getSquare(),wP1.getCPC());
        wP1.movetoLocation(g,wP1.getCPC(), wP1.getSquare(),Squares.F5);
        wP1.movetoLocation(g,wP1.getCPC(), wP1.getSquare(),Squares.A1);
        wP1.movetoLocation(g,wP1.getCPC(), wP1.getSquare(),Squares.A6);
        wP1.movetoLocation(g,wP1.getCPC(), wP1.getSquare(),Squares.C8);

    }
}

