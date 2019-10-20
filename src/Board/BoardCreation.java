package Board;

import javax.swing.*;

public class BoardCreation extends JFrame {
    public BoardCreation(){
        add(new Board());
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}