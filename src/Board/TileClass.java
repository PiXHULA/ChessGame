package Board;

import LOGIC.Square;

import javax.swing.*;
import java.awt.*;

public class TileClass extends JPanel {
    //Method for repainting square after movement
    public static void paintSquareAfterMovingPiece(Graphics g, Square square) {
        if (square.getSquare().getColor().equals("White")) {
            TileClass.paintWhiteSquare(g, square);
        }
        if (square.getSquare().getColor().equals("Black")) {
            TileClass.paintBlackSquare(g, square);
        }
    }
    public static void paintWhiteSquare(Graphics g, Square square){
        g.setColor(new Color(255,228,196));
        g.fillRect(square.getSquare().getCoordX(),square.getSquare().getCoordY(),SquareSize.SQUARESIZE.getSize(),SquareSize.SQUARESIZE.getSize());
    }
    public static void paintBlackSquare(Graphics g, Square square){
        g.setColor(new Color(181,113,34));
        g.fillRect(square.getSquare().getCoordX(),square.getSquare().getCoordY(),SquareSize.SQUARESIZE.getSize(),SquareSize.SQUARESIZE.getSize());
    }

    //Methods for creating the board
    public void paintWhiteSquare(Graphics g, int coordX, int coordY, int sizeX, int sizeY){
        g.setColor(new Color(255,228,196));
        g.fillRect(coordX,coordY,sizeX,sizeY);
    }
    public void paintBlackSquare(Graphics g, int coordX, int coordY, int sizeX, int sizeY){
        g.setColor(new Color(181,113,34));
        g.fillRect(coordX,coordY,sizeX,sizeY);
    }

    //DRAW BOARD WITH A Double FOR-LOOP
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int startX = 0;
        int startY = 0;
        for(int i = 1; i <= 8; i++){
            for (int j = 1; j <= 8; j++){
                if (j == 1)
                    startX = 0;
                if ((i + j) % 2 == 1)
                    paintBlackSquare(g, startX, startY,
                            SquareSize.SQUARESIZE.getSize(), SquareSize.SQUARESIZE.getSize());
                else if ((i + j) % 2 == 0)
                    paintWhiteSquare(g, startX, startY,
                            SquareSize.SQUARESIZE.getSize(), SquareSize.SQUARESIZE.getSize());
                if (j == 8)
                    startY += SquareSize.SQUARESIZE.getSize();
                startX += SquareSize.SQUARESIZE.getSize();
            }
        }
    }

}
