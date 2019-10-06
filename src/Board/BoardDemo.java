package Board;

import javax.swing.*;

public class BoardDemo extends JFrame {
    public BoardDemo(){
        add(new Board());
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}