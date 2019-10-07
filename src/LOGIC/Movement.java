package LOGIC;

import Board.Squares;

import java.awt.*;

public interface Movement {
    void showLocation();
    void movetoLocation(Graphics g, Squares from, Squares to);
    void showMovement();
}
