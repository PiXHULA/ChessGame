package ChessPieces;

import Board.SquareSize;
import Board.Squares;
import LOGIC.Movement;

import javax.swing.*;
import java.awt.*;

//BONDE

public class Pawn extends Piece {
    public void paintWhiteSquare(Graphics g, int coordX, int coordY, int sizeX, int sizeY){
        g.setColor(white);
        g.fillRect(coordX,coordY,sizeX,sizeY);
    }
    public void paintBlackSquare(Graphics g, int coordX, int coordY, int sizeX, int sizeY){
        g.setColor(black);
        g.fillRect(coordX,coordY,sizeX,sizeY);
    }
    @Override
    public void paintWhitePiece(Graphics g, int coordX, int coordY){
        g.setColor(Color.black);
        g.drawRect(coordX + 10,coordY + 10, SquareSize.SQUARESIZE.getSize() - 20
                ,SquareSize.SQUARESIZE.getSize() - 20);
        g.setColor(Color.white);
        g.fillRect(coordX + 19,coordY + 19, SquareSize.SQUARESIZE.getSize() / 2
                ,SquareSize.SQUARESIZE.getSize() / 2);
        g.setColor(Color.black);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("P", coordX + 30, coordY + 45);
    }

    @Override
    public void paintBlackPiece(Graphics g, int coordX, int coordY){
        g.setColor(Color.white);
        g.drawRect(coordX + 10,coordY + 10, SquareSize.SQUARESIZE.getSize() - 20,
                SquareSize.SQUARESIZE.getSize() - 20);
        g.setColor(Color.black);
        g.fillRect(coordX + 19,coordY + 19 ,SquareSize.SQUARESIZE.getSize() / 2,
                SquareSize.SQUARESIZE.getSize() / 2);
        g.setColor(Color.white);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("P", coordX + 30, coordY + 45);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
    @Override
    public void showLocation() {

    }

    public void moveFromLocation(Graphics g, Squares from){
        paintBlackSquare(g, from.getCoordX(), from.getCoordY(),
                SquareSize.SQUARESIZE.getSize(), SquareSize.SQUARESIZE.getSize());

    }
    @Override
    public void movetoLocation(Graphics g, Squares from, Squares to) {
            g.clearRect(from.getCoordX(), from.getCoordY(),
                SquareSize.SQUARESIZE.getSize(), SquareSize.SQUARESIZE.getSize());
            g.setColor(Color.black);
            g.drawRect(to.getCoordX() + 10,to.getCoordY() + 10, SquareSize.SQUARESIZE.getSize() - 20
                    ,SquareSize.SQUARESIZE.getSize() - 20);
            g.setColor(Color.white);
            g.fillRect(to.getCoordX() + 19,to.getCoordY() + 19, SquareSize.SQUARESIZE.getSize() / 2
                    ,SquareSize.SQUARESIZE.getSize() / 2);
            g.setColor(Color.black);
            g.setFont(new Font("Arial", Font.BOLD, 20));
            g.drawString("P", to.getCoordX() + 30, to.getCoordY() + 45);
            paintBlackSquare(g, from.getCoordX(), from.getCoordY(),
                SquareSize.SQUARESIZE.getSize(), SquareSize.SQUARESIZE.getSize());

    }

    @Override
    public void showMovement() {

    }

}

