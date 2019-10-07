package ChessPieces;

import Board.SquareSize;
import Board.Squares;
import LOGIC.Movement;

import javax.swing.*;
import java.awt.*;

//BONDE
public class Pawn extends Piece {

    @Override
    public void paintWhitePiece(Graphics g, int coordX, int coordY){
        g.setColor(Color.black);
        g.drawRect(coordX + 10,coordY + 10, SquareSize.SQUARESIZE.getSizeX() - 20
                ,SquareSize.SQUARESIZE.getSizeY() - 20);
        g.setColor(Color.white);
        g.fillRect(coordX + 19,coordY + 19, SquareSize.SQUARESIZE.getSizeX() / 2
                ,SquareSize.SQUARESIZE.getSizeY() / 2);
        g.setColor(Color.black);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("P", coordX + 30, coordY + 45);
    }

    @Override
    public void paintBlackPiece(Graphics g, int coordX, int coordY){
        g.setColor(Color.white);
        g.drawRect(coordX + 10,coordY + 10, SquareSize.SQUARESIZE.getSizeX() - 20,
                SquareSize.SQUARESIZE.getSizeY() - 20);
        g.setColor(Color.black);
        g.fillRect(coordX + 19,coordY + 19 ,SquareSize.SQUARESIZE.getSizeX() / 2,
                SquareSize.SQUARESIZE.getSizeY() / 2);
        g.setColor(Color.white);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("P", coordX + 30, coordY + 45);
    }

    @Override
    public void showLocation() {

    }

    public void moveFromLocation(Graphics g, Squares from){
        g.clearRect(from.getCoordX() + 19,from.getCoordY() + 19, SquareSize.SQUARESIZE.getSizeX() / 2,
                SquareSize.SQUARESIZE.getSizeY() / 2);

        g.clearRect(from.getCoordX() + 10,from.getCoordY() + 10, SquareSize.SQUARESIZE.getSizeX() - 20,
                SquareSize.SQUARESIZE.getSizeY() - 20);

    }
    @Override
    public void movetoLocation(Graphics g, Squares from, Squares to) {
            moveFromLocation(g, from);
            g.setColor(Color.black);
            g.drawRect(to.getCoordX() + 10,to.getCoordY() + 10, SquareSize.SQUARESIZE.getSizeX() - 20
                    ,SquareSize.SQUARESIZE.getSizeY() - 20);
            g.setColor(Color.white);
            g.fillRect(to.getCoordX() + 19,to.getCoordY() + 19, SquareSize.SQUARESIZE.getSizeX() / 2
                    ,SquareSize.SQUARESIZE.getSizeY() / 2);
            g.setColor(Color.black);
            g.setFont(new Font("Arial", Font.BOLD, 20));
            g.drawString("P", to.getCoordX() + 30, to.getCoordY() + 45);

    }

    @Override
    public void showMovement() {

    }

}
