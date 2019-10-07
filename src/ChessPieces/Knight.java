package ChessPieces;

import Board.SquareSize;
import Board.Squares;

import java.awt.*;

//HÄST
public class Knight extends Piece {
    @Override
    public void paintWhitePiece(Graphics g, int coordX, int coordY) {
        g.setColor(Color.black);
        g.drawRect(coordX + 10,coordY + 10, SquareSize.SQUARESIZE.getSizeX() - 20
                ,SquareSize.SQUARESIZE.getSizeY() - 20);
        g.setColor(Color.white);
        g.fillRect(coordX + 19,coordY + 19, SquareSize.SQUARESIZE.getSizeX() / 2
                ,SquareSize.SQUARESIZE.getSizeY() / 2);
        g.setColor(Color.black);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Kn", coordX + 25, coordY + 45);
    }

    @Override
    public void paintBlackPiece(Graphics g, int coordX, int coordY) {
        g.setColor(Color.white);
        g.drawRect(coordX + 10,coordY + 10, SquareSize.SQUARESIZE.getSizeX() - 20
                ,SquareSize.SQUARESIZE.getSizeY() - 20);
        g.setColor(Color.black);
        g.fillRect(coordX + 19,coordY + 19 ,SquareSize.SQUARESIZE.getSizeX() / 2
                ,SquareSize.SQUARESIZE.getSizeY() / 2);
        g.setColor(Color.white);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Kn", coordX + 25, coordY + 45);
    }

    @Override
    public void showLocation() {

    }

    @Override
    public void movetoLocation(Graphics g, Squares from, Squares to) {

    }

    @Override
    public void showMovement() {

    }
}