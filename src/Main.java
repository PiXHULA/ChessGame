import Board.BoardCreation;
import Board.SquaresEnum;
import ChessPieces.ChessPieceColor;
import LOGIC.ChessUti;
import LOGIC.Square;

import javax.swing.*;

public class Main extends JFrame {
    public static void main(String[] args) {
        ChessUti.addSquareToList(ChessUti.squareList);
        BoardCreation b1 = new BoardCreation();
    }
}
