package ChessPieces;

import LOGIC.Movement;

import javax.swing.*;
import java.awt.*;

public abstract class Piece extends JPanel implements Movement {
    public static final Color white = new Color(255, 255, 255);
    public static final Color black = new Color(0, 0, 0);

    public abstract void paintWhitePiece(Graphics g, int coordX, int coordY);
    public abstract void paintBlackPiece(Graphics g, int coordX, int coordY);

}
