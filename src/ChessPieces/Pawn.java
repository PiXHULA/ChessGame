package ChessPieces;

import Board.SquareSize;
import LOGIC.Movement;

import javax.swing.*;
import java.awt.*;

//BONDE
public class Pawn extends JPanel implements Movement {

    public static final Color white     = new Color(255, 255, 255);
    public static final Color black     = new Color(0, 0, 0);
    public void paintWhitePawn(Graphics g, int coordX, int coordY){
        g.setColor(white);
        g.fillRect(coordX / 2,coordY / 2, SquareSize.SQUARESIZE.getSizeX() / 2,SquareSize.SQUARESIZE.getSizeY() / 2);
    }
    public void paintBlackPawn(Graphics g, int coordX, int coordY){
        g.setColor(black);
        g.fillRect(coordX / 2,coordY / 2, SquareSize.SQUARESIZE.getSizeX() / 2,SquareSize.SQUARESIZE.getSizeY() / 2);
    }

    @Override
    public void showLocation() {

    }

    @Override
    public void movetoLocation() {

    }

    @Override
    public void showMovement() {

    }
}
