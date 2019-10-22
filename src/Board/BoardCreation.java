package Board;

import javax.swing.*;

public class BoardCreation extends JFrame {
    public BoardCreation(){
        add(new Board());
        setTitle("Chess");
        pack();
        setVisible(true);
        setLocation(SquareSize.SQUARESIZE.getSize() * 4, SquareSize.SQUARESIZE.getSize() / 2 );
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}