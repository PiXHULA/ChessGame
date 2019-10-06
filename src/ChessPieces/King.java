package ChessPieces;

import Board.SquareSize;

import java.awt.*;

public class King extends Piece {
    @Override
    public void paintWhitePiece(Graphics g, int coordX, int coordY) {
        g.setColor(Color.green);
        g.fillRect(coordX + 19,coordY + 19, SquareSize.SQUARESIZE.getSizeX() / 2
                ,SquareSize.SQUARESIZE.getSizeY() / 2);
        g.setColor(Color.red);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("K", coordX + 30, coordY + 45);
    }

    @Override
    public void paintBlackPiece(Graphics g, int coordX, int coordY) {
        g.setColor(Color.red);
        g.fillRect(coordX + 19,coordY + 19 , SquareSize.SQUARESIZE.getSizeX() / 2
                ,SquareSize.SQUARESIZE.getSizeY() / 2);
        g.setColor(Color.green);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Q", coordX + 30, coordY + 45);
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
