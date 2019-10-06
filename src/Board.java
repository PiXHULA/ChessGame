import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {
    public Board(){
        setName("Schackspel");
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(Squares.BOARDSIZE.getCoordX(),Squares.BOARDSIZE.getCoordY()));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //ODD SQUARES
        g.setColor(Color.black);
        g.fillRect(Squares.A3.getCoordX(),Squares.A3.getCoordY(),Squares.BOARDSIZE.getCoordX() / 8,Squares.BOARDSIZE.getCoordY() / 8);
        g.fillRect(Squares.A1.getCoordX(),Squares.A1.getCoordY(),Squares.BOARDSIZE.getCoordX() / 8,Squares.BOARDSIZE.getCoordY() / 8);
        g.fillRect(Squares.A5.getCoordX(),Squares.A5.getCoordY(),Squares.BOARDSIZE.getCoordX() / 8,Squares.BOARDSIZE.getCoordY() / 8);
        g.fillRect(Squares.A7.getCoordX(),Squares.A7.getCoordY(),Squares.BOARDSIZE.getCoordX() / 8,Squares.BOARDSIZE.getCoordY() / 8);

        g.fillRect(Squares.C1.getCoordX(),Squares.C1.getCoordY(),Squares.BOARDSIZE.getCoordX() / 8,Squares.BOARDSIZE.getCoordY() / 8);
        g.fillRect(Squares.C3.getCoordX(),Squares.C3.getCoordY(),Squares.BOARDSIZE.getCoordX() / 8,Squares.BOARDSIZE.getCoordY() / 8);
        g.fillRect(Squares.C5.getCoordX(),Squares.C5.getCoordY(),Squares.BOARDSIZE.getCoordX() / 8,Squares.BOARDSIZE.getCoordY() / 8);
        g.fillRect(Squares.C7.getCoordX(),Squares.C7.getCoordY(),Squares.BOARDSIZE.getCoordX() / 8,Squares.BOARDSIZE.getCoordY() / 8);

        g.fillRect(Squares.E1.getCoordX(),Squares.E1.getCoordY(),Squares.BOARDSIZE.getCoordX() / 8,Squares.BOARDSIZE.getCoordY() / 8);
        g.fillRect(Squares.E3.getCoordX(),Squares.E3.getCoordY(),Squares.BOARDSIZE.getCoordX() / 8,Squares.BOARDSIZE.getCoordY() / 8);
        g.fillRect(Squares.E5.getCoordX(),Squares.E5.getCoordY(),Squares.BOARDSIZE.getCoordX() / 8,Squares.BOARDSIZE.getCoordY() / 8);
        g.fillRect(Squares.E7.getCoordX(),Squares.E7.getCoordY(),Squares.BOARDSIZE.getCoordX() / 8,Squares.BOARDSIZE.getCoordY() / 8);

        g.fillRect(Squares.G1.getCoordX(),Squares.G1.getCoordY(),Squares.BOARDSIZE.getCoordX() / 8,Squares.BOARDSIZE.getCoordY() / 8);
        g.fillRect(Squares.G3.getCoordX(),Squares.G3.getCoordY(),Squares.BOARDSIZE.getCoordX() / 8,Squares.BOARDSIZE.getCoordY() / 8);
        g.fillRect(Squares.G5.getCoordX(),Squares.G5.getCoordY(),Squares.BOARDSIZE.getCoordX() / 8,Squares.BOARDSIZE.getCoordY() / 8);
        g.fillRect(Squares.G7.getCoordX(),Squares.G7.getCoordY(),Squares.BOARDSIZE.getCoordX() / 8,Squares.BOARDSIZE.getCoordY() / 8);

        //EVEN SQUARES
        g.fillRect(Squares.B2.getCoordX(),Squares.B2.getCoordY(),Squares.BOARDSIZE.getCoordX() / 8,Squares.BOARDSIZE.getCoordY() / 8);
        g.fillRect(Squares.B4.getCoordX(),Squares.B4.getCoordY(),Squares.BOARDSIZE.getCoordX() / 8,Squares.BOARDSIZE.getCoordY() / 8);
        g.fillRect(Squares.B6.getCoordX(),Squares.B6.getCoordY(),Squares.BOARDSIZE.getCoordX() / 8,Squares.BOARDSIZE.getCoordY() / 8);
        g.fillRect(Squares.B8.getCoordX(),Squares.B8.getCoordY(),Squares.BOARDSIZE.getCoordX() / 8,Squares.BOARDSIZE.getCoordY() / 8);

        g.fillRect(Squares.D2.getCoordX(),Squares.D2.getCoordY(),Squares.BOARDSIZE.getCoordX() / 8,Squares.BOARDSIZE.getCoordY() / 8);
        g.fillRect(Squares.D4.getCoordX(),Squares.D4.getCoordY(),Squares.BOARDSIZE.getCoordX() / 8,Squares.BOARDSIZE.getCoordY() / 8);
        g.fillRect(Squares.D6.getCoordX(),Squares.D8.getCoordY(),Squares.BOARDSIZE.getCoordX() / 8,Squares.BOARDSIZE.getCoordY() / 8);
        g.fillRect(Squares.D8.getCoordX(),Squares.D8.getCoordY(),Squares.BOARDSIZE.getCoordX() / 8,Squares.BOARDSIZE.getCoordY() / 8);

        g.fillRect(Squares.F2.getCoordX(),Squares.F2.getCoordY(),Squares.BOARDSIZE.getCoordX() / 8,Squares.BOARDSIZE.getCoordY() / 8);
        g.fillRect(Squares.F4.getCoordX(),Squares.F4.getCoordY(),Squares.BOARDSIZE.getCoordX() / 8,Squares.BOARDSIZE.getCoordY() / 8);
        g.fillRect(Squares.F6.getCoordX(),Squares.F6.getCoordY(),Squares.BOARDSIZE.getCoordX() / 8,Squares.BOARDSIZE.getCoordY() / 8);
        g.fillRect(Squares.F8.getCoordX(),Squares.F8.getCoordY(),Squares.BOARDSIZE.getCoordX() / 8,Squares.BOARDSIZE.getCoordY() / 8);

        g.fillRect(Squares.H2.getCoordX(),Squares.H2.getCoordY(),Squares.BOARDSIZE.getCoordX() / 8,Squares.BOARDSIZE.getCoordY() / 8);
        g.fillRect(Squares.H4.getCoordX(),Squares.H4.getCoordY(),Squares.BOARDSIZE.getCoordX() / 8,Squares.BOARDSIZE.getCoordY() / 8);
        g.fillRect(Squares.H6.getCoordX(),Squares.H6.getCoordY(),Squares.BOARDSIZE.getCoordX() / 8,Squares.BOARDSIZE.getCoordY() / 8);
        g.fillRect(Squares.H8.getCoordX(),Squares.H8.getCoordY(),Squares.BOARDSIZE.getCoordX() / 8,Squares.BOARDSIZE.getCoordY() / 8);
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
