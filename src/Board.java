import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {
    public Board(){
        setName("Schackspel");
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(BoardSize.BOARDSIZE.getSizeX(),BoardSize.BOARDSIZE.getSizeY()));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //FIRST ROW
        g.setColor(Color.black);
        g.fillRect(Squares.A1.getCoordX(),Squares.A1.getCoordY(),BoardSize.BOARDSIZE.getSizeX() / 8,BoardSize.BOARDSIZE.getSizeY() / 8);
        g.setColor(Color.gray);
        g.fillRect(Squares.A2.getCoordX(),Squares.A2.getCoordY(),BoardSize.BOARDSIZE.getSizeX() / 8,BoardSize.BOARDSIZE.getSizeY() / 8);
        g.setColor(Color.black);
        g.fillRect(Squares.A3.getCoordX(),Squares.A3.getCoordY(),BoardSize.BOARDSIZE.getSizeX() / 8,BoardSize.BOARDSIZE.getSizeY() / 8);
        g.setColor(Color.gray);
        g.fillRect(Squares.A4.getCoordX(),Squares.A4.getCoordY(),BoardSize.BOARDSIZE.getSizeX() / 8,BoardSize.BOARDSIZE.getSizeY() / 8);
        g.setColor(Color.black);
        g.fillRect(Squares.A5.getCoordX(),Squares.A5.getCoordY(),BoardSize.BOARDSIZE.getSizeX() / 8,BoardSize.BOARDSIZE.getSizeY() / 8);
        g.setColor(Color.gray);
        g.fillRect(Squares.A6.getCoordX(),Squares.A6.getCoordY(),BoardSize.BOARDSIZE.getSizeX() / 8,BoardSize.BOARDSIZE.getSizeY() / 8);
        g.setColor(Color.black);
        g.fillRect(Squares.A7.getCoordX(),Squares.A7.getCoordY(),BoardSize.BOARDSIZE.getSizeX() / 8,BoardSize.BOARDSIZE.getSizeY() / 8);
        g.setColor(Color.gray);
        g.fillRect(Squares.A8.getCoordX(),Squares.A8.getCoordY(),BoardSize.BOARDSIZE.getSizeX() / 8,BoardSize.BOARDSIZE.getSizeY() / 8);

        //SECOND ROW
        g.setColor(Color.gray);
        g.fillRect(Squares.B1.getCoordX(),Squares.B1.getCoordY(),BoardSize.BOARDSIZE.getSizeX() / 8,BoardSize.BOARDSIZE.getSizeY() / 8);
        g.setColor(Color.black);
        g.fillRect(Squares.B2.getCoordX(),Squares.B2.getCoordY(),BoardSize.BOARDSIZE.getSizeX() / 8,BoardSize.BOARDSIZE.getSizeY() / 8);
        g.setColor(Color.gray);
        g.fillRect(Squares.B3.getCoordX(),Squares.B3.getCoordY(),BoardSize.BOARDSIZE.getSizeX() / 8,BoardSize.BOARDSIZE.getSizeY() / 8);
        g.setColor(Color.black);
        g.fillRect(Squares.B4.getCoordX(),Squares.B4.getCoordY(),BoardSize.BOARDSIZE.getSizeX() / 8,BoardSize.BOARDSIZE.getSizeY() / 8);
        g.setColor(Color.gray);
        g.fillRect(Squares.B5.getCoordX(),Squares.B5.getCoordY(),BoardSize.BOARDSIZE.getSizeX() / 8,BoardSize.BOARDSIZE.getSizeY() / 8);
        g.setColor(Color.black);
        g.fillRect(Squares.B6.getCoordX(),Squares.B8.getCoordY(),BoardSize.BOARDSIZE.getSizeX() / 8,BoardSize.BOARDSIZE.getSizeY() / 8);
        g.setColor(Color.gray);
        g.fillRect(Squares.B7.getCoordX(),Squares.B7.getCoordY(),BoardSize.BOARDSIZE.getSizeX() / 8,BoardSize.BOARDSIZE.getSizeY() / 8);
        g.setColor(Color.black);
        g.fillRect(Squares.B8.getCoordX(),Squares.B8.getCoordY(),BoardSize.BOARDSIZE.getSizeX() / 8,BoardSize.BOARDSIZE.getSizeY() / 8);

        //THIRD ROW
        g.setColor(Color.black);
        g.fillRect(Squares.C1.getCoordX(),Squares.C1.getCoordY(),BoardSize.BOARDSIZE.getSizeX() / 8,BoardSize.BOARDSIZE.getSizeY() / 8);
        g.setColor(Color.gray);
        g.fillRect(Squares.C2.getCoordX(),Squares.C2.getCoordY(),BoardSize.BOARDSIZE.getSizeX() / 8,BoardSize.BOARDSIZE.getSizeY() / 8);
        g.setColor(Color.black);
        g.fillRect(Squares.C3.getCoordX(),Squares.C3.getCoordY(),BoardSize.BOARDSIZE.getSizeX() / 8,BoardSize.BOARDSIZE.getSizeY() / 8);
        g.setColor(Color.gray);
        g.fillRect(Squares.C4.getCoordX(),Squares.C4.getCoordY(),BoardSize.BOARDSIZE.getSizeX() / 8,BoardSize.BOARDSIZE.getSizeY() / 8);
        g.setColor(Color.black);
        g.fillRect(Squares.C5.getCoordX(),Squares.C5.getCoordY(),BoardSize.BOARDSIZE.getSizeX() / 8,BoardSize.BOARDSIZE.getSizeY() / 8);
        g.setColor(Color.gray);
        g.fillRect(Squares.C6.getCoordX(),Squares.C8.getCoordY(),BoardSize.BOARDSIZE.getSizeX() / 8,BoardSize.BOARDSIZE.getSizeY() / 8);
        g.setColor(Color.black);
        g.fillRect(Squares.C7.getCoordX(),Squares.C7.getCoordY(),BoardSize.BOARDSIZE.getSizeX() / 8,BoardSize.BOARDSIZE.getSizeY() / 8);
        g.setColor(Color.gray);
        g.fillRect(Squares.C8.getCoordX(),Squares.C8.getCoordY(),BoardSize.BOARDSIZE.getSizeX() / 8,BoardSize.BOARDSIZE.getSizeY() / 8);

        //FORTH ROW
        g.setColor(Color.gray);
        g.fillRect(Squares.D1.getCoordX(),Squares.D1.getCoordY(),BoardSize.BOARDSIZE.getSizeX() / 8,BoardSize.BOARDSIZE.getSizeY() / 8);
        g.setColor(Color.black);
        g.fillRect(Squares.D2.getCoordX(),Squares.D2.getCoordY(),BoardSize.BOARDSIZE.getSizeX() / 8,BoardSize.BOARDSIZE.getSizeY() / 8);
        g.setColor(Color.gray);
        g.fillRect(Squares.D3.getCoordX(),Squares.D3.getCoordY(),BoardSize.BOARDSIZE.getSizeX() / 8,BoardSize.BOARDSIZE.getSizeY() / 8);
        g.setColor(Color.black);
        g.fillRect(Squares.D4.getCoordX(),Squares.D4.getCoordY(),BoardSize.BOARDSIZE.getSizeX() / 8,BoardSize.BOARDSIZE.getSizeY() / 8);
        g.setColor(Color.gray);
        g.fillRect(Squares.D5.getCoordX(),Squares.D5.getCoordY(),BoardSize.BOARDSIZE.getSizeX() / 8,BoardSize.BOARDSIZE.getSizeY() / 8);
        g.setColor(Color.black);
        g.fillRect(Squares.D6.getCoordX(),Squares.D8.getCoordY(),BoardSize.BOARDSIZE.getSizeX() / 8,BoardSize.BOARDSIZE.getSizeY() / 8);
        g.setColor(Color.gray);
        g.fillRect(Squares.D7.getCoordX(),Squares.D7.getCoordY(),BoardSize.BOARDSIZE.getSizeX() / 8,BoardSize.BOARDSIZE.getSizeY() / 8);
        g.setColor(Color.black);
        g.fillRect(Squares.D8.getCoordX(),Squares.D8.getCoordY(),BoardSize.BOARDSIZE.getSizeX() / 8,BoardSize.BOARDSIZE.getSizeY() / 8);

       //FIFTH ROW
        g.setColor(Color.black);
        g.fillRect(Squares.E1.getCoordX(),Squares.E1.getCoordY(),BoardSize.BOARDSIZE.getSizeX() / 8,BoardSize.BOARDSIZE.getSizeY() / 8);
        g.setColor(Color.gray);
        g.fillRect(Squares.E2.getCoordX(),Squares.E2.getCoordY(),BoardSize.BOARDSIZE.getSizeX() / 8,BoardSize.BOARDSIZE.getSizeY() / 8);
        g.setColor(Color.black);
        g.fillRect(Squares.E3.getCoordX(),Squares.E3.getCoordY(),BoardSize.BOARDSIZE.getSizeX() / 8,BoardSize.BOARDSIZE.getSizeY() / 8);
        g.setColor(Color.gray);
        g.fillRect(Squares.E4.getCoordX(),Squares.E4.getCoordY(),BoardSize.BOARDSIZE.getSizeX() / 8,BoardSize.BOARDSIZE.getSizeY() / 8);
        g.setColor(Color.black);
        g.fillRect(Squares.E5.getCoordX(),Squares.E5.getCoordY(),BoardSize.BOARDSIZE.getSizeX() / 8,BoardSize.BOARDSIZE.getSizeY() / 8);
        g.setColor(Color.gray);
        g.fillRect(Squares.E6.getCoordX(),Squares.E6.getCoordY(),BoardSize.BOARDSIZE.getSizeX() / 8,BoardSize.BOARDSIZE.getSizeY() / 8);
        g.setColor(Color.black);
        g.fillRect(Squares.E7.getCoordX(),Squares.E7.getCoordY(),BoardSize.BOARDSIZE.getSizeX() / 8,BoardSize.BOARDSIZE.getSizeY() / 8);
        g.setColor(Color.gray);
        g.fillRect(Squares.E8.getCoordX(),Squares.E8.getCoordY(),BoardSize.BOARDSIZE.getSizeX() / 8,BoardSize.BOARDSIZE.getSizeY() / 8);
        g.setColor(Color.black);

        //SIXTH ROW
        g.setColor(Color.gray);
        g.fillRect(Squares.F1.getCoordX(),Squares.F1.getCoordY(),BoardSize.BOARDSIZE.getSizeX() / 8,BoardSize.BOARDSIZE.getSizeY() / 8);
        g.setColor(Color.black);
        g.fillRect(Squares.F2.getCoordX(),Squares.F2.getCoordY(),BoardSize.BOARDSIZE.getSizeX() / 8,BoardSize.BOARDSIZE.getSizeY() / 8);
        g.setColor(Color.gray);
        g.fillRect(Squares.F3.getCoordX(),Squares.F3.getCoordY(),BoardSize.BOARDSIZE.getSizeX() / 8,BoardSize.BOARDSIZE.getSizeY() / 8);
        g.setColor(Color.black);
        g.fillRect(Squares.F4.getCoordX(),Squares.F4.getCoordY(),BoardSize.BOARDSIZE.getSizeX() / 8,BoardSize.BOARDSIZE.getSizeY() / 8);
        g.setColor(Color.gray);
        g.fillRect(Squares.F5.getCoordX(),Squares.F5.getCoordY(),BoardSize.BOARDSIZE.getSizeX() / 8,BoardSize.BOARDSIZE.getSizeY() / 8);
        g.setColor(Color.black);
        g.fillRect(Squares.F6.getCoordX(),Squares.F6.getCoordY(),BoardSize.BOARDSIZE.getSizeX() / 8,BoardSize.BOARDSIZE.getSizeY() / 8);
        g.setColor(Color.gray);
        g.fillRect(Squares.F7.getCoordX(),Squares.F7.getCoordY(),BoardSize.BOARDSIZE.getSizeX() / 8,BoardSize.BOARDSIZE.getSizeY() / 8);
        g.setColor(Color.black);
        g.fillRect(Squares.F8.getCoordX(),Squares.F8.getCoordY(),BoardSize.BOARDSIZE.getSizeX() / 8,BoardSize.BOARDSIZE.getSizeY() / 8);

        //SEVENTH ROW
        g.setColor(Color.black);
        g.fillRect(Squares.G1.getCoordX(),Squares.G1.getCoordY(),BoardSize.BOARDSIZE.getSizeX() / 8,BoardSize.BOARDSIZE.getSizeY() / 8);
        g.setColor(Color.gray);
        g.fillRect(Squares.G2.getCoordX(),Squares.G2.getCoordY(),BoardSize.BOARDSIZE.getSizeX() / 8,BoardSize.BOARDSIZE.getSizeY() / 8);
        g.setColor(Color.black);
        g.fillRect(Squares.G3.getCoordX(),Squares.G3.getCoordY(),BoardSize.BOARDSIZE.getSizeX() / 8,BoardSize.BOARDSIZE.getSizeY() / 8);
        g.setColor(Color.gray);
        g.fillRect(Squares.G4.getCoordX(),Squares.G4.getCoordY(),BoardSize.BOARDSIZE.getSizeX() / 8,BoardSize.BOARDSIZE.getSizeY() / 8);
        g.setColor(Color.black);
        g.fillRect(Squares.G5.getCoordX(),Squares.G5.getCoordY(),BoardSize.BOARDSIZE.getSizeX() / 8,BoardSize.BOARDSIZE.getSizeY() / 8);
        g.setColor(Color.gray);
        g.fillRect(Squares.G6.getCoordX(),Squares.G6.getCoordY(),BoardSize.BOARDSIZE.getSizeX() / 8,BoardSize.BOARDSIZE.getSizeY() / 8);
        g.setColor(Color.black);
        g.fillRect(Squares.G7.getCoordX(),Squares.G7.getCoordY(),BoardSize.BOARDSIZE.getSizeX() / 8,BoardSize.BOARDSIZE.getSizeY() / 8);
        g.setColor(Color.gray);
        g.fillRect(Squares.G8.getCoordX(),Squares.G8.getCoordY(),BoardSize.BOARDSIZE.getSizeX() / 8,BoardSize.BOARDSIZE.getSizeY() / 8);

        //EIGHTH ROW
        g.setColor(Color.gray);
        g.fillRect(Squares.H1.getCoordX(),Squares.H1.getCoordY(),BoardSize.BOARDSIZE.getSizeX() / 8,BoardSize.BOARDSIZE.getSizeY() / 8);
        g.setColor(Color.black);
        g.fillRect(Squares.H2.getCoordX(),Squares.H2.getCoordY(),BoardSize.BOARDSIZE.getSizeX() / 8,BoardSize.BOARDSIZE.getSizeY() / 8);
        g.setColor(Color.gray);
        g.fillRect(Squares.H3.getCoordX(),Squares.H3.getCoordY(),BoardSize.BOARDSIZE.getSizeX() / 8,BoardSize.BOARDSIZE.getSizeY() / 8);
        g.setColor(Color.black);
        g.fillRect(Squares.H4.getCoordX(),Squares.H4.getCoordY(),BoardSize.BOARDSIZE.getSizeX() / 8,BoardSize.BOARDSIZE.getSizeY() / 8);
        g.setColor(Color.gray);
        g.fillRect(Squares.H5.getCoordX(),Squares.H5.getCoordY(),BoardSize.BOARDSIZE.getSizeX() / 8,BoardSize.BOARDSIZE.getSizeY() / 8);
        g.setColor(Color.black);
        g.fillRect(Squares.H6.getCoordX(),Squares.H6.getCoordY(),BoardSize.BOARDSIZE.getSizeX() / 8,BoardSize.BOARDSIZE.getSizeY() / 8);
        g.setColor(Color.gray);
        g.fillRect(Squares.H7.getCoordX(),Squares.H7.getCoordY(),BoardSize.BOARDSIZE.getSizeX() / 8,BoardSize.BOARDSIZE.getSizeY() / 8);
        g.setColor(Color.black);
        g.fillRect(Squares.H8.getCoordX(),Squares.H8.getCoordY(),BoardSize.BOARDSIZE.getSizeX() / 8,BoardSize.BOARDSIZE.getSizeY() / 8);









    }
}
class BoardDemo extends JFrame{
    public BoardDemo(){
        add(new Board());
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
