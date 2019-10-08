package Board;

import javax.swing.*;
import java.awt.*;

public class TileClass extends JPanel {

    public void paintWhiteSquare(Graphics g, int coordX, int coordY, int sizeX, int sizeY){
        g.setColor(Color.white);
        g.fillRect(coordX,coordY,sizeX,sizeY);
    }
    public void paintBlackSquare(Graphics g, int coordX, int coordY, int sizeX, int sizeY){
        g.setColor(Color.black);
        g.fillRect(coordX,coordY,sizeX,sizeY);
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for(int i = 1; i <= 8; i++){
            for (int j = 1; j <= 8; j++){
                if (i * j % 2 == 1)
                    paintBlackSquare(g, i * SquareSize.SQUARESIZE.getSizeX(), j * SquareSize.SQUARESIZE.getSizeY(),
                            SquareSize.SQUARESIZE.getSizeX(), SquareSize.SQUARESIZE.getSizeY());
                if (i * j % 2 == 0){
                    paintWhiteSquare(g, i * SquareSize.SQUARESIZE.getSizeX(), j * SquareSize.SQUARESIZE.getSizeY(),
                            SquareSize.SQUARESIZE.getSizeX(), SquareSize.SQUARESIZE.getSizeY());
                }
            }
        }
    }

    /*
    //Skapa tiles med Squares storlekar och måla upp?

    public void paintWhiteSquare(Graphics g, int coordX, int coordY, int sizeX, int sizeY){
        g.setColor(white);
        g.fillRect(coordX,coordY,sizeX,sizeY);
    }
    public void paintBlackSquare(Graphics g, int coordX, int coordY, int sizeX, int sizeY){
        g.setColor(black);
        g.fillRect(coordX,coordY,sizeX,sizeY);
    }
    paintBlackSquare(g, Squares.A1.getCoordX(),Squares.A1.getCoordY(),SquareSize.SQUARESIZE.getSizeX(),SquareSize.SQUARESIZE.getSizeY());
    paintWhiteSquare(g, Squares.A2.getCoordX(),Squares.A2.getCoordY(),SquareSize.SQUARESIZE.getSizeX(),SquareSize.SQUARESIZE.getSizeY());
    paintBlackSquare(g, Squares.A3.getCoordX(),Squares.A3.getCoordY(),SquareSize.SQUARESIZE.getSizeX(),SquareSize.SQUARESIZE.getSizeY());
    paintWhiteSquare(g, Squares.A4.getCoordX(),Squares.A4.getCoordY(),SquareSize.SQUARESIZE.getSizeX(),SquareSize.SQUARESIZE.getSizeY());
    paintBlackSquare(g, Squares.A5.getCoordX(),Squares.A5.getCoordY(),SquareSize.SQUARESIZE.getSizeX(),SquareSize.SQUARESIZE.getSizeY());
    paintWhiteSquare(g, Squares.A6.getCoordX(),Squares.A6.getCoordY(),SquareSize.SQUARESIZE.getSizeX(),SquareSize.SQUARESIZE.getSizeY());
    paintBlackSquare(g, Squares.A7.getCoordX(),Squares.A7.getCoordY(),SquareSize.SQUARESIZE.getSizeX(),SquareSize.SQUARESIZE.getSizeY());
    paintWhiteSquare(g, Squares.A8.getCoordX(),Squares.A8.getCoordY(),SquareSize.SQUARESIZE.getSizeX(),SquareSize.SQUARESIZE.getSizeY());

    //SECOND ROW
    paintWhiteSquare(g, Squares.B1.getCoordX(),Squares.B1.getCoordY(),SquareSize.SQUARESIZE.getSizeX(),SquareSize.SQUARESIZE.getSizeY());
    paintBlackSquare(g, Squares.B2.getCoordX(),Squares.B2.getCoordY(),SquareSize.SQUARESIZE.getSizeX(),SquareSize.SQUARESIZE.getSizeY());
    paintWhiteSquare(g, Squares.B3.getCoordX(),Squares.B3.getCoordY(),SquareSize.SQUARESIZE.getSizeX(),SquareSize.SQUARESIZE.getSizeY());
    paintBlackSquare(g, Squares.B4.getCoordX(),Squares.B4.getCoordY(),SquareSize.SQUARESIZE.getSizeX(),SquareSize.SQUARESIZE.getSizeY());
    paintWhiteSquare(g, Squares.B5.getCoordX(),Squares.B5.getCoordY(),SquareSize.SQUARESIZE.getSizeX(),SquareSize.SQUARESIZE.getSizeY());
    paintBlackSquare(g, Squares.B6.getCoordX(),Squares.B6.getCoordY(),SquareSize.SQUARESIZE.getSizeX(),SquareSize.SQUARESIZE.getSizeY());
    paintWhiteSquare(g, Squares.B7.getCoordX(),Squares.B7.getCoordY(),SquareSize.SQUARESIZE.getSizeX(),SquareSize.SQUARESIZE.getSizeY());
    paintBlackSquare(g, Squares.B8.getCoordX(),Squares.B8.getCoordY(),SquareSize.SQUARESIZE.getSizeX(),SquareSize.SQUARESIZE.getSizeY());

    //THIRD ROW
    paintBlackSquare(g, Squares.C1.getCoordX(),Squares.C1.getCoordY(),SquareSize.SQUARESIZE.getSizeX(),SquareSize.SQUARESIZE.getSizeY());
    paintWhiteSquare(g, Squares.C2.getCoordX(),Squares.C2.getCoordY(),SquareSize.SQUARESIZE.getSizeX(),SquareSize.SQUARESIZE.getSizeY());
    paintBlackSquare(g, Squares.C3.getCoordX(),Squares.C3.getCoordY(),SquareSize.SQUARESIZE.getSizeX(),SquareSize.SQUARESIZE.getSizeY());
    paintWhiteSquare(g, Squares.C4.getCoordX(),Squares.C4.getCoordY(),SquareSize.SQUARESIZE.getSizeX(),SquareSize.SQUARESIZE.getSizeY());
    paintBlackSquare(g, Squares.C5.getCoordX(),Squares.C5.getCoordY(),SquareSize.SQUARESIZE.getSizeX(),SquareSize.SQUARESIZE.getSizeY());
    paintWhiteSquare(g, Squares.C6.getCoordX(),Squares.C6.getCoordY(),SquareSize.SQUARESIZE.getSizeX(),SquareSize.SQUARESIZE.getSizeY());
    paintBlackSquare(g, Squares.C7.getCoordX(),Squares.C7.getCoordY(),SquareSize.SQUARESIZE.getSizeX(),SquareSize.SQUARESIZE.getSizeY());
    paintWhiteSquare(g, Squares.C8.getCoordX(),Squares.C8.getCoordY(),SquareSize.SQUARESIZE.getSizeX(),SquareSize.SQUARESIZE.getSizeY());

    //FORTH ROW
    paintWhiteSquare(g, Squares.D1.getCoordX(),Squares.D1.getCoordY(),SquareSize.SQUARESIZE.getSizeX(),SquareSize.SQUARESIZE.getSizeY());
    paintBlackSquare(g, Squares.D2.getCoordX(),Squares.D2.getCoordY(),SquareSize.SQUARESIZE.getSizeX(),SquareSize.SQUARESIZE.getSizeY());
    paintWhiteSquare(g, Squares.D3.getCoordX(),Squares.D3.getCoordY(),SquareSize.SQUARESIZE.getSizeX(),SquareSize.SQUARESIZE.getSizeY());
    paintBlackSquare(g, Squares.D4.getCoordX(),Squares.D4.getCoordY(),SquareSize.SQUARESIZE.getSizeX(),SquareSize.SQUARESIZE.getSizeY());
    paintWhiteSquare(g, Squares.D5.getCoordX(),Squares.D5.getCoordY(),SquareSize.SQUARESIZE.getSizeX(),SquareSize.SQUARESIZE.getSizeY());
    paintBlackSquare(g, Squares.D6.getCoordX(),Squares.D6.getCoordY(),SquareSize.SQUARESIZE.getSizeX(),SquareSize.SQUARESIZE.getSizeY());
    paintWhiteSquare(g, Squares.D7.getCoordX(),Squares.D7.getCoordY(),SquareSize.SQUARESIZE.getSizeX(),SquareSize.SQUARESIZE.getSizeY());
    paintBlackSquare(g, Squares.D8.getCoordX(),Squares.D8.getCoordY(),SquareSize.SQUARESIZE.getSizeX(),SquareSize.SQUARESIZE.getSizeY());

    //FIFTH ROW
    paintBlackSquare(g, Squares.E1.getCoordX(),Squares.E1.getCoordY(),SquareSize.SQUARESIZE.getSizeX(),SquareSize.SQUARESIZE.getSizeY());
    paintWhiteSquare(g, Squares.E2.getCoordX(),Squares.E2.getCoordY(),SquareSize.SQUARESIZE.getSizeX(),SquareSize.SQUARESIZE.getSizeY());
    paintBlackSquare(g, Squares.E3.getCoordX(),Squares.E3.getCoordY(),SquareSize.SQUARESIZE.getSizeX(),SquareSize.SQUARESIZE.getSizeY());
    paintWhiteSquare(g, Squares.E4.getCoordX(),Squares.E4.getCoordY(),SquareSize.SQUARESIZE.getSizeX(),SquareSize.SQUARESIZE.getSizeY());
    paintBlackSquare(g, Squares.E5.getCoordX(),Squares.E5.getCoordY(),SquareSize.SQUARESIZE.getSizeX(),SquareSize.SQUARESIZE.getSizeY());
    paintWhiteSquare(g, Squares.E6.getCoordX(),Squares.E6.getCoordY(),SquareSize.SQUARESIZE.getSizeX(),SquareSize.SQUARESIZE.getSizeY());
    paintBlackSquare(g, Squares.E7.getCoordX(),Squares.E7.getCoordY(),SquareSize.SQUARESIZE.getSizeX(),SquareSize.SQUARESIZE.getSizeY());
    paintWhiteSquare(g, Squares.E8.getCoordX(),Squares.E8.getCoordY(),SquareSize.SQUARESIZE.getSizeX(),SquareSize.SQUARESIZE.getSizeY());

    //SIXTH ROW
    paintWhiteSquare(g, Squares.F1.getCoordX(),Squares.F1.getCoordY(),SquareSize.SQUARESIZE.getSizeX(),SquareSize.SQUARESIZE.getSizeY());
    paintBlackSquare(g, Squares.F2.getCoordX(),Squares.F2.getCoordY(),SquareSize.SQUARESIZE.getSizeX(),SquareSize.SQUARESIZE.getSizeY());
    paintWhiteSquare(g, Squares.F3.getCoordX(),Squares.F3.getCoordY(),SquareSize.SQUARESIZE.getSizeX(),SquareSize.SQUARESIZE.getSizeY());
    paintBlackSquare(g, Squares.F4.getCoordX(),Squares.F4.getCoordY(),SquareSize.SQUARESIZE.getSizeX(),SquareSize.SQUARESIZE.getSizeY());
    paintWhiteSquare(g, Squares.F5.getCoordX(),Squares.F5.getCoordY(),SquareSize.SQUARESIZE.getSizeX(),SquareSize.SQUARESIZE.getSizeY());
    paintBlackSquare(g, Squares.F6.getCoordX(),Squares.F6.getCoordY(),SquareSize.SQUARESIZE.getSizeX(),SquareSize.SQUARESIZE.getSizeY());
    paintWhiteSquare(g, Squares.F7.getCoordX(),Squares.F7.getCoordY(),SquareSize.SQUARESIZE.getSizeX(),SquareSize.SQUARESIZE.getSizeY());
    paintBlackSquare(g, Squares.F8.getCoordX(),Squares.F8.getCoordY(),SquareSize.SQUARESIZE.getSizeX(),SquareSize.SQUARESIZE.getSizeY());

    //SEVENTH ROW
    paintBlackSquare(g, Squares.G1.getCoordX(),Squares.G1.getCoordY(),SquareSize.SQUARESIZE.getSizeX(),SquareSize.SQUARESIZE.getSizeY());
    paintWhiteSquare(g, Squares.G2.getCoordX(),Squares.G2.getCoordY(),SquareSize.SQUARESIZE.getSizeX(),SquareSize.SQUARESIZE.getSizeY());
    paintBlackSquare(g, Squares.G3.getCoordX(),Squares.G3.getCoordY(),SquareSize.SQUARESIZE.getSizeX(),SquareSize.SQUARESIZE.getSizeY());
    paintWhiteSquare(g, Squares.G4.getCoordX(),Squares.G4.getCoordY(),SquareSize.SQUARESIZE.getSizeX(),SquareSize.SQUARESIZE.getSizeY());
    paintBlackSquare(g, Squares.G5.getCoordX(),Squares.G5.getCoordY(),SquareSize.SQUARESIZE.getSizeX(),SquareSize.SQUARESIZE.getSizeY());
    paintWhiteSquare(g, Squares.G6.getCoordX(),Squares.G6.getCoordY(),SquareSize.SQUARESIZE.getSizeX(),SquareSize.SQUARESIZE.getSizeY());
    paintBlackSquare(g, Squares.G7.getCoordX(),Squares.G7.getCoordY(),SquareSize.SQUARESIZE.getSizeX(),SquareSize.SQUARESIZE.getSizeY());
    paintWhiteSquare(g, Squares.G8.getCoordX(),Squares.G8.getCoordY(),SquareSize.SQUARESIZE.getSizeX(),SquareSize.SQUARESIZE.getSizeY());

    //EIGHTH ROW
    paintWhiteSquare(g, Squares.H1.getCoordX(),Squares.H1.getCoordY(),SquareSize.SQUARESIZE.getSizeX(),SquareSize.SQUARESIZE.getSizeY());
    paintBlackSquare(g, Squares.H2.getCoordX(),Squares.H2.getCoordY(),SquareSize.SQUARESIZE.getSizeX(),SquareSize.SQUARESIZE.getSizeY());
    paintWhiteSquare(g, Squares.H3.getCoordX(),Squares.H3.getCoordY(),SquareSize.SQUARESIZE.getSizeX(),SquareSize.SQUARESIZE.getSizeY());
    paintBlackSquare(g, Squares.H4.getCoordX(),Squares.H4.getCoordY(),SquareSize.SQUARESIZE.getSizeX(),SquareSize.SQUARESIZE.getSizeY());
    paintWhiteSquare(g, Squares.H5.getCoordX(),Squares.H5.getCoordY(),SquareSize.SQUARESIZE.getSizeX(),SquareSize.SQUARESIZE.getSizeY());
    paintBlackSquare(g, Squares.H6.getCoordX(),Squares.H6.getCoordY(),SquareSize.SQUARESIZE.getSizeX(),SquareSize.SQUARESIZE.getSizeY());
    paintWhiteSquare(g, Squares.H7.getCoordX(),Squares.H7.getCoordY(),SquareSize.SQUARESIZE.getSizeX(),SquareSize.SQUARESIZE.getSizeY());
    paintBlackSquare(g, Squares.H8.getCoordX(),Squares.H8.getCoordY(),SquareSize.SQUARESIZE.getSizeX(),SquareSize.SQUARESIZE.getSizeY());

     */
}
