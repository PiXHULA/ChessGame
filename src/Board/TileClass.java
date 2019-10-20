package Board;

import javax.swing.*;
import java.awt.*;

public class TileClass extends JPanel {
    //Method for repainting square after movement
    public static void paintSquareAfterMovingPiece(Graphics g, Squares square) {
        if (square.getColor().equals("White")) {
            TileClass.paintWhiteSquare(g, square);
        }
        if (square.getColor().equals("Black")) {
            TileClass.paintBlackSquare(g, square);
        }
    }
    public static void paintWhiteSquare(Graphics g, Squares square){
        g.setColor(Color.white);
        g.fillRect(square.getCoordX(),square.getCoordY(),SquareSize.SQUARESIZE.getSize(),SquareSize.SQUARESIZE.getSize());
    }
    public static void paintBlackSquare(Graphics g, Squares square){
        g.setColor(Color.black);
        g.fillRect(square.getCoordX(),square.getCoordY(),SquareSize.SQUARESIZE.getSize(),SquareSize.SQUARESIZE.getSize());
    }

    //Methods for creating the board
    public void paintWhiteSquare(Graphics g, int coordX, int coordY, int sizeX, int sizeY){
        g.setColor(Color.white);
        g.fillRect(coordX,coordY,sizeX,sizeY);
    }
    public void paintBlackSquare(Graphics g, int coordX, int coordY, int sizeX, int sizeY){
        g.setColor(Color.black);
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
